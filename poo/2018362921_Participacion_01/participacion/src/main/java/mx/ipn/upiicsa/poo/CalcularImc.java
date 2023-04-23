package mx.ipn.upiicsa.poo;

public class CalcularImc {
    public static void main(String[] args) {
        double peso = Double.parseDouble(args[0]);
        double altura = Double.parseDouble(args[1]);
        double imc = peso / Math.pow(altura, 2.0);
        System.out.println("Tu IMC de: " + imc + " te situa en el rango de: " + obtenerRango(imc));
    }

    private static String obtenerRango(double imc) {
        String resultado = "";
       if (imc < 16.0) {
         resultado = "Delgadez Severa";
       } else if (imc >= 16.0 && imc <17.0) {
        resultado = "Delgadez Moderada";
       } else if (imc >= 17.0 && imc < 18.5) {
        resultado = "Delgadez Leve";
       } else if (imc >= 18.5 && imc < 25.0) {
        resultado = "Peso Normal";
       } else if (imc >= 25.0 && imc < 30.0) {
        resultado = "Sobrepeso";
       } else if (imc >= 30.0 && imc < 35) {
        resultado = "Obesidad Leve";
       } else if (imc >= 35.0 && imc < 40.0) {
        resultado = "Obesidad Moderada";
       } else if (imc >= 40) {
        resultado = "Obesidad Morbida";
       } 
       else {
        resultado = "";
       }
       return resultado;
    }
}
