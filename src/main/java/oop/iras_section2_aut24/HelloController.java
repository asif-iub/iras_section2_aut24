package oop.iras_section2_aut24;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label msgLabel;

    @FXML
    private TextField usernameInput;

    @FXML
    private PasswordField passwordInput;

    @FXML
    protected void onSignInButtonClick() {
        String username = usernameInput.getText();
        String password = passwordInput.getText();

        if (username.equals("asif") && password.equals("1234")) {
            msgLabel.setText("Log in successful!");
        }
        else{
            msgLabel.setText(("Log in failed!"));
        }
    }
}