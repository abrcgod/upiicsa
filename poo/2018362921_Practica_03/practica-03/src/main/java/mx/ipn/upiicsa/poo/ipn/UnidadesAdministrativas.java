package mx.ipn.upiicsa.poo.ipn;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class UnidadesAdministrativas {
    private String[] unidades;

    public void imprimir() {
        System.out.println("Unidades Administrativas:");
        for (String unidad : unidades) {
            System.out.println("\t" + unidad);
        }
    }
}
