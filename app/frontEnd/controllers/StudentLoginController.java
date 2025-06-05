package app.frontEnd.controllers;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class StudentLoginController {
    @FXML
    AnchorPane anchorPane;

    @FXML
    void functionToProfessor(){
        try {
            Navigation.toProfessorLoginScreen();
        }catch (Exception e){
            System.out.println("Change screen erro");
        }
    }
}
