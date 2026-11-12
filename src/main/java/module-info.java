module org.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires xstream;

    opens org.example to javafx.fxml, xstream;
    exports org.example;
}
