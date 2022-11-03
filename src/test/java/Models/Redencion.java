package Models;



public class Redencion {
    private String limiteRedenciones;
    private String redencionPorDia;
    private String redencionPorUsuario;
    private String redencionPorUsuarioDiario;
    private String descripcion;
    private String responsableCupon;
    private String entidad;
    private String nombreImagen;

    public Redencion() {
    }

    public Redencion(String limiteRedenciones, String redencionPorDia, String redencionPorUsuario, String redencionPorUsuarioDiario, String descripcion, String responsableCupon, String entidad, String nombreImagen) {
        this.limiteRedenciones = limiteRedenciones;
        this.redencionPorDia = redencionPorDia;
        this.redencionPorUsuario = redencionPorUsuario;
        this.redencionPorUsuarioDiario = redencionPorUsuarioDiario;
        this.descripcion = descripcion;
        this.responsableCupon = responsableCupon;
        this.entidad = entidad;
        this.nombreImagen = nombreImagen;
    }

    public String getLimiteRedenciones() {
        return limiteRedenciones;
    }

    public void setLimiteRedenciones(String limiteRedenciones) {
        this.limiteRedenciones = limiteRedenciones;
    }

    public String getRedencionPorDia() {
        return redencionPorDia;
    }

    public void setRedencionPorDia(String redencionPorDia) {
        this.redencionPorDia = redencionPorDia;
    }

    public String getRedencionPorUsuario() {
        return redencionPorUsuario;
    }

    public void setRedencionPorUsuario(String redencionPorUsuario) {
        this.redencionPorUsuario = redencionPorUsuario;
    }

    public String getRedencionPorUsuarioDiario() {
        return redencionPorUsuarioDiario;
    }

    public void setRedencionPorUsuarioDiario(String redencionPorUsuarioDiario) {
        this.redencionPorUsuarioDiario = redencionPorUsuarioDiario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getResponsableCupon() {
        return responsableCupon;
    }

    public void setResponsableCupon(String responsableCupon) {
        this.responsableCupon = responsableCupon;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getNombreImagen() {
        return nombreImagen;
    }

    public void setNombreImagen(String nombreImagen) {
        this.nombreImagen = nombreImagen;
    }
}
