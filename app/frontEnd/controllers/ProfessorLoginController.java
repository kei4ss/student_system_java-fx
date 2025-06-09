package app.frontEnd.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
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
    private Button btnLogin;

    @FXML
    void functionToStudent() {
        try {
            Navigation.toStudentLoginScreen();
        }catch(Exception e){
            alertLabel.setText("Erro ao carregar página de estudante!");
        }
    }

    @FXML
    void login(){
        if(!CommomTools.isFieldReady(loginFiled)){
            alertLabel.setText("Preencha a área de login...");
            return;
        }if(!CommomTools.isFieldReady(passwordField)){
            alertLabel.setText("Preencha a área de senha...");
            return;
        }
        alertLabel.setText("");
    }
}
