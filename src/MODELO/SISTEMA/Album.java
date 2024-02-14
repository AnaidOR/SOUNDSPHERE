package MODELO.SISTEMA;

public class Album {
    private String nombreAlbum;
    private String autor;
    private int fechaLanzamiento;
    private String creditos;
    private int numeroDeCanciones;

    // Constructor
    public Album(String nombreAlbum, String autor, int fechaLanzamiento, String creditos, int numeroDeCanciones) {
        this.nombreAlbum = nombreAlbum;
        this.autor = autor;
        this.fechaLanzamiento = fechaLanzamiento;
        this.creditos = creditos;
        this.numeroDeCanciones = numeroDeCanciones;
    }

    // Getters y Setters
    public String getNombreAlbum() {
        return nombreAlbum;
    }

    public void setNombreAlbum(String nombreAlbum) {
        this.nombreAlbum = nombreAlbum;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(int fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

    public int getNumeroDeCanciones() {
        return numeroDeCanciones;
    }

    public void setNumeroDeCanciones(int numeroDeCanciones) {
        this.numeroDeCanciones = numeroDeCanciones;
    }

    // Método para mostrar los detalles del álbum
    public void mostrarDetalles() {
        System.out.println("Detalles del álbum:");
        System.out.println("Nombre del álbum: " + nombreAlbum);
        System.out.println("Autor: " + autor);
        System.out.println("Fecha de Lanzamiento: " + fechaLanzamiento);
        System.out.println("Créditos: " + creditos);
        System.out.println("Número de Canciones: " + numeroDeCanciones);
    }

}
