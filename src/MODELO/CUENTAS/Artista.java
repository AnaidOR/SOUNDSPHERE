package MODELO.CUENTAS;

import MODELO.SISTEMA.Album;

public class Artista extends Cuenta{
    private Album albumes[];

    public Artista(){}

    public Artista(Album albumes[]){
        this.albumes = albumes;
    }

    public void setAlbumes(Album[] albumes) {
        this.albumes = albumes;
    }
    public Album[] getAlbumes() {
        return albumes;
    }

    public void administrarAnuncios(){

    }

    public void administrarEventos(){

    }

    public void administrarContenido(){

    }

    public void administrarTienda(){

    }

    public void administrarCanales(){

    }

    public void crearLive(){
        
    }
}
