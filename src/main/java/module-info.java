module com.example.helicoptergameplayer {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.helicoptergameplayer to javafx.fxml;
    exports com.example.helicoptergameplayer;
}