package oop.iras_section2_aut24;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HelloController {
    @FXML
    private Label msgLabel;

    @FXML
    private TextField usernameInput;

    @FXML
    private PasswordField passwordInput;

    @FXML
    protected void onSignInButtonClick(ActionEvent event) throws IOException {
        String username = usernameInput.getText();
        String password = passwordInput.getText();

        List<User> userList = UserManager.getUsers();

        for (User u : userList) {
            if (username.equals(u.getUsername()) && password.equals(u.getPassword())) {
                msgLabel.setText("Log in successful!");
                UserManager.setLoggedInUser(u);

                SceneManager.switchScene("dashboard.fxml");

                return;
            }
        }

        msgLabel.setText(("Log in failed!"));

    }
}