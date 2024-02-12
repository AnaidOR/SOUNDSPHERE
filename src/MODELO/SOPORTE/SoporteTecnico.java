package MODELO.SOPORTE;

public class SoporteTecnico {
    private int Folio;
    private String FechayHora;
    private boolean status;
    private String descripcion;

    public SoporteTecnico(){}

    public SoporteTecnico(int Folio, String FechayHora, boolean status, String descripcion){
        this.Folio = Folio;
        this.FechayHora = FechayHora;
        this.status = status;
        this.status = status;
    }

    public void setFolio(int folio) {
        Folio = folio;
    }
    public int getFolio() {
        return Folio;
    }

    public void setFechayHora(String fechayHora) {
        FechayHora = fechayHora;
    }
    public String getFechayHora() {
        return FechayHora;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public boolean getStatus(){
        return status;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getDescripcion() {
        return descripcion;
    }
}
