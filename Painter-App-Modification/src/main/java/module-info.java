module com.example.painterappmodification {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.painterappmodification to javafx.fxml;
    exports com.example.painterappmodification;
}