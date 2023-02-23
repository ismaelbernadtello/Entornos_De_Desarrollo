package ejercicio0000301;
/** Todos los comentarios deben estar escritos antes del método que quieras comentar
 * Este comentario corresponde a la clase Calculadora.
 * @version 1.0 origen de Classroom
 * @author Ismael Bernad Tello
 */
public class Calculadora {
	
	/**
	 * Este comentario corresponde a la constante PI, es el numero pi.
	 * @version 1.0 origen de Classroom
	 * @author Ismael Bernad Tello
	 * @param PI double constante
	 */
    private static final double PI = 3.14159265358979;
    
    /**
	 * Corresponde a la constante E, que es el numero e.
	 * @version 1.0 origen de Classroom
	 * @author Ismael Bernad Tello
	 * @param E double constante
	 */
    private static final double E = 2.718281828459;
    
    /**
	 * Método constructor, vacío ni pide ni devuelve nada
	 * @version 1.0 origen de Classroom
	 * @author Ismael Bernad Tello
	 */
    public Calculadora() {
    }
    
    /**
	 * Metodo sumar, suma dos numeros que le pasemos y devuelve el resultado.
	 * @version 1.0 origen de Classroom
	 * @author Ismael Bernad Tello
	 * @param a double numero1
	 * @param b double nuemro2
	 * @return a + b
	 */
    public double sumar(double a, double b){
        return a + b;
    }
    
    /**
   	 * Metodo restar, resta dos numeros y devuelve el resultado.
   	 * @version 1.0 origen de Classroom
   	 * @author Ismael Bernad Tello
   	 * @param a double minuendo
   	 * @param b double sustraendo
   	 * @return a - b
   	 */
    public double restar(double a, double b){
        return a - b;
    }
    
    /**
   	 * Metodo multiplicar, multiplica dos numeros y devuelve el resultado.
   	 * @version 1.0 origen de Classroom
   	 * @author Ismael Bernad Tello
   	 * @param a double factor1
   	 * @param b double factor2
   	 * @return a * b
   	 */
    public double multiplicar(double a, double b){
        return a * b;
    }
    
    /**
   	 * Metodo dividir, divide un numero entre otro y devuelve el resultado.
   	 * @version 1.0 origen de Classroom
   	 * @author Ismael Bernad Tello
   	 * @param a double dividendo
   	 * @param b double divisor
   	 * @return cociente a/b o AricmeticException si se intenta dividir entre cero
   	 */
    public double dividir(double a, double b){
        if (b != 0){
            return a / b;
        } else {
            throw new ArithmeticException("Intento de división entre cero.");
        }
    }
    
    /**
   	 * Metodo potencia, eleva un numero a la potencia del exponente y devuelve el resultado.
   	 * @version 1.0 origen de Classroom
   	 * @author Ismael Bernad Tello
   	 * @param base double base
   	 * @param exponente double exponente
   	 * @return base^exponente
   	 */
    public double potencia(double base, double exponente){
        return Math.pow(base, exponente);
    }
    
    /**
   	 * Metodo valorAbsoluto, devuelve el valor absoluto de un numero y devuelve el resultado.
   	 * @version 1.0 origen de Classroom
   	 * @author Ismael Bernad Tello
   	 * @param valor double, el numero
   	 * @return valor absoluto del numero
   	 */
    public double valorAbsoluto(double valor){
        return Math.abs(valor);
    }
}