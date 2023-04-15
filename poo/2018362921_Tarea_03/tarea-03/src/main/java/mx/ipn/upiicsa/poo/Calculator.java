package mx.ipn.upiicsa.poo;

public class Calculator {
    public static double calculate(CalculatorOperations operation, double[] operandos) {
        return switch (operation) {
            case DIVISION -> division(operandos);
            case MULTIPLICACION -> multiplicacion(operandos);
            case PISO -> piso(operandos);
            case RESTA -> resta(operandos);
            case SUMA -> suma(operandos);
            case TECHO -> techo(operandos);
            case PORCENTAJE -> porcentaje(operandos);
            case REDONDEO -> redondeo(operandos);
            default -> throw new RuntimeException("Operacion Invalida");
        };
    }

    private static double division(double[] operandos) throws RuntimeException {
        if (operandos[1] == 0.0) {
            throw new RuntimeException("Error Matematico: Division entre cero");
        }

        return operandos[0] / operandos[1];
    }

    private static double multiplicacion(double[] operandos) {
        return operandos[0] * operandos[1];
    }

    private static double piso(double[] operandos) {
        return Math.floor(operandos[0]);
    }

    private static double porcentaje(double[] operandos) {
        return operandos[0] * (operandos[1] / 100);
    }

    private static double redondeo(double[] operandos) {
        return Math.round(operandos[0]);
    }

    private static double resta(double[] operandos) {
        return operandos[0] - operandos[1];
    }

    private static double suma(double[] operandos) {
        return operandos[0] + operandos[1];
    }

    private static double techo(double[] operandos) {
        return Math.ceil(operandos[0]);
    }

    private Calculator(){}
}
