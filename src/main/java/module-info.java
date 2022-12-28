module application.workshopjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    exports application;
    opens application to javafx.fxml;
    exports model.entities;
    opens model.entities to javafx.fxml;
    exports model.services;
    opens model.services to javafx.fxml;
}