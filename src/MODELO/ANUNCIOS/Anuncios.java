package MODELO.ANUNCIOS;

import java.util.Date;

public class Anuncios{
    private int id;
    private String titulo;
    private String contenido;
    private String url;
    private Date fechaCreacion;

    public Anuncios(int id, String titulo, String contenido, String url, Date fechaCreacion) {
        this.id = id;
        this.titulo = titulo;
        this.contenido = contenido;
        this.url = url;
        this.fechaCreacion = fechaCreacion;
    }

    // Getters y setters para todos los atributos

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void mostrarAnuncio() {
        System.out.println("ID: " + id);
        System.out.println("Título: " + titulo);
        System.out.println("Contenido: " + contenido);
        System.out.println("URL: " + url);
        System.out.println("Fecha de Creación: " + fechaCreacion);
    }

}
