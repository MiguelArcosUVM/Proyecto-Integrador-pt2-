import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class VentanaConsultar extends JFrame {
    private JTable tablaTareas;
    private DefaultTableModel modelo;

    public VentanaConsultar() {
        setTitle("Consultar Tareas");
        setSize(600, 350);
        setLayout(new BorderLayout());


        String[] columnas = {"ID", "Descripción", "Fecha", "Estado"};
        modelo = new DefaultTableModel(columnas, 0);
        tablaTareas = new JTable(modelo);
        add(new JScrollPane(tablaTareas), BorderLayout.CENTER);

        actualizarTabla();

        setLocationRelativeTo(null);
    }

    private void actualizarTabla() {
        modelo.setRowCount(0); // Limpiar tabla antes de actualizar
        List<Tarea> tareas = GestordeTareas.getTareas();
        for (Tarea tarea : tareas) {
            modelo.addRow(new Object[]{tarea.getId(), tarea.getDescripcion(), tarea.getFecha(), tarea.getEstado()});
        }
    }
}
