package oop.iras_section2_aut24;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserManagementController {

    @FXML
    private PasswordField passwordInput;

    @FXML
    private TableView<User> tableView;

    @FXML
    private TableColumn<User, String> tcPassword;

    @FXML
    private TableColumn<User, String> tcUsername;

    @FXML
    private TableColumn<User, String> tcType;

    @FXML
    private TextField usernameInput;

    @FXML
    private ChoiceBox<String> userTypeInput;

    private List<User> userList = new ArrayList<>();

    @FXML
    protected void initialize() {
        tcUsername.setCellValueFactory(new PropertyValueFactory<>("username"));
        tcPassword.setCellValueFactory(new PropertyValueFactory<>("password"));
        tcType.setCellValueFactory(new PropertyValueFactory<>("userType"));

        userTypeInput.getItems().addAll(User.USER_TYPES);
        userTypeInput.setValue("User");

        UserManager userManager = new UserManager();
        userList = userManager.getUsers();
        tableView.getItems().addAll(userList);
    }

    @FXML
    void onDeleteUserButtonClick(ActionEvent event) {
        User selectedUser = tableView.getSelectionModel().getSelectedItem();
        if (selectedUser != null) {
            tableView.getItems().remove(selectedUser);
            userList.remove(selectedUser);
        }
    }

    @FXML
    void onAddUserButtonClick(ActionEvent event) {
        String username = usernameInput.getText();
        String password = passwordInput.getText();
        String userType = userTypeInput.getValue();

        if (username.isBlank() || password.isBlank() || userType.isBlank()) {
//            label.setText("Please enter a valid username and password.")
            return;
        }

        for (User u: tableView.getItems()) {
            if (u.getUsername().equals(username)) {
                return;
            }
        }

        User newUser = new User(username, password, userType);

        tableView.getItems().add(newUser);
        userList.add(newUser);
    }

    @FXML
    protected void onLogOutButtonClick(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root);

        stage.setScene(scene);
    }

    @FXML
    protected void onBackButtonClick(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("dashboard.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root);

        stage.setScene(scene);
    }

}
