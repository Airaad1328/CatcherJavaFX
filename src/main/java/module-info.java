module com.example.javademogame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javademogame to javafx.fxml;
    exports com.example.javademogame;
}