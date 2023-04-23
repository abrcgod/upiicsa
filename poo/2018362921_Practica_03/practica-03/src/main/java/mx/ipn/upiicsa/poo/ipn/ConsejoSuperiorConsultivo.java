package mx.ipn.upiicsa.poo.ipn;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class ConsejoSuperiorConsultivo {
    private String directorGeneral;
    private String[] directoresUnidadesAcademicas;
    private String representanteSectorPublico;
    private String representanteSectorPrivado;

    public void imprimir() {
        System.out.println("Consejo Superior Consiltivo");
        System.out.println("Director General: " + directorGeneral);
        System.out.println("Directores Unidades Academicas:");
        for (String director : directoresUnidadesAcademicas) {
            System.out.println("\t" + director);
        }
        System.out.println("Representante Sector Publico: " + representanteSectorPublico);
        System.out.println("Representante Sector Privado: " + representanteSectorPrivado);
    }
}
