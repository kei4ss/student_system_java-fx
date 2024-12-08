package app.frontEnd.controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.Scene;

import java.io.IOException;

public class ConfigControllers {
    public ConfigControllers(){}

    public void changeScreen(AnchorPane aPane, String path) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(path));
        Stage scene = (Stage) aPane.getScene().getWindow();
        scene.setTitle("Java School");
        scene.setScene(new Scene(root, 800, 500));
        scene.show();

    }
}
