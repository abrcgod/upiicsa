package mx.ipn.upiicsa.poo.ipn;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class UnidadesAcademicas {
    String[] escuelas;

    public void imprimir() {
        System.out.println("Unidades Academicas");
        for (String escuela : escuelas) {
            System.out.println("\t" + escuela);
        }
    }
}
