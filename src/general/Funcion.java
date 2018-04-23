/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;

import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JPanel;
import jme.Expresion;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author wolfteinter
 */
public class Funcion {
    public String funcion;
    public Expresion exp;
    public XYSeriesCollection puntos;
    public JFreeChart grafica=ChartFactory.createXYLineChart(funcion, "y", "x", puntos, PlotOrientation.VERTICAL, true, true, true);
    
    
    public Funcion(String funcion) {
        
        this.funcion = funcion;
        //se crea una instancia de la clase Expresion la cual es la que nos permite evaluar una funcion 
        //No se puede setear la funcion que se necesita evaluar por lo que se debe de instanciar cad avez que se desea 
        //evaluar con otra funcion, esto cambi ala forama en la que se esta evaluando despues de hacer una resolucion 
        // se va a tener que buscar una nueva forma de hacer las cosas 
        exp = new Expresion(funcion);
        puntos=new XYSeriesCollection();
        //se crea una instancia de la clase Chart la cual nos permite graficar 
        
    }
    public void setFuncion(String funcion){
        // se setea la extresion que se va a evaluar
        this.funcion = funcion;
    }
    // esta es la funcion que realiza la evaluacion de una expresion matematica 
    // debe de ser llamada dentro de de un try catch
    // resuve como parametro un double ya que la expresion es global 
    public double Eval(double x) throws Exception {
        
        double r = Double.NaN;
        // esta es la parte en la que se dice que variable es con la qiue se va a evaluar y con que valor
        //exp.setDescripcion(funcion);
        
        
        exp.setVariable("x", x);
        //System.out.println(funcion);
        r = Double.parseDouble(exp.evaluar().toString());   
        return r;
    }
    // esta funcion al igual que eval evalua pero en este caso lo hace con dos variables y dos valores
    public double Eval(double x, double y) throws Exception {
        double r = Double.NaN;
        exp.setDescripcion(funcion);
        exp.setVariable("x", x);
        exp.setVariable("y", y);
        r = Double.parseDouble(exp.evaluar().toString());
        return r;
    }
    //Esta funcion realiza la integracion y pide los limites y un valor n el cual es la precicion entre mas grande mejor
    public double Integral(double limA, double limB, int n) {

        int i = 0;
        double x = limA;
        double resultado = 0;
        double DeltaX = (limB - limA) / n;
        
        try {

            while (i < n) {

                resultado = resultado + this.Eval(x) * DeltaX;
                x += DeltaX;
                i++;
            }
        } catch (Exception e) {}

        return resultado;

    }
    //Esta funcion realiza RungeKutta el ciual es la obtencion numerica de una ecuacion diferencial
    public ArrayList<dato> RungeKutta(double x1, double y,double h,double n){
        double k1,k2,k3,k4,Resultado;
        ArrayList<dato> Lista= new ArrayList<>();
        try{
            for(int i=0;i<=n;i++){
                dato d = new dato(x1,y);
                
                Lista.add(d);
                k1=Eval(x1,y);
                k2=Eval(x1+.5*h,y+.5*k1*h);
                k3=Eval(x1+.5*h,y+.5*k2*h);
                k4=Eval(x1+h,y+k3*h);
                Resultado=y+((k1+2*k2+2*k3+k4)*h/6);
                x1=x1+h;
                y=Resultado;
                
                
            }
            
        }catch(Exception e){}
        
        return Lista;
    }
    // Esta funcion grafica la funcion y los limites de la integral osea la integral en si
    //de la expresion que se setea o se crea
    public void graficar(double LimA,double LimB){
        //ArrayList<dato> Lista= new ArrayList<>();
        
        puntos.removeAllSeries();
        double i=LimA;
        double j=0;
        XYSeries serie = new XYSeries(funcion);
        XYSeries A = new XYSeries(String.valueOf(LimA)+funcion);
        XYSeries B = new XYSeries(String.valueOf(LimB)+funcion);
        
        
        
            while(i<=LimB){
                try{
                    serie.add(i,Eval(i));
                   // System.out.println(i+","+Eval(i));
                
                }catch(Exception e){}
                i+=.01;
            }
            
            try{
               while(j<Eval(LimA+2)){
                    A.add(LimA+2,j);
                   j+=.1;
               }
            }catch(Exception e){}
            j=0;
            try{
               while(j<Eval(LimB-2)){
                    B.add(LimB-2,j);
                   j+=.1;
               }
            }catch(Exception e){}
            
            
              
        System.out.println(serie.isEmpty());
        puntos.addSeries(serie);
        puntos.addSeries(A);
        puntos.addSeries(B);
        System.out.println("hola");
        grafica = ChartFactory.createXYLineChart(funcion, "y", "x", puntos, PlotOrientation.VERTICAL, true, true, true);
        //return new ChartPanel(grafica);
    }
    
    public JPanel graficarO(double LimA,double LimB){
        //ArrayList<dato> Lista= new ArrayList<>();
        double i=LimA;
        double j=0;
        XYSeries serie = new XYSeries(funcion);
        XYSeries A = new XYSeries(String.valueOf(LimA));
        XYSeries B = new XYSeries(String.valueOf(LimB));
        
        
        
            while(i<=LimB){
                try{
                    serie.add(i,Eval(i));
                    System.out.println(i+","+Eval(i));
                
                }catch(Exception e){}
                i+=.01;
            }
            
            try{
               while(j<Eval(LimA+2)){
                    A.add(LimA+2,j);
                   j+=.1;
               }
            }catch(Exception e){}
            j=0;
            try{
               while(j<Eval(LimB-2)){
                    B.add(LimB-2,j);
                   j+=.1;
               }
            }catch(Exception e){}
            
            
              
        
        
        puntos.addSeries(serie);
        puntos.addSeries(A);
        puntos.addSeries(B);
        return new ChartPanel(grafica);
    }
    ////Grafica una lista de cordenadas esta fincion es la que se usa en la graficacion de la solucion de la ecuacion 
    //diferencial 
    public void graficarE(ArrayList<dato> Lista){
        
       
        XYSeries serie = new XYSeries(funcion);
        
        try{
             
            for(int i=0;i<Lista.size();i++){
                
                serie.add(Lista.get(i).x,Lista.get(i).y);
                System.out.println(Lista.get(i).y+","+Lista.get(i).x);
                
            }
            
        }catch(Exception e){}
        
        puntos.addSeries(serie);
        
    }
    //Con esta funcion es la que igualamos un JPanel de una GUI y muestre las graficas 
    // es como el lienzo 
    public JPanel obtenerGrafica() {
        return new ChartPanel(grafica);
    }
    

    
    
    
    

}
