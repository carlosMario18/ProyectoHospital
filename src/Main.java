import controller.ControladorCitas;
import view.vistaIngreso;
import view.vistaListaPacientes;
import view.vistaPrincipal;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }

        // Crear una instancia de ControladorCitas
        ControladorCitas controlador = new ControladorCitas();

        // Crear una instancia de vistaListaPacientes y pasar el controlador al constructor
        vistaListaPacientes listaPacientesFrame = new vistaListaPacientes();
        //listaPacientesFrame.actualizarTablaCitas(); // Llamada al método en la instancia creada

        //Instancia vistaPrincipal

        vistaPrincipal principalFrame = new vistaPrincipal();
        principalFrame.setVisible(true);


    }
}


