module com.example.projektmango {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projektmango to javafx.fxml;
    exports com.example.projektmango;
}