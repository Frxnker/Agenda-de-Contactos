module org.example.agendadecontactos {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.example.agendadecontactos to javafx.fxml;
    exports org.example.agendadecontactos;
}