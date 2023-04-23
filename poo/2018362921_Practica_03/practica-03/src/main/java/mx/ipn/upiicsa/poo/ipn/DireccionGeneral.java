package mx.ipn.upiicsa.poo.ipn;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class DireccionGeneral {
    private String directorGeneral;
    private String[] directoresDeArea;
    private String[] jefesDeDepartamento;

    public void imprimir() {
        System.out.println("Direccion General: ");
        System.out.println("Director General: " + directorGeneral);
        System.out.println("Directores de Area: ");
        for (String director : directoresDeArea) {
            System.out.println("\t" + director);
        }
        System.out.println("Jefes de Departamento:");
        for (String jefe : jefesDeDepartamento) {
            System.out.println("\t" + jefe);
        }

    }
}
