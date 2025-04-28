import java.util.ArrayList;
import java.util.List;

public class GestordeTareas {
    private static List<Tarea> listaDeTareas = new ArrayList<>();

    public static void agregarTarea(Tarea tarea) {
        listaDeTareas.add(tarea);
    }

    public static List<Tarea> getTareas() {
        return listaDeTareas;
    }

    public static void eliminarTarea(int id) {
        listaDeTareas.removeIf(tarea -> tarea.getId() == id);
    }

    public static void modificarTarea(int id, Tarea tareaModificada) {
        for (int i = 0; i < listaDeTareas.size(); i++) {
            if (listaDeTareas.get(i).getId() == id) {
                listaDeTareas.set(i, tareaModificada);
                break;
            }
        }
    }
}
