import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {
    private JButton btnConsultar;
    private JButton btnAgregar;
    private JButton btnEliminar;

    public VentanaPrincipal() {
        setTitle("Gestión de Tareas");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        btnConsultar = new JButton("Consultar Tareas");
        btnAgregar = new JButton("Agregar Tarea");
        btnEliminar = new JButton("Eliminar Tarea");

        add(btnConsultar);
        add(btnAgregar);
        add(btnEliminar);

        // Eventos
        btnConsultar.addActionListener(e -> new VentanaConsultar().setVisible(true));
        btnAgregar.addActionListener(e -> new VentanaAgregar().setVisible(true));
        btnEliminar.addActionListener(e -> new VentanaEliminar().setVisible(true));

        setLocationRelativeTo(null);
    }
}
