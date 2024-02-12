package MODELO.PAGOS;

public class TarjetaDebito extends TarjetaBancaria {
    private float saldo;

    public TarjetaDebito(){}

    public TarjetaDebito(float saldo){
        this.saldo = saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public float getSaldo() {
        return saldo;
    }
}
