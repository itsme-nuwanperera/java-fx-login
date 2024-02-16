module org.nuwaperera.javfxlogin {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.nuwaperera.javfxlogin to javafx.fxml;
    exports org.nuwaperera.javfxlogin;
}