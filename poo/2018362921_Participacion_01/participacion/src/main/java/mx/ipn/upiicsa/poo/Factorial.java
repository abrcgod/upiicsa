package mx.ipn.upiicsa.poo;

public class Factorial {
    public static void main(String[] args) {
        int numero = Integer.parseUnsignedInt(args[0]);
        System.out.println("El Factorial de " + numero + " es: " + factorial(numero));
    }

    private static int factorial(int n) {
        if(n <= 1) {
            return 1;
        } else {
            return factorial(n-1) * n;
        }
    }
}
