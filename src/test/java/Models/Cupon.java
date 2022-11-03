package Models;

public class Cupon {
    private String tipoCupon;
    private String valorDescuento;
    private String valorMinimo;
    private String valorMaximo;

    public Cupon(String tipoCupon, String valorDescuento, String valorMinimo, String valorMaximo) {
        this.tipoCupon = tipoCupon;
        this.valorDescuento = valorDescuento;
        this.valorMinimo = valorMinimo;
        this.valorMaximo = valorMaximo;
    }

    public Cupon() {
        
    }

    public String getTipoCupon() {
        return tipoCupon;
    }

    public void setTipoCupon(String tipoCupon) {
        this.tipoCupon = tipoCupon;
    }

    public String getValorDescuento() {
        return valorDescuento;
    }

    public void setValorDescuento(String valorDescuento) {
        this.valorDescuento = valorDescuento;
    }

    public String getValorMinimo() {
        return valorMinimo;
    }

    public void setValorMinimo(String valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    public String getValorMaximo() {
        return valorMaximo;
    }

    public void setValorMaximo(String valorMaximo) {
        this.valorMaximo = valorMaximo;
    }
}
