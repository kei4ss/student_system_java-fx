package app.frontEnd.controllers;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;

public class StudentLoginController {
    private final ConfigControllers config = new ConfigControllers();

    @FXML
    AnchorPane anchorPane;

    @FXML
    void functionToProfessor(){
        try {
            config.changeScreen(anchorPane, "../gui/professorLogin.fxml");
        }catch (IOException e){
            System.out.println("Change screen erro");
        }
    }
}
