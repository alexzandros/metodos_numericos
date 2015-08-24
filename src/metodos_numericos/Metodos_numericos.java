package metodos_numericos;

/**
 *
 * @author Carlos Rojas
 */
public class Metodos_numericos {

    public static void main(String[] args) {
        // TODO code application logic here
        double [] coefs = {2,3,1}; 
        
        /****************************************************
        * Lo coeficientes {2,3,1} representan el polinomio  *
        *                   x^2 + 3x + 2                    *
        * Ya que para hacer más facil el algoritmo de      *
        * Calcular el valor numérico de una expresión       *
        * polinomial se asoció el sub-índice del array      *
        * de coeficientes con el grado del término          *
        * respectivo                                        *
        *                                                   *
        ****************************************************/

        Polinomio miPoli = new Polinomio(2, coefs);
        Solver solucion = new Solver(miPoli, 1e-10, -8);
        
    }
    
}
