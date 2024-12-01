module oop.iras_section2_aut24 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens oop.iras_section2_aut24 to javafx.fxml;
    exports oop.iras_section2_aut24;
    exports oop.iras_section2_aut24.nazmul;
    opens oop.iras_section2_aut24.nazmul to javafx.fxml;
}