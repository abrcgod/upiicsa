package mx.ipn.upiicsa.poo;

import lombok.Getter;

@Getter
public enum CalculatorOperations {
    SUMA(1, "Suma", "-s", 2),
    RESTA(2, "Resta", "-r", 2),
    MULTIPLICACION(3, "Multiplicacion", "-m", 2),
    DIVISION(4, "Division", "-d", 2),
    PISO(5, "Piso", "-pi", 1),
    TECHO(6, "Techo", "-te", 1),
    PORCENTAJE(7, "Porcentaje", "-p", 2),
    REDONDEO(8, "Redondeo", "-re", 1);

    private int id;
    private String nombre;
    private String acronimo;
    private int operandos;

    private static final String NOMBRE_OPERACION = "%d.- %s (%s)";

    private CalculatorOperations(int id, String nombre, String acronimo, int operandos) {
        this.id = id;
        this.nombre = nombre;
        this.acronimo = acronimo;
        this.operandos = operandos;
    }

    public static CalculatorOperations getOperation(String operation) throws RuntimeException {
        CalculatorOperations[] calculatorOperations = values();
        for (CalculatorOperations calculatorOperation : calculatorOperations) {
            if (calculatorOperation.getAcronimo().equals(operation)) {
                return calculatorOperation;
            }
        }
        throw new RuntimeException("Operacion no soportada");
    }

    public static CalculatorOperations getOperation(int option) throws RuntimeException {
        CalculatorOperations[] calculatorOperations = values();
        for (CalculatorOperations calculatorOperation : calculatorOperations) {
            if (calculatorOperation.getId() == option) {
                return calculatorOperation;
            }
        }
        throw new RuntimeException("Operacion no soportada");
    }

    @Override
    public String toString() {
        return String.format(NOMBRE_OPERACION, id, nombre, acronimo);
    }
}
