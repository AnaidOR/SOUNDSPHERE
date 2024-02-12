package MODELO.TIENDA;

public class Producto {
    private String nombreProducto;
    private float precioProducto;
    private String tipoProducto;
    private String tallaProducto;
    private int cantidadDeProducto;

    public Producto(){}

    public Producto(String nombreProducto, float precioProducto, String tipoProducto, String tallaProducto, int cantidadDeProducto){
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.tipoProducto = tipoProducto;
        this.tallaProducto = tallaProducto;
        this.cantidadDeProducto = cantidadDeProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setPrecioProducto(float precioProducto) {
        this.precioProducto = precioProducto;
    }
    public float getPrecioProducto() {
        return precioProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }
    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTallaProducto(String tallaProducto) {
        this.tallaProducto = tallaProducto;
    }
    public String getTallaProducto() {
        return tallaProducto;
    }

    public void setCantidadDeProducto(int cantidadDeProducto) {
        this.cantidadDeProducto = cantidadDeProducto;
    }
    public int getCantidadDeProducto() {
        return cantidadDeProducto;
    }
}
