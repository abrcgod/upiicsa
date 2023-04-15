package mx.ipn.upiicsa.poo;

/**
 * Calculadora Basica!
 *
 */
public class App {
  public static void main(String[] args) {
    OperationModes mode = OperationModes.getOperationMode(args[0]);
    switch (mode) {
      case MENU:
        CalculatorMenu.launch();
        break;
      case PARAMETROS:
        ParameterCalculator.launch(args);
        break;
      default:
        throw new RuntimeException("Uso: Calculator -m/-p [operacion] [parameters]");
    }
  }
}
