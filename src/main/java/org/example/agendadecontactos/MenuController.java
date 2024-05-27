package org.example.agendadecontactos;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.application.Platform;

public class MenuController {

    @FXML
    private Button addButton;

    @FXML
    private void botonAñadir() {
        try {
            // Cargar la nueva ventana desde el archivo FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Añadir.fxml"));
            Parent root = loader.load();

            // Crear la escena
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Añadir Contacto");

            // Mostrar la ventana
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void botonPapelera() {
        try {
            // Cargar la nueva ventana desde el archivo FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Papelera.fxml"));
            Parent root = loader.load();

            // Crear la escena
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Añadir Contacto");

            // Mostrar la ventana
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private Button exitButton;

    @FXML
    private void handleExitButton() {
        Platform.exit(); // Cierra la aplicación
    }
}

