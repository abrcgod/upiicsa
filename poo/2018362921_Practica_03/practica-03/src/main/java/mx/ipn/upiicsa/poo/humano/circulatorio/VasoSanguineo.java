package mx.ipn.upiicsa.poo.humano.circulatorio;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class VasoSanguineo {
    private String nombre;

    public void imprimir() {
        System.out.println(nombre);
    }
}
