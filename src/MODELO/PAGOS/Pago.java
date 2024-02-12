package MODELO.PAGOS;

public class Pago {
    private float monto;
    private String FechayHora;
    private MetodoDePago tipoPago;
    private String descripcion;
    private int ID;
    private String beneficiario;

    public Pago(){}

    public Pago(float monto, String FechayHora, MetodoDePago tipoPago, String descripcion, int ID, String beneficiario){
        this.monto = monto;
        this.FechayHora = FechayHora;
        this.tipoPago = tipoPago;
        this.descripcion = descripcion;
        this.ID = ID;
        this.beneficiario = beneficiario;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }
    public float getMonto() {
        return monto;
    }

    public void setFechayHora(String fechayHora) {
        FechayHora = fechayHora;
    }
    public String getFechayHora() {
        return FechayHora;
    }

    public void setTipoPago(MetodoDePago tipoPago) {
        this.tipoPago = tipoPago;
    }
    public MetodoDePago getTipoPago() {
        return tipoPago;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getDescripcion() {
        return descripcion;
    }

    public void setID(int iD) {
        ID = iD;
    }
    public int getID() {
        return ID;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }
    public String getBeneficiario() {
        return beneficiario;
    }

    public void enviarDatosPago(){
        
    }
}
