module com.isb.interfazsb {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.isb.interfazsb to javafx.fxml;
    exports com.isb.interfazsb;
}