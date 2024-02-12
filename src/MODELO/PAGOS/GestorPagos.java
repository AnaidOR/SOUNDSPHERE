package MODELO.PAGOS;

public class GestorPagos {
    private Pago pago;
    private ComprobantePago comprobantePago;

    public GestorPagos(){}

    public GestorPagos(Pago pago, ComprobantePago comprobantePago){
        this.pago = pago;
        this.comprobantePago = comprobantePago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }
    public Pago getPago() {
        return pago;
    }

    public void setComprobantePago(ComprobantePago comprobantePago) {
        this.comprobantePago = comprobantePago;
    }
    public ComprobantePago getComprobantePago() {
        return comprobantePago;
    }

    public void enviaMetodoPago(){

    }

    public void realizarPago(){

    }

    public void generarResumenPago(){

    }

    public void validarInformacion(){

    }

    public void enviarPago(){

    }

    public void obtenerDatosPago(){
        
    }
}
