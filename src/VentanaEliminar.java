import javax.swing.*;
import java.awt.*;

public class VentanaEliminar extends JFrame {
    private JTextField txtId;
    private JButton btnEliminar;

    public VentanaEliminar() {
        setTitle("Eliminar Tarea");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(2, 2));

        add(new JLabel("ID de la tarea a eliminar:"));
        txtId = new JTextField();
        add(txtId);

        btnEliminar = new JButton("Eliminar");
        add(btnEliminar);

        // Espacio vacío
        add(new JLabel());

        // Evento
        btnEliminar.addActionListener(e -> {
            try {
                int id = Integer.parseInt(txtId.getText());
                GestordeTareas.eliminarTarea(id);

                JOptionPane.showMessageDialog(this, "Tarea eliminada exitosamente.");
                dispose(); // cerrar la ventana
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "ID debe ser un número entero.", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error al eliminar tarea: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        setLocationRelativeTo(null);
    }
}
