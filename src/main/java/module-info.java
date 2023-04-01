module hu.fzks.fazekas_tamas_szamologep {
    requires javafx.controls;
    requires javafx.fxml;


    opens hu.fzks.fazekas_tamas_szamologep to javafx.fxml;
    exports hu.fzks.fazekas_tamas_szamologep;
}