package MODELO.PAGOS;

public class TarjetaBancaria {
    private String numeroTarjeta;
    private  String titular;
    private String fechaVig;
    private int codigoSeguridad;

    public TarjetaBancaria(){}

    public TarjetaBancaria(String numeroTarjeta, String titular, String fechaVig, int codigoSeguridad){
        this.numeroTarjeta = numeroTarjeta;
        this.titular = titular;
        this.fechaVig = fechaVig;
        this.codigoSeguridad = codigoSeguridad;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    public String getTitular() {
        return titular;
    }

    public void setFechaVig(String fechaVig) {
        this.fechaVig = fechaVig;
    }
    public String getFechaVig() {
        return fechaVig;
    }

    public void setCodigoSeguridad(int codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }
    public int getCodigoSeguridad() {
        return codigoSeguridad;
    }
}
