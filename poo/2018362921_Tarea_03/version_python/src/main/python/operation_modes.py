from enum import StrEnum

class OperationModes(StrEnum):
    MENU = "-m"
    PARAMETERS = "-p"
    
    def get_operation_mode(self, flag):
        for mode in OperationModes:
            if flag.lower().__eq__(mode.value):
                return mode;
        raise RuntimeError("Modo de Operacion no soportado") 