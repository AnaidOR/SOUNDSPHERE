package MODELO.AUTENTICACION;

import MODELO.CUENTAS.Cuenta;

public class GestorAutenticacion {
    private Cuenta cuenta;
    private InicioSesion inicioSesion;

    public GestorAutenticacion(){}

    public GestorAutenticacion(Cuenta cuenta, InicioSesion inicioSesion){
        this.cuenta = cuenta;
        this.inicioSesion = inicioSesion;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setInicioSesion(InicioSesion inicioSesion) {
        this.inicioSesion = inicioSesion;
    }
    public InicioSesion getInicioSesion() {
        return inicioSesion;
    }

    public void recibeDatosAutenticacion(){

    }

    public void recibeAutenticacion(){

    }

    public void recibeCuenta(){

    }

    public void autorizarInicioSesion(){

    }

    public void autorizaCreacion(){

    }

    public void creaInicioSesion(){

    }

    public void autenticacion(){

    }

    public void validacionDatos(){

    }
}
