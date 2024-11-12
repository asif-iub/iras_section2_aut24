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

    @FXML
    protected void initialize() {
        tcUsername.setCellValueFactory(new PropertyValueFactory<>("username"));
        tcPassword.setCellValueFactory(new PropertyValueFactory<>("password"));
        tcType.setCellValueFactory(new PropertyValueFactory<>("userType"));

        userTypeInput.getItems().addAll(User.USER_TYPES);
        userTypeInput.setValue("User");

        List<User> userList = UserManager.getUsers();
        tableView.getItems().addAll(userList);
    }

    @FXML
    void onDeleteUserButtonClick(ActionEvent event) {
        User selectedUser = tableView.getSelectionModel().getSelectedItem();
        if (selectedUser != null) {
            if (selectedUser == UserManager.getLoggedInUser()){
                System.out.println("User cannot delete itself!");
                return;
            }

            tableView.getItems().remove(selectedUser);
            UserManager.deleteUser(selectedUser);
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
        UserManager.addUser(newUser);
    }

    @FXML
    protected void onLogOutButtonClick(ActionEvent event) throws IOException {
        SceneManager.logOut();
    }

    @FXML
    protected void onBackButtonClick(ActionEvent event) throws IOException {
        SceneManager.switchScene("dashboard.fxml");
    }

    @FXML
    public void onEditUserButtonClick(ActionEvent actionEvent) throws IOException {
        User u = tableView.getSelectionModel().getSelectedItem();
        if (u == null) {
            System.out.println("No user is selected!");
            return;
        }

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("edit-user.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);
        stage.setScene(scene);

        EditUserController controller = loader.getController();
        controller.setUser(u);

//        SceneManager.switchScene("edit-user.fxml");
    }
}
