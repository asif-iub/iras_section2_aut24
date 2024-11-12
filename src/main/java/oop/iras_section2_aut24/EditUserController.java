package oop.iras_section2_aut24;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import java.io.IOException;

public class EditUserController {
    @javafx.fxml.FXML
    private TextField passwordTextField;
    @javafx.fxml.FXML
    private ChoiceBox<String> userTypeCB;
    @javafx.fxml.FXML
    private TextField usernameTextField;

    private User user = null;

    public void setUser(User user) {
        this.user = user;

        usernameTextField.setText(user.getUsername());
        passwordTextField.setText(user.getPassword());
        userTypeCB.setValue(user.getUserType());
    }

    @FXML
    void initialize() {
        userTypeCB.getItems().addAll(User.USER_TYPES);
    }

    @javafx.fxml.FXML
    public void onUpdateButtonClick(ActionEvent actionEvent) throws IOException {
        user.setUsername(usernameTextField.getText());
        user.setPassword(passwordTextField.getText());
        user.setUserType(userTypeCB.getValue());

        SceneManager.switchScene("user-management.fxml");
    }

    @javafx.fxml.FXML
    public void onBackButtonClick(ActionEvent actionEvent) throws IOException {
        SceneManager.switchScene("user-management.fxml");
    }

    @javafx.fxml.FXML
    public void onLogOutButtonClick(ActionEvent actionEvent) throws IOException {
        SceneManager.logOut();
    }
}
