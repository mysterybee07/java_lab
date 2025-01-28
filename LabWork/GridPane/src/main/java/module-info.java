module com.example.gridpane {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.gridpane to javafx.fxml;
    exports com.example.gridpane;
    exports Lab46; // Correct package export
}
