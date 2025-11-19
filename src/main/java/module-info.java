module fatec.lanchoneteapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;
    requires jtds;

    opens fatec.lanchoneteapp.run to javafx.fxml;
    exports fatec.lanchoneteapp.run;
    exports fatec.lanchoneteapp.adapters.ui;
}