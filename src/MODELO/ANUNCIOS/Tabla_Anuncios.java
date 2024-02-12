package MODELO.ANUNCIOS;

import java.util.ArrayList;

public class Tabla_Anuncios {
    private ArrayList<Anuncios> anuncios;

    public Tabla_Anuncios() {
        this.anuncios = new ArrayList<>();
    }

    public void agregarAnuncios(Anuncios anuncio) {
        anuncios.add(anuncio);
    }

    public ArrayList<Anuncios> getAnuncios() {
        return anuncios;
    }

    public void mostrarAnuncios() {
        for (Anuncios anuncio : anuncios) {
            anuncio.mostrarAnuncio();
        }
    }
