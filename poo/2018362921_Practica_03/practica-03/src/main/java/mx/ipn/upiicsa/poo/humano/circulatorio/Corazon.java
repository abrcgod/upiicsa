package mx.ipn.upiicsa.poo.humano.circulatorio;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Corazon {
    private String nombre;

    public void imprimir() {
        System.out.println(nombre);
    }
}
