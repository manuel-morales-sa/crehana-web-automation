package Builder;

import Models.Codigo;

public class CodeBuilder {

    public static Codigo codeDefault(){
        return new Codigo("Prefijo + Alfanumérico", "CuponPruebas", "10", "3");
    }
}
