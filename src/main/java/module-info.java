module com.example.zakatcalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.zakatcalculator to javafx.fxml;
    exports com.example.zakatcalculator;
}