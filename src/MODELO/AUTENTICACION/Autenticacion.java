package MODELO.AUTENTICACION;

import MODELO.CUENTAS.Cuenta;

public class Autenticacion {
    private Cuenta cuenta;
    private InicioSesion inicioSesion;

    public Autenticacion(){}

    public Autenticacion(Cuenta cuenta, InicioSesion inicioSesion){
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

    public Cuenta autenticacion(){
        return cuenta;
    }

    public void validarDatos(){

    }

    public void buscarInfoTablaCuentas(){

    }

    public void validarContraseña(){
        
    }
}
