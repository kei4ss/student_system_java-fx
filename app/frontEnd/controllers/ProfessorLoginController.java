package app.frontEnd.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class ProfessorLoginController {

    @FXML
    private Label alertLabel;

    @FXML
    private TextField loginFiled;

    @FXML
    private PasswordField passwordField;

    @FXML
    void functionToStudent() {
        try {
            Navigation.toStudentLoginScreen();
        }catch(Exception e){
            alertLabel.setText("Erro ao carregar página de estudante!");
        }
    }
}
