package app.frontEnd.Util;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ConfigControllers {
    private static Stage stage;

    public static void changeScreen(String path, String titleWindow) throws IOException {
        Parent root = FXMLLoader.load(ConfigControllers.class.getResource(path));
        Scene scene = new Scene(root);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.setTitle(titleWindow);
        stage.show();
    }

    public static void setStage(Stage stage) {
        ConfigControllers.stage = stage;
    }
}
