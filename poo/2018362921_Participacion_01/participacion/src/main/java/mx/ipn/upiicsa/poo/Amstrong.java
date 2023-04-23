package mx.ipn.upiicsa.poo;

public class Amstrong {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
          if(isAmstrong(i)) {
            System.out.println(i);
          }
        }
    }

    private static Boolean isAmstrong(int numero) {
        String base = Integer.toString(numero);
        int numeroCifras = base.length();
        int transformado = 0;
        for (String digito : base.split("")) {
            transformado += Math.pow(Integer.parseInt(digito), numeroCifras);
       }
        return numero == transformado;
    }
}
