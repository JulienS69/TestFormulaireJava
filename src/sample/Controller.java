package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Button btnOK;
    @FXML
    private Label liblMessage;

    public void handleBtnOK(ActionEvent actionEvent) {
        liblMessage.setText("OK button is clicked :)");
    }
}
