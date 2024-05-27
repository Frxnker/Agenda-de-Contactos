package org.example.agendadecontactos;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class PapeleraController {

    @FXML
    private Button cancelButton;

    @FXML
    private void handleCancelButton() {
        // Obtiene la ventana actual y la cierra
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

}
