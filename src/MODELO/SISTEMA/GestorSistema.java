package MODELO.SISTEMA;

public class GestorSistema {
    private Cancion cancion;
    private RelacionDeCanciones relacionDeCanciones;
    private Playlist playlist;
    private Album album;
    private Sistema sistema;

    // Constructor
    public GestorSistema(Cancion cancion, RelacionDeCanciones relacionDeCanciones, Playlist playlist, Album album, Sistema sistema) {
        this.cancion = cancion;
        this.relacionDeCanciones = relacionDeCanciones;
        this.playlist = playlist;
        this.album = album;
        this.sistema = sistema;
    }

    // Getters y Setters
    public Cancion getCancion() {
        return cancion;
    }

    public void setCancion(Cancion cancion) {
        this.cancion = cancion;
    }

    public RelacionDeCanciones getRelacionDeCanciones() {
        return relacionDeCanciones;
    }

    public void setRelacionDeCanciones(RelacionDeCanciones relacionDeCanciones) {
        this.relacionDeCanciones = relacionDeCanciones;
    }

    public Playlist getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }

    // Método para mostrar los detalles del gestor de sistema
    public void mostrarDetalles() {
        System.out.println("Detalles del Gestor de Sistema:");
        System.out.println("Canción: " + cancion.getTitulo());
        System.out.println("Relación de Canciones: " + relacionDeCanciones);
        System.out.println("Playlist: " + playlist.getNombre());
        System.out.println("Álbum: " + album.getNombreAlbum());
        System.out.println("Sistema: " + sistema.getNombre());
    }

}
