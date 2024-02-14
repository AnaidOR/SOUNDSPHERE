package MODELO.EVENTOS;

public class GestorEventos {
    private String nombreEvento;
    private String fechaEvento;
    private int capacidad;
    private boolean disponibilidad;

    // Método para recibir los datos del evento
    public void recibeDatosEvento() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nombre del evento:");
        nombreEvento = scanner.nextLine();
        System.out.println("Introduce la fecha del evento:");
        fechaEvento = scanner.nextLine();
        System.out.println("Introduce la capacidad del evento:");
        capacidad = scanner.nextInt();
    }

    // Método para recibir la disponibilidad del evento
    public void recibeDisponibilidadEvento(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    // Método para validar los datos del evento
    public boolean validacionDatosEvento() {
        if (nombreEvento != null && !nombreEvento.isEmpty() &&
                fechaEvento != null && !fechaEvento.isEmpty() &&
                capacidad > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        GestorEventos gestor = new GestorEventos();

        // Recibe datos del evento
        gestor.recibeDatosEvento();

        // Recibe disponibilidad del evento
        gestor.recibeDisponibilidadEvento(true);

        // Valida los datos del evento
        boolean datosValidos = gestor.validacionDatosEvento();
        if (datosValidos) {
            System.out.println("Los datos del evento son válidos.");
        } else {
            System.out.println("Los datos del evento no son válidos.");
        }
    }
}
