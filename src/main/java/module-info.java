module application.workshopjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;


    exports application;
    opens application to javafx.fxml;
}