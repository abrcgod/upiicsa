package mx.ipn.upiicsa.poo.planeta;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Planeta {
    String nombre;
    Integer cantidadSatelites;
    Double masa;
    Double volumen;
    Integer distanciaMediaAlSol;
    TipoPlaneta tipoPlaneta;
    Boolean observable;

    private static final String FORMATO_IMPRESION = "Planeta \n Nombre: %s\n Cantidad de Satelites: %d\n Masa: %.4f\n Volumen: %.4f\n Distancia Media Al Sol  %d Tipo de planeta: %s\n Observable A Simple Vista: %s\n";
    private static final Integer UNIDAD_ASTRONOMICA = 149597870;
    private static final Double FIN_CINTURON_ASTEROIDES = 3.4 *UNIDAD_ASTRONOMICA;

    public void imprimir() {
        System.out.println(String.format(FORMATO_IMPRESION, nombre, cantidadSatelites, masa, volumen,
                distanciaMediaAlSol, tipoPlaneta.getTipo(), observable.toString()));
    }

    public Double densidad() {
        return masa / volumen;
    }

    public Boolean isExterior() {
        return distanciaMediaAlSol > FIN_CINTURON_ASTEROIDES;
    }
}
