module com.example.borderpane {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.borderpane to javafx.fxml;
    exports com.example.borderpane;
    exports Lab45 to javafx.graphics;  // Export the Lab45 package to javafx.graphics
}
