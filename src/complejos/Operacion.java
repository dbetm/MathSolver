package complejos;
import java.lang.Math;
import java.util.ArrayList;
/**
 * @author david
 * Esta clase contiene las operaciones básicas, cada una recibe dos números
 * complejos con los que se va a operar, y retorna la instancia de un número
 * complejo que representa el resultado.
 */

public class Operacion {
    
    // ============== SUMA
    public static Complejo sumar(Complejo A, Complejo B) {
        // Atributos a calcular para contruir el número complejo resultado
        float resReal, resImaginario;
        
        // Se hacen los cálculos, en este caso la suma => (x1+x2) + i(y1+y2)
        resReal = A.getParteReal() + B.getParteReal();
        resImaginario = A.getParteImaginaria() + B.getParteImaginaria();
        
        // Se retorna un objeto Complejo.
        return new Complejo(resReal, resImaginario);
    }
    
    // ============== RESTA => (x1-x2) + i(y1-y2)
    public static Complejo restar(Complejo A, Complejo B) {
        float resReal, resImaginario;
        
        resReal = A.getParteReal() - B.getParteReal();
        resImaginario = A.getParteImaginaria() - B.getParteImaginaria();
        
        return new Complejo(resReal, resImaginario);
    }
    
    // ============== MULTIPLICACIÓN => (x1x2 - y1y2) + i(x1y2 - x2y1)
    public static Complejo multiplicar(Complejo A, Complejo B) {
        float resReal, resImaginario;
        
        resReal = A.getParteReal() * B.getParteReal() - 
                (A.getParteImaginaria() * B.getParteImaginaria());
        
        resImaginario = (A.getParteReal() * B.getParteImaginaria()) + 
                (B.getParteReal() * A.getParteImaginaria());
        
        return new Complejo(resReal, resImaginario);
    }
    
    // ============== DIVISIÓN => [ (x1x2 + y1y2) / (x2^2 + y2^2) ] +  
        // i [ (x2y1 - x1y2) / (x2^2 + y2^2) ]
    public static Complejo dividir(Complejo A, Complejo B) {
        float resReal, resImaginario, denominador;
        
        denominador = (float)Math.pow(B.getParteReal(), 2) + 
                (float)Math.pow(B.getParteImaginaria(), 2);
        
        resReal = (A.getParteReal() * B.getParteReal()) + 
                (A.getParteImaginaria() * B.getParteImaginaria());
        resReal /= denominador;
        
        resImaginario = (B.getParteReal() * A.getParteImaginaria()) - 
                (A.getParteReal() * B.getParteImaginaria());
        
        resImaginario /= denominador;
        
        return new Complejo(resReal, resImaginario);
    }
    
    // ============== POTENCIA, se usa la fórmula de Moivre.
    public static Complejo potenciar(Complejo complejo, int exp) {
        float angulo = complejo.getAngulo() * exp;
        float modulo = (float)Math.pow(complejo.getModulo(),exp);
        StringToReZImZ separador = new StringToReZImZ();
        float[] parOrdenado = new float[2];
     
        String formaTri = modulo+"(cos("+angulo+")+isen("+angulo+"))";
        System.out.println("\nForma trigonométrica: " + formaTri);
        String formaAlgebraica = Convertidor.deTrigonometricaAAlgebraica(formaTri);
        System.out.println("Fase 1");
        parOrdenado = separador.Separar(formaAlgebraica);
        
        return new Complejo(parOrdenado[0], parOrdenado[1]);
    }
    
    // ============== RAÍCES
    public static ArrayList<Complejo> sacarRaices(Complejo complejo, int n) {
//        System.out.println("Complejo es: " + Operacion.mostrarNumero(complejo));
//        System.out.println("N es: " + n);
        // Para guardar las raíces en Strings de la forma algebraica
        ArrayList<String> strRaices = new ArrayList<>();
        // Para guardar la raíces en objetos "Complejo"
        ArrayList<Complejo> resultado = new ArrayList<>();
        // Guardar los ángulos
        ArrayList<Float> angulos = new ArrayList<>();
        Complejo c;
        float angulo, modulo;
        String formaTri, formaAlgebraica;
        float[] parOrdenado = new float[2];
        StringToReZImZ separacion;
        
        
        // Generamos la n-1 raíces y convertimos cada una a trigonométrica
        for(int k = 0;k < n;k++) { // 2pi = 360°
            angulo = (complejo.getAngulo() + (360f * k)) / n;
            modulo = (float)Math.pow(complejo.getModulo(), 1f / n); 
            //System.out.println("Ángulo es: " + angulo);
            angulos.add(angulo);
            formaTri = modulo+"(cos("+angulo+")+isen("+angulo+"))";
            System.out.println("Forma tri: " + formaTri); 
            formaAlgebraica = Convertidor.deTrigonometricaAAlgebraica(formaTri);
            System.out.println("Forma algebraica: " + formaAlgebraica);
            strRaices.add(formaAlgebraica);
        }
        
        // Generamos n-1 complejos : n-1 raíces almacenadas anteriormente
        for (int i = 0; i < strRaices.size(); i++) {
            separacion = new StringToReZImZ();
            //System.out.println("Str raíz: " + strRaiz);
            parOrdenado = separacion.Separar(strRaices.get(i));
            c = new Complejo(parOrdenado[0], parOrdenado[1]);
            c.setAngulo(angulos.get(i));
            resultado.add(c);
        }

        return resultado;  
    }
    
    // Genera una string con la representación de un número complejo => x + iy
    public static String mostrarNumero(Complejo complejo) {
        float real = complejo.getParteReal();
        float imaginaria = complejo.getParteImaginaria();
        
        String resultado = Float.toString(real);
        resultado += (imaginaria >= 0) ? " + i" : " - i";
        imaginaria = Math.abs(imaginaria);
        resultado += (imaginaria != 1) ? Float.toString(imaginaria) : "";
        
        return resultado;
    }
    
    // Genera una string con la forma trigonométrica de un complejo
    public static String mostrarFormaTrigonometrica(Complejo complejo) {
        String numero, r, angulo;
        r = String.format("%.2f", complejo.getModulo());
        angulo = String.format("%.2f", complejo.getAngulo());
        numero = r + "[cos(" + angulo + ") + isen(" + angulo + ")]";
        return numero;
    }
    
    // Genera una string con la forma exponencial o de Euler de un complejo
    public static String mostrarFormaExponencial(Complejo complejo) {
        String numero, r, angulo;
        r = String.format("%.2f", complejo.getModulo());
        angulo = String.format("%.2f", complejo.getAngulo());
        numero = r + "e^i(" + angulo + ")";  
        return numero;
    }
}
