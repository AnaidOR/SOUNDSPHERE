package MODELO.CUENTAS;

import MODELO.MEMBRESIAS.Membresia;

public class Oyente extends Cuenta{
    private Membresia membresia;

    public Oyente(){}

    public Oyente(Membresia membresia){
        this.membresia = membresia;
    }

    public void setMembresia(Membresia membresia) {
        this.membresia = membresia;
    }
    public Membresia getMembresia() {
        return membresia;
    }

    public void administrarMembresia(){
        
    }
}
