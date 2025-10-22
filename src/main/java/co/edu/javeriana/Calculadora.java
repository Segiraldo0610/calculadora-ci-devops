package co.edu.javeriana;

/**
 * Clase simple de calculadora para demostrar CI/CD
 * @author Tu Nombre
 */
public class Calculadora {

    /**
     * Suma dos números enteros
     * @param a primer número
     * @param b segundo número
     * @return la suma de a y b
     */
    public int sumar(int a, int b) {
        return a + b;
    }

    /**
     * Resta dos números enteros
     * @param a primer número (minuendo)
     * @param b segundo número (sustraendo)
     * @return la resta de a - b
     */
    public int restar(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dos números enteros
     * @param a primer número
     * @param b segundo número
     * @return el producto de a y b
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide dos números enteros
     * @param a dividendo
     * @param b divisor
     * @return el cociente de a / b
     * @throws IllegalArgumentException si b es cero
     */
    public double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return (double) a / b;
    }

    /**
     * Calcula el módulo de dos números
     * @param a dividendo
     * @param b divisor
     * @return el resto de a % b
     */
    public int modulo(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede calcular módulo con divisor cero");
        }
        return a % b;
    }
    /**
     * Calcula la potencia de un número (a^b)
     * @param base número base
     * @param exponente exponente (entero)
     * @return base elevada al exponente
     */
    public double potencia(double base, int exponente) {
        return Math.pow(base, exponente);
    }

    /**
     * Calcula la raíz cuadrada de un número
     * @param a número del que se calcula la raíz
     * @return raíz cuadrada de a
     * @throws IllegalArgumentException si el número es negativo
     */
    public double raizCuadrada(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo");
        }
        return Math.sqrt(a);
    }

    /**
     * Calcula el factorial de un número entero
     * @param n número entero no negativo
     * @return factorial de n
     * @throws IllegalArgumentException si n es negativo
     */
    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El factorial no está definido para números negativos");
        }
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    /**
     * Calcula el máximo común divisor (MCD) de dos números
     * @param a primer número
     * @param b segundo número
     * @return el máximo común divisor de a y b
     */
    public int mcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
