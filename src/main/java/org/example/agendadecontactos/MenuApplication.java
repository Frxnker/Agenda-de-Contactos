package org.example.agendadecontactos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // Cargar el archivo FXML
        Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));

        // Configurar la escena
        Scene scene = new Scene(root);

        // Configurar el escenario
        stage.setTitle("Agenda de Contactos"); // Cambia el título según tu aplicación
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    //

}
