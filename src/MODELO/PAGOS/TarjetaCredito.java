package MODELO.PAGOS;

public class TarjetaCredito extends TarjetaBancaria {
    private float limiteC;

    public TarjetaCredito(){}

    public TarjetaCredito(float limiteC){
        this.limiteC = limiteC;
    }

    public void setLimiteC(float limiteC) {
        this.limiteC = limiteC;
    }
    public float getLimiteC() {
        return limiteC;
    }
}
