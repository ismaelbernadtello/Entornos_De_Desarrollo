package ejercicio0000270;
/** Todos los comentarios deben estar escritos antes del método que quieras comentar
 * Este comentario corresponde a la clase DocumentarFuncion.
 * @version 1.0 origen de Classroom
 * @author Ismael Bernad Tello
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Filtro {

    /**
     * Función main, en esta creamos una lista de números y mostramos los números que son pares
     * Primero a la función que está depreciada porque no permite decimales y luego a la versión nueva que admite decimales.
     * @param numeros
     * @param esNumeroPar
     */
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(2, 3, 4, 5, 7, 13, 10, 6, 8);
        
        Predicate<Integer> esNumeroPar = x -> x % 2 == 0;
        
        numeros.stream().filter(esNumeroPar)
                .forEach(System.out::println);
    }
}