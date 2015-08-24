package metodos_numericos;

/**
 *
 * @author Carlos Rojas
 */
public class Polinomio extends Funcion{

    /*
        Representación de una función polinómica de la forma
        anx^n + an-1x^(n-1) + ... + a0
    
    
    */
    
    private final int grado;
    private final double [] coeficientes;
    
    /**
     *
     * @param grado
     * @param coeficientes
     */
    public Polinomio(int grado, double[] coeficientes)
    {
        this.grado = grado;
        this.coeficientes = coeficientes;
    }

    public int getGrado() {
        return grado;
    }

    public double[] getCoeficientes() {
        return coeficientes;
    }
    
}
