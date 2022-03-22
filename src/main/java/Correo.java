public class Correo {
    private String correo;
    private Boolean estado;

    public Correo(String correo, Boolean estado) {
        this.correo = correo;
        this.estado = estado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    public  void changeBoolean(){
        this.estado=false;
    }

    @Override
    public String toString() {
        return "Correo{" +
                "correo='" + correo + '\'' +
                ", estado=" + estado +
                '}';
    }
}
