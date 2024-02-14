package MODELO.SISTEMA;

public class Cancion {
  
       // Constructor
    public Cancion(String titulo, String autor, int duracion, String letra, String genero, String creditos, int fechaLanzamiento) {
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        this.letra = letra;
        this.genero = genero;
        this.creditos = creditos;
        this.fechaLanzamiento = fechaLanzamiento;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getLetra() {
        return letra;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreditos() {
        return creditos;
    }

    public int getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

    public void setFechaLanzamiento(int fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }
}
 // Método para mostrar los detalles de la canción
    public void mostrarDetalles() {
        System.out.println("Detalles de la canción:");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Duración: " + duracion + " segundos");
        System.out.println("Letra: " + letra);
        System.out.println("Género: " + genero);
        System.out.println("Créditos: " + creditos);
        System.out.println("Fecha de Lanzamiento: " + fechaLanzamiento);
    }
}
