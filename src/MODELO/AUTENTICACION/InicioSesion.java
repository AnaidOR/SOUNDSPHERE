package MODELO.AUTENTICACION;

public class InicioSesion {
    private String usuario;
    private String contraseña;

    public InicioSesion(){}

    public InicioSesion(String usuario, String contraseña){
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getUsuario() {
        return usuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public String getContraseña() {
        return contraseña;
    }

    public void inicioSesion(){

    }

}
