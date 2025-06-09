package app.frontEnd.controllers;

import javafx.scene.control.TextField;

public class CommomTools {
    public static boolean isFieldReady(TextField field){
        if(field.getText().length() > 0){
            field.getStyleClass().removeAll();
            field.setStyle("-fx-background-color: #f4f4f4;");
            return true;
        }
        field.setStyle("-fx-background-color: #ffdddd;");
        return false;
    }
}
