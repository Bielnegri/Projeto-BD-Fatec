module fatec.lanchoneteapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens fatec.lanchoneteapp.start to javafx.fxml;
    exports fatec.lanchoneteapp.start;
    exports fatec.lanchoneteapp.adapters.ui;
}