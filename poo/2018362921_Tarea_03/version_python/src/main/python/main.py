import sys
from operation_modes import OperationModes

def main():
    args = sys.argv[1:]
    mode : OperationModes = OperationModes.get_operation_mode()
    match mode:
        case OperationModes.MENU:
            MenuCalculator.launch()
        case OperationModes.PARAMETERS:
            ParameterCalculator.launch()
        case _:
            raise RuntimeError("Valor inesperado")

if __name__ == "__main__":
    main()
        
