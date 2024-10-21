module smart.kolloso {
    requires javafx.controls;
    requires javafx.fxml;


    opens smart.kolloso to javafx.fxml;
    exports smart.kolloso;
}