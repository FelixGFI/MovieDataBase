module com.example.moviedatabase {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.moviedatabase to javafx.fxml;
    exports com.example.moviedatabase;
}