package Builder;

import Models.Cupon;

public class CuponBuilder {

    public static Cupon cuponValorFijoDefault() {
        return new Cupon("Descuento valor fijo", "10000", "30000", "NA");
    }

    public static Cupon cuponPorcentajeDefault() {
        return new Cupon("Descuento porcentaje", "10", "10000", "200000");
    }
}
