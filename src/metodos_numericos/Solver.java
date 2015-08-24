package metodos_numericos;

/**
 *
 * @author Carlos Rojas
 */
public class Solver {
    
    
    /*
        La clase Solver se encarga de recibir la función
        de la cual debe hallarse su raíz, y dependiendo del
        tipo de función encontrado, invocará el método correcto
        para encontrar su solución.
    
        En un comienzo solo está trabajando con polinomios, 
        pero se proyecta extenderla para que pueda solucionar 
        cualquier tipo de función
    */
    public Solver(Funcion funcion, double error, double vInicial)
    {
        if (Polinomio.class.isInstance(funcion)   )
        {
            resolverPolinomial((Polinomio)funcion, error, vInicial);
        }
    }
    
    private void resolverPolinomial(Polinomio funcion,double error, double vInicial){
        int grado = funcion.getGrado();
        double delta, fx, fpx, xIter;
        double []coefs = funcion.getCoeficientes();
        double [] coefsDerivada = new double[coefs.length - 1];
        for (int i = 0;i < grado;i++){
            coefsDerivada[i] = coefs[i + 1] * (i + 1);
        }
        fx = calcularValorNumericoPolinomio(vInicial, coefs);
        fpx = calcularValorNumericoPolinomio(vInicial, coefsDerivada);
        delta = fx / fpx;
        xIter = vInicial - delta;
        while (Math.abs(delta) >= error){
            fx = calcularValorNumericoPolinomio(xIter, coefs);
            fpx = calcularValorNumericoPolinomio(xIter, coefsDerivada);
            delta = fx / fpx;
            xIter -= delta;
        }
        System.out.println("La raíz del polinomio es" + xIter);
    }
    
    private double calcularValorNumericoPolinomio(double x, double [] coeficientes){
        double respuesta = 0.0;
        for (int i = 0;i < coeficientes.length; i++){
            respuesta += coeficientes[i] * Math.pow(x , i);
    }
        return respuesta;
    }
}
