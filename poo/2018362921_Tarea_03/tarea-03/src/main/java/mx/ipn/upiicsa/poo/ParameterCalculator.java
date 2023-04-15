package mx.ipn.upiicsa.poo;

public class ParameterCalculator {
    public static final String RESULTADO = "El resultado de la operacion %s es %.4f";

    public static void launch(String[] args) {
        CalculatorOperations operation = CalculatorOperations.getOperation(args[1]);
        double result = Calculator.calculate(operation, readOperandos(operation, args));
        System.out.println(String.format(RESULTADO, operation.getNombre(), result));
    }

    private static double[] readOperandos(CalculatorOperations operation, String[] args) {
        int cantidad = operation.getOperandos();
        double[] operandos = new double[cantidad];
        try {
            for (int i = 0, operandosIndex = 2; i < cantidad; i++, operandosIndex++) {
                operandos[i] = Double.parseDouble(args[operandosIndex]);
            }
        } catch (IndexOutOfBoundsException index) {
            System.err.println("No se ingresaron suficientes argumentos");
            System.exit(index.hashCode());
        } catch (NumberFormatException badNumber) {
            System.err.println("Los operandos ingresados deben ser numeros reales");
            System.exit(badNumber.hashCode());
        }
        return operandos;
    }

    private ParameterCalculator() {
    }
}
