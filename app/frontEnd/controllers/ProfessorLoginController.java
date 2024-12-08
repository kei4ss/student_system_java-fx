package app.frontEnd.controllers;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;

public class ProfessorLoginController {
    private final ConfigControllers config = new ConfigControllers();

    @FXML
    AnchorPane aPaneProfessor;

    @FXML
    void functionToStudent() {
        try {
            config.changeScreen(aPaneProfessor, "../gui/studentLogin.fxml");
        }catch(IOException e){
            System.out.println("erro ao carregar página");
        }
    }
}
