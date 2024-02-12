package MODELO.PAGOS;

public class ComprobantePago {
    private Pago DatosPago;

    public ComprobantePago(){}

    public ComprobantePago(Pago DatosPago){
        this.DatosPago = DatosPago;
    }

    public void setDatosPago(Pago datosPago) {
        DatosPago = datosPago;
    }
    public Pago getDatosPago() {
        return DatosPago;
    }

    public void generarComprobante(){
        
    }
}
