package mx.ipn.upiicsa.poo;

import java.util.Scanner;

public class CalculatorMenu {
    public static void launch() {
        Scanner sc = new Scanner(System.in);
        printMenu();
        System.out.println("El Resultado es: " + calculate(readOption(sc), sc));
        sc.close();
    }

    private static double calculate(CalculatorOperations operation, Scanner sc) {
        return Calculator.calculate(operation, readOperandos(operation.getOperandos(), sc));
    }

    private static void printMenu() {
        System.out.println("Calculadora Basica. Menu de Operaciones");
        for (CalculatorOperations operation : CalculatorOperations.values()) {
            System.out.println(operation.toString());
        }
    }

    private static double[] readOperandos(int cantidad, Scanner sc) {
        double[] operandos = new double[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese operando " + (i + 1) + ": ");
            operandos[i] = sc.nextDouble();
        }
        return operandos;
    }

    private static CalculatorOperations readOption(Scanner sc) {
        System.out.print("Ingresa el numero de operacion requerido: ");
        int option = sc.nextInt();
        return CalculatorOperations.getOperation(option);
    }

    private CalculatorMenu() {
    }
}
