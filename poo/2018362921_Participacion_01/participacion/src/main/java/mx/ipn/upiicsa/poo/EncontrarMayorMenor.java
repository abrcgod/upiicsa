package mx.ipn.upiicsa.poo;

import java.util.ArrayList;

public class EncontrarMayorMenor {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        for (String numero : args) {
            numeros.add(Integer.parseInt(numero));
        }
        System.out.println("El numero mayor es: " + obtenerMenor(numeros));
        System.out.println("El numero mayor es: " + obtenerMayor(numeros));
    }

    private static int obtenerMayor(ArrayList<Integer> numeros) {
        int mayor = numeros.get(0);
        for (Integer numero : numeros) {
            if (numero > mayor) {
                mayor = numero;
            } 
        }
        return mayor;
    }

    private static int obtenerMenor(ArrayList<Integer> numeros) {
        int menor = numeros.get(0);
        for (Integer numero : numeros) {
            if (numero < menor) {
                menor = numero;
            } 
        }
        return menor;
    }
}
