package MODELO.ANUNCIOS;

import java.util.Date;

public class GestorAnuncios {
    private Tabla_Anuncios tablaAnuncios;

    public GestorAnuncios() {
        this.tablaAnuncios = new Tabla_Anuncios();
    }

    public void publicarAnuncio(int id, String titulo, String contenido, String url, Date fechaCreacion) {
        Anuncios nuevoAnuncio = new Anuncios(id, titulo, contenido, url, fechaCreacion);
        tablaAnuncios.agregarAnuncios(nuevoAnuncio);
    }

    public void actualizarAnuncio(int id, String nuevoContenido) {
        for (Anuncios anuncio : tablaAnuncios.getAnuncios()) {
            if (anuncio.getId() == id) {
                anuncio.setContenido(nuevoContenido);
                return;
            }
        }
        System.out.println("Anuncio con ID " + id + " no encontrado.");
    }

    public void mostrarTodosAnuncios() {
        tablaAnuncios.mostrarAnuncios();
    }
}
