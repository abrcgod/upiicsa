package mx.ipn.upiicsa.poo;

import mx.ipn.upiicsa.poo.ipn.EstructuraIpn;

/**
 * Crea e imprime las estructuras del ipn y el cuerpo humano
 *
 */
public class App {
    public static void main(String[] args) {
        EstructuraIpn estructuraIpn = EstructuraIpn.poblar();
        estructuraIpn.imprimir();
    }
}
