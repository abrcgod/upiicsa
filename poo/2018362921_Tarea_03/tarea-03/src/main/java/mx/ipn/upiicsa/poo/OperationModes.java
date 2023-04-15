package mx.ipn.upiicsa.poo;

import lombok.Getter;

@Getter
public enum OperationModes {
    PARAMETROS(1, "Parametros", "-p"),
    MENU(2, "Menu", "-m");

    private int id;
    private String nombre;
    private String acronimo;

    private OperationModes(int id, String nombre, String acronimo) {
        this.id = id;
        this.nombre = nombre;
        this.acronimo = acronimo;
    }

    public static OperationModes getOperationMode(String operationMode) throws RuntimeException {
        OperationModes[] operationModes = values();
        for (OperationModes operation : operationModes) {
            if (operation.getAcronimo().equals(operationMode)) {
                return operation;
            }
        }
        throw new RuntimeException("Modo de Operacion NO Soportado");
    }
}
