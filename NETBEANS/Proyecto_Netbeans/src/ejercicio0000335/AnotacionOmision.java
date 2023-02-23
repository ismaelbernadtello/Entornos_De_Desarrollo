package ejercicio0000335;
/** Todos los comentarios deben estar escritos antes del método que quieras comentar
 * Este comentario corresponde a la clase DocumentarFuncion.
 * @version 1.0 origen de Classroom
 * @author Ismael Bernad Tello
 */

@SuppressWarnings("")
public class AnotacionOmision {
    /**
     * Función main, en esta realizamos llamada a la fnción sumar con 2 parámetros.
     * Primero a la función que está depreciada porque no permite decimales y luego a la versión nueva que admite decimales.
     * @author Ismael Bernad Tello
     */
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        
        System.out.println("Suma: " + calculadora.sumar(2, 3));
        System.out.println("Suma: " + calculadora.sumar((double)2, 3));
    }
}

class Calculadora {
    @Deprecated
    public int sumar(int a, int b){
        return a + b;
    }
    
    /**
     * Metodo sumar, suma dos numeros que le pasemos y devuelve el resultado.
     * @version 1.0 origen de Classroom
     * @author Ismael Bernad Tello
     * @param a double numero1
     * @param b double numero2
     * @return a + b
     */
    public double sumar(double a, double b){
        return a + b;
    }
}
