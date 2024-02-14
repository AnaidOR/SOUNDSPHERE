package MODELO.SISTEMA;

public class SistemaDeStreaming {
    private boolean reproduciendo;
    private int indiceCancionActual;
    private String[] canciones;

    public SistemaDeStreaming(String[] canciones) {
        this.canciones = canciones;
        this.indiceCancionActual = 0;
        this.reproduciendo = false;
    }

    public void reproducirCancion() {
        if (canciones.length > 0) {
            reproduciendo = true;
            System.out.println("Reproduciendo: " + canciones[indiceCancionActual]);
        } else {
            System.out.println("No hay canciones para reproducir.");
        }
    }

    public void pausarCancion() {
        if (reproduciendo) {
            reproduciendo = false;
            System.out.println("Canción pausada: " + canciones[indiceCancionActual]);
        } else {
            System.out.println("No hay ninguna canción reproduciéndose actualmente.");
        }
    }

    public void anteriorCancion() {
        if (indiceCancionActual > 0) {
            indiceCancionActual--;
            System.out.println("Reproduciendo canción anterior: " + canciones[indiceCancionActual]);
        } else {
            System.out.println("Ya estás en la primera canción.");
        }
    }

    public void siguienteCancion() {
        if (indiceCancionActual < canciones.length - 1) {
            indiceCancionActual++;
            System.out.println("Reproduciendo siguiente canción: " + canciones[indiceCancionActual]);
        } else {
            System.out.println("Ya estás en la última canción.");
        }
    }

    public static void main(String[] args) {
        String[] canciones = {"Canción 1", "Canción 2", "Canción 3", "Canción 4"};
        SistemaDeStreaming sistema = new SistemaDeStreaming(canciones);

        // Ejemplo de uso de los métodos
        sistema.reproducirCancion();
        sistema.siguienteCancion();
        sistema.anteriorCancion();
        sistema.pausarCancion();
    }
}                             
