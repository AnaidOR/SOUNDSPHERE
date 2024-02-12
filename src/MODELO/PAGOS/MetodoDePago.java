package MODELO.PAGOS;

public class MetodoDePago {
    private String tipo;

    public MetodoDePago(){}

    public MetodoDePago(String tipo){
        this.tipo = tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }
}
