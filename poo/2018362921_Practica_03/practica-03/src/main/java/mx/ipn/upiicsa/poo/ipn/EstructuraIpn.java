package mx.ipn.upiicsa.poo.ipn;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class EstructuraIpn {
    ConsejoSuperiorConsultivo consejoSuperiorConsultivo;
    DireccionGeneral direccionGeneral;
    UnidadesAcademicas unidadesAcademicas;
    UnidadesAdministrativas unidadesAdministrativas;
    UnidadesAuxiliares unidadesAuxiliares;

    public void imprimir() {
         System.out.println("Estructura IPN");
         consejoSuperiorConsultivo.imprimir();
         direccionGeneral.imprimir();
         unidadesAcademicas.imprimir();
         unidadesAdministrativas.imprimir();
         unidadesAuxiliares.imprimir();
    }

    public static EstructuraIpn poblar() {
        String directorGeneral = "Arturo Reyes Sandoval";
        String[] directoresUnidadesAcademicas = {"Emanuel Gonzales Rogel", "Fidel Cruz Ninio", "Juan Flores Saavedra"};
        String representanteSectorPublico = "Representante Sector Publico";
        String representanteSectorPrivado = "Representante Sector Privado";
        ConsejoSuperiorConsultivo consejoSuperiorConsultivo = new ConsejoSuperiorConsultivo(directorGeneral,
                directoresUnidadesAcademicas, representanteSectorPublico, representanteSectorPrivado);
        String[] directoresDeArea = {"Director Educacion Superior", "Director Educacion Media Superior"};
        String[] jefesDeDepartamento = {"Jefe Gestion Escolar", "Jefe Becas"};
        DireccionGeneral direccionGeneral = new DireccionGeneral(directorGeneral, directoresDeArea,
                jefesDeDepartamento);
        String[] escuelas = {"UPIICSA", "ESIME", "ESCA", "ESIA"};
        UnidadesAcademicas unidadesAcademicas = new UnidadesAcademicas(escuelas);
        String[] unidadesAdministrativas = {"Recursos Humanos", "Juridico"};
        UnidadesAdministrativas unidadesAdministrativas2 = new UnidadesAdministrativas(unidadesAdministrativas);
        String[] unidadesAux = {"Unidades Auxiliares"};
        UnidadesAuxiliares unidadesAuxiliares = new UnidadesAuxiliares(unidadesAux);
        return new EstructuraIpn(consejoSuperiorConsultivo, direccionGeneral, unidadesAcademicas,
                unidadesAdministrativas2, unidadesAuxiliares);
    }
}
