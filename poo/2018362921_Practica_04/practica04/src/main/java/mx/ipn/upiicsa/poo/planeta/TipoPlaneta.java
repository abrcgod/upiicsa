package mx.ipn.upiicsa.poo.planeta;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TipoPlaneta {
    GASEOSO("Gaseoso"),
    TERRESTRE("Terrestre"),
    ENANO("Enano");

    private String tipo;

    public static TipoPlaneta getTipoPlaneta(String nombre) {
        TipoPlaneta[] tipos = values();
        for (TipoPlaneta tipo : tipos) {
            if (tipo.getTipo().equals(nombre)) {
                return tipo;
            }
        }
       throw new RuntimeException("Tipo de planeta no soportado o inexistente");
    }
}
