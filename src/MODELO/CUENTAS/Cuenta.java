package MODELO.CUENTAS;

import MODELO.PAGOS.Pago;
import MODELO.RECOMPENSAS.Recompensas;
import MODELO.SISTEMA.Cancion;

public class Cuenta {
    private String nombreUsuario;
    private String contraseña;
    private String fechaNacimiento;
    private String email;
    private String numCelular;
    private String nombre;
    private String apellidos;
    private Cuenta seguidos[];
    private String preferencias;
    private String tipoCuenta;
    private float saldo;
    private Pago pagos[];
    private Recompensas recompensas;
    private Cancion playlists[];

    public Cuenta(){}

    public Cuenta(String nombreUsuario, String contraseña, String fechaNacimiento, String email, 
    String numCelular, String nombre, String apellidos, Cuenta seguidos[], String preferencias,
    String tipoCuenta, float saldo, Pago pagos[], Recompensas recompensas, Cancion playlists[]){
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
        this.numCelular = numCelular;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this. seguidos = seguidos;
        this.preferencias = preferencias;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
        this.pagos = pagos;
        this.recompensas = recompensas;
        this.playlists = playlists;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public String getContraseña() {
        return contraseña;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public void setNumCelular(String numCelular) {
        this.numCelular = numCelular;
    }
    public String getNumCelular() {
        return numCelular;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getApellidos() {
        return apellidos;
    }

    public void setSeguidos(Cuenta[] seguidos) {
        this.seguidos = seguidos;
    }
    public Cuenta[] getSeguidos() {
        return seguidos;
    }

    public void setPreferencias(String preferencias) {
        this.preferencias = preferencias;
    }
    public String getPreferencias() {
        return preferencias;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public float getSaldo() {
        return saldo;
    }

    public void setPagos(Pago[] pagos) {
        this.pagos = pagos;
    }
    public Pago[] getPagos() {
        return pagos;
    }

    public void setRecompensas(Recompensas recompensas) {
        this.recompensas = recompensas;
    }
    public Recompensas getRecompensas() {
        return recompensas;
    }

    public void setPlaylists(Cancion[] playlists) {
        this.playlists = playlists;
    }
    public Cancion[] getPlaylists() {
        return playlists;
    }

}
