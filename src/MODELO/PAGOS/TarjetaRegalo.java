package MODELO.PAGOS;

public class TarjetaRegalo {
    private float monto;
    private String fechaCad;

    public TarjetaRegalo(){}

    public TarjetaRegalo(float monto, String fechaCad){
        this.monto = monto;
        this.fechaCad = fechaCad;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }
    public float getMonto() {
        return monto;
    }

    public void setFechaCad(String fechaCad) {
        this.fechaCad = fechaCad;
    }
    public String getFechaCad() {
        return fechaCad;
    }
}
