package hu.fzks.fazekas_tamas_szamologep;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class SzamologepController {

    @FXML
    private TextField szam1;
    @FXML
    private TextField szam2;
    @FXML
    private Label eredmenyLabel;

    private int[] ellenorzes(){
        String a = szam1.getText();
        String b = szam2.getText();
        int[] szamok = new int[2];
        if (a == "" || b == ""){
            Alert alert = new Alert(Alert.AlertType.ERROR,"Mindkét mezőt ki kell tölteni!");
            alert.show();
        } else {
            try {
                szamok[0] = Integer.parseInt(a);
                szamok[1] = Integer.parseInt(b);
            } catch (Exception e) {
                Alert alert = new Alert(Alert.AlertType.ERROR,"Nem számot adott meg!");
                alert.show();
            }
        }
        return szamok;
    }
    @FXML
    public void osszadas(ActionEvent actionEvent) {
        int[] szamok = ellenorzes();
        int eredmeny = szamok[0] + szamok[1];
        eredmenyLabel.setText(String.valueOf(eredmeny));
    }

    @FXML
    public void kivonas(ActionEvent actionEvent) {
        int[] szamok = ellenorzes();
        int eredmeny = szamok[0] - szamok[1];
        eredmenyLabel.setText(String.valueOf(eredmeny));
    }

    @FXML
    public void szorzas(ActionEvent actionEvent) {
        int[] szamok = ellenorzes();
        int eredmeny = szamok[0] * szamok[1];
        eredmenyLabel.setText(String.valueOf(eredmeny));
    }

    @FXML
    public void osztas(ActionEvent actionEvent) {
        int[] szamok = ellenorzes();
        int eredmeny = szamok[0] / szamok[1];
        eredmenyLabel.setText(String.valueOf(eredmeny));
    }

    @FXML
    public void szazalek(ActionEvent actionEvent) {
        int[] szamok = ellenorzes();
        int eredmeny = szamok[0] % szamok[1];
        eredmenyLabel.setText(String.valueOf(eredmeny));
    }
}