module com.sma.collectivesortingtp2sma {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.sma.collectivesortingtp2sma to javafx.fxml;
    exports com.sma.collectivesortingtp2sma;
}