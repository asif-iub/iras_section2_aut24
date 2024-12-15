package oop.iras_section2_aut24.nawez;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import oop.iras_section2_aut24.SceneManager;
import oop.iras_section2_aut24.UserManager;

import java.io.IOException;

public class Profile {

    @FXML
    private TextField usernameTextField;

    @FXML
    void initialize() {
        usernameTextField.setText(UserManager.getLoggedInUser().getUsername());
    }

    @FXML
    protected void onLogOutButtonClick(ActionEvent event) throws IOException {
        SceneManager.logOut();
    }

    @FXML
    protected void onBackButtonClick(ActionEvent event) throws IOException {
        SceneManager.switchScene("dashboard.fxml");
    }
}
