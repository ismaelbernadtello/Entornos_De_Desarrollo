package ejercicio0000353;
/** Todos los comentarios deben estar escritos antes del método que quieras comentar
 * Este comentario corresponde a la clase DocumentarFuncion.
 * @version 1.0 origen de Classroom
 * @author Ismael Bernad Tello
 */
public class DocumentarFuncion {

    /**
     * Función main, en esta realizamos llamada a la fnción sumar con 2 parámetros.
     * He añadido un System.out.println para mostrar lo que nos devuelva sumar por pantalla.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(sumar(10, 20));
    }

    /**
     * Metodo sumar, suma dos numeros que le pasemos y devuelve el resultado.
     * @param a double numero1
     * @param b double numero2
     * @return a + b
     */
    public static int sumar(int a, int b) {
        return a + b;
    }
}
