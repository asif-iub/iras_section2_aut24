package oop.iras_section2_aut24;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneManager {
    private static Stage stage;

    public static void setStage(Stage stage) {
        SceneManager.stage = stage;
    }

    public static void switchScene(String fxmlFileName) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                HelloApplication.class.getResource(fxmlFileName)
        );
        Parent root = fxmlLoader.load();
//
//        Parent root1 = FXMLLoader.load(
//                HelloApplication.class.getResource("hello-view.fxml")
//        );

        Scene scene = new Scene(root);

        stage.setScene(scene);
    }

    public static void switchScene(String fxmlFileName, Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root);
        stage.setScene(scene);
    }

    public static void logOut() throws IOException {
        switchScene("hello-view.fxml");
    }
}
