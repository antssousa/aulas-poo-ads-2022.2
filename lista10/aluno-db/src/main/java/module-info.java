module ifpi.poo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens ifpi.poo to javafx.fxml;

    exports ifpi.poo;
}
