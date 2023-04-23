package mx.ipn.upiicsa.poo;

import mx.ipn.upiicsa.poo.planeta.Planeta;
import mx.ipn.upiicsa.poo.planeta.TipoPlaneta;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Planeta marte = new Planeta("Marte", 2,6.39e23, 1.6318e11, 230000000,TipoPlaneta.getTipoPlaneta("Terrestre"),Boolean.TRUE);
        Planeta saturno = new Planeta("Saturno", 20, 5.683e26, 8.27e23, 1400, TipoPlaneta.getTipoPlaneta("Gaseoso"), Boolean.TRUE);
        System.out.println("El planeta Marte: ");
        marte.imprimir();
        String marteExterior = Boolean.TRUE.equals(marte.isExterior()) ? "Exterior" : "Interior";
        System.out.println("Ademas su densidad es de: " + marte.densidad() + "\nY es un planeta " + marteExterior);
        System.out.println("El planeta Saturno: ");
        marte.imprimir();
        String saturnoExterior = Boolean.TRUE.equals(saturno.isExterior()) ? "Exterior" : "Interior";
        System.out.println("Ademas su densidad es de: " + saturno.densidad() + "\nY es un planeta " + saturnoExterior);        
    }
}
