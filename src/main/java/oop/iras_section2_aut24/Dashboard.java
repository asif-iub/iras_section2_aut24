package oop.iras_section2_aut24;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

public class Dashboard {
    @FXML
    protected void onLogOutButtonClick(ActionEvent event) throws IOException {
        SceneManager.logOut();
    }

    @FXML
    protected void goToProfile(ActionEvent event) throws IOException {
        SceneManager.switchScene("nawez/profile.fxml");
    }

    @FXML
    protected void goToUserManagement(ActionEvent event) throws IOException {
        SceneManager.switchScene("nazmul/user-management.fxml");
    }

    @FXML
    protected void goToCharts(ActionEvent event) throws IOException {
        SceneManager.switchScene("charts.fxml");
    }

}
