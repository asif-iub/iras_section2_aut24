package oop.iras_section2_aut24;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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
