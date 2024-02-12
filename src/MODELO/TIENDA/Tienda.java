package MODELO.TIENDA;

public class Tienda {
    private Producto listaproductos[];

    public Tienda(){}

    public Tienda(Producto listaproductos[]){
        this.listaproductos = listaproductos;
    }

    public void setListaproductos(Producto[] listaproductos) {
        this.listaproductos = listaproductos;
    }
    public Producto[] getListaproductos() {
        return listaproductos;
    }

    public void consultarProducto(){
        
    }
}
