package MODELO.EVENTOS;

public class Eventos {
    private String descripcion;
    private LocalDateTime fechaYHora;
    private String nombreDelEvento;

    // Constructor
    public Eventos(String descripcion, LocalDateTime fechaYHora, String nombreDelEvento) {
        this.descripcion = descripcion;
        this.fechaYHora = fechaYHora;
        this.nombreDelEvento = nombreDelEvento;
    }

    // Getters y Setters
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getFechaYHora() {
        return fechaYHora;
    }

    public void setFechaYHora(LocalDateTime fechaYHora) {
        this.fechaYHora = fechaYHora;
    }

    public String getNombreDelEvento() {
        return nombreDelEvento;
    }

    public void setNombreDelEvento(String nombreDelEvento) {
        this.nombreDelEvento = nombreDelEvento;
    }

    // Método para mostrar los detalles del evento
    public void mostrarDetalles() {
        System.out.println("Detalles del evento:");
        System.out.println("Nombre del evento: " + nombreDelEvento);
        System.out.println("Fecha y hora: " + fechaYHora);
        System.out.println("Descripción: " + descripcion);
    }
}
