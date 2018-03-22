package complejos;

/**
 * @author david
 * Esta clase modela un número complejo como par ordenado z = (x,y) = x + iy.
 * Contiene un método para obtener el conjugado de determinado número complejo.
 */

public class Complejo {
    // Atributos
    private float parteReal;
    private float parteImaginaria;
    // Genéricos.
    private float modulo;
    // Forma exponencial (Euler) y trigonométrica.
    private float angulo; // <= en grados
    
    // Constructor
    public Complejo(float parteReal, float parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
        System.out.println("Real: " + parteReal);
        System.out.println("Imaginaria: " + parteImaginaria);
        calcularAngulo();
        calcularModulo();
    }
    
    // Para obtener el conjugado de un número complejo 
    public static Complejo conjugar(Complejo A) {
        Complejo complejoConjugado = new Complejo(A.getParteReal(), - A.getParteImaginaria());
        return complejoConjugado;
    }
    
    // Para obtener su módulo
    private void calcularModulo() {
        modulo = (float)Math.pow(parteReal, 2) + 
                (float)Math.pow(parteImaginaria, 2);
        modulo = (float)Math.sqrt(modulo);
    }
    
    // Para calcular el angulo
    private void calcularAngulo() {
        if(parteReal == 0) {
            angulo = 90;
        }
        // NOTA: Hay casos donde falla
        else {
            angulo = (float)Math.toDegrees(Math.atan(parteImaginaria / parteReal));
        }
    }
    
    
    // Métodos de acceso
    public float getParteReal() {
        return parteReal;
    }

    public void setParteReal(float parteReal) {
        this.parteReal = parteReal;
    }

    public float getParteImaginaria() {
        return parteImaginaria;
    }

    public void setParteImaginaria(float parteImaginaria) {
        this.parteImaginaria = parteImaginaria;
    }
    
    public float getModulo() {
        return modulo;
    }
    
    public float getAngulo() {
        return angulo;
    }
    
    public void setAngulo(float angulo) {
        this.angulo = angulo;
    }
}
