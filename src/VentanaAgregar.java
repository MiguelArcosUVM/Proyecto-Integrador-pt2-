import javax.swing.*;
import java.awt.*;

public class VentanaAgregar extends JFrame {
    private JTextField txtDescripcion;
    private JTextField txtFecha;
    private JComboBox<String> comboEstado;
    private JButton btnGuardar;

    public VentanaAgregar() {
        setTitle("Agregar Nueva Tarea");
        setSize(350, 200);
        setLayout(new GridLayout(4, 2, 5, 5));

        add(new JLabel("Descripción:"));
        txtDescripcion = new JTextField();
        add(txtDescripcion);

        add(new JLabel("Fecha (YYYY-MM-DD):"));
        txtFecha = new JTextField();
        add(txtFecha);

        add(new JLabel("Estado:"));
        comboEstado = new JComboBox<>(new String[]{"Corriendo", "No Corriendo"});
        add(comboEstado);

        btnGuardar = new JButton("Guardar");
        add(btnGuardar);

        btnGuardar.addActionListener(e -> guardarTarea());

        setLocationRelativeTo(null);
    }

    private void guardarTarea() {
        String descripcion = txtDescripcion.getText().trim();
        String fecha = txtFecha.getText().trim();
        String estado = (String) comboEstado.getSelectedItem();

        if (descripcion.isEmpty() || fecha.isEmpty()) {
            JOptionPane.showMessageDialog(this, "La descripción y la fecha son obligatorias.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

       

        Tarea nuevaTarea = new Tarea(descripcion, fecha, estado);
        GestordeTareas.agregarTarea(nuevaTarea);

        JOptionPane.showMessageDialog(this, "Tarea agregada correctamente.");
        this.dispose(); 
    }
}
