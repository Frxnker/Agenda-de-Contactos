package org.example.agendadecontactos;

import javafx.fxml.FXML;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class AñadirController {

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtApellidos;

    @FXML
    private TextField txtTelefono;

    @FXML
    private TextField txtCorreo;

    private static final String URL = "jdbc:mysql://localhost:3306/agenda";
    private static final String USUARIO = "root";
    private static final String CONTRASEÑA = "1234";

    @FXML
    private void handleAcceptButton() {
        String nombre = txtNombre.getText();
        String apellidos = txtApellidos.getText();
        String telefono = txtTelefono.getText();
        String correo = txtCorreo.getText();

        try (Connection conexión = DriverManager.getConnection(URL, USUARIO, CONTRASEÑA)) {
            String sql = "INSERT INTO Contactos (nombre, apellidos, telefono, correo) VALUES (?, ?, ?, ?)";
            try (PreparedStatement declaración = conexión.prepareStatement(sql)) {
                declaración.setString(1, nombre);
                declaración.setString(2, apellidos);
                declaración.setString(3, telefono);
                declaración.setString(4, correo);
                declaración.executeUpdate();
                System.out.println("Contacto guardado correctamente en la base de datos.");
            }
        } catch (SQLException e) {
            System.err.println("Error al guardar el contacto en la base de datos: " + e.getMessage());
        }
    }

    @FXML
    private Button cancelButton;

    @FXML
    private void handleCancelButton() {
        // Obtiene la ventana actual y la cierra
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

}
