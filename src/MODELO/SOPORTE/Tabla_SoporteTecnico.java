package MODELO.SOPORTE;

public class Tabla_SoporteTecnico {
    private SoporteTecnico soporteTecnico[];

    public Tabla_SoporteTecnico(){}

    public Tabla_SoporteTecnico(SoporteTecnico soporteTecnico[]){
        this.soporteTecnico = soporteTecnico;
    }

    public void setSoporteTecnico(SoporteTecnico[] soporteTecnico) {
        this.soporteTecnico = soporteTecnico;
    }
    public SoporteTecnico[] getSoporteTecnico() {
        return soporteTecnico;
    }
}
