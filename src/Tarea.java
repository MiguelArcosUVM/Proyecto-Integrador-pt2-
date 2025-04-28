public class Tarea {
    private static int contadorIds = 1;  // contador para asignar IDs únicos

    private int id;
    private String descripcion;
    private String fecha;
    private String estado;

    // constructor original (estado por defecto: Pendiente)
    public Tarea(String descripcion, String fecha) {
        this.id = contadorIds++;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.estado = "Pendiente";
    }

    // nuevo constructor que recibe también el estado
    public Tarea(String descripcion, String fecha, String estado) {
        this.id = contadorIds++;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.estado = estado;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
