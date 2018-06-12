package Integrales;

import general.Funcion;
import general.dato;
import java.awt.Color;
import java.util.ArrayList;
import org.jfree.chart.axis.NumberAxis;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.VectorRenderer;
import org.jfree.data.xy.VectorSeries;
import org.jfree.data.xy.VectorSeriesCollection;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author Onder francisco
 */

public class GraficarI {
    JFreeChart grafica;
    public XYSeriesCollection puntos=new XYSeriesCollection();
    int contador;
    public GraficarI(String name) {
        
        grafica=ChartFactory.createXYLineChart(name, "x", "y", puntos, PlotOrientation.VERTICAL, true, true, true);
          XYPlot xyplot = (XYPlot) grafica.getPlot();
           xyplot.setBackgroundPaint( Color.white );
           xyplot.setDomainGridlinePaint( Color.BLACK );
           xyplot.setRangeGridlinePaint( Color.BLACK );   
    }
    
    
  
    public void agregarGrafica(String id, ArrayList<dato> Lista) {
        
        
        
       XYSeries serie = new XYSeries("("+contador+")"+id);
        
        try{
             
            for(int i=0;i<Lista.size();i++){
                
                serie.add(Lista.get(i).x,Lista.get(i).y);
                
                
            }
            
        }catch(Exception e){}
        
        puntos.addSeries(serie);
        contador++;
    }
  
    public void BorrarGrafica() {
        puntos.removeAllSeries();
    }

    public JPanel obtenerGrafica() {
        return new ChartPanel(grafica);
    }
}
