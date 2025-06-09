package app.frontEnd.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class StudentLoginController {

    @FXML
    private Label alertLabel;

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Button btnEnter;

    @FXML
    private Button btnToProfessor;

    @FXML
    private TextField loginField;

    @FXML
    private PasswordField passwordField;


    @FXML
    void functionToProfessor(){
        try {
            Navigation.toProfessorLoginScreen();
        }catch (Exception e){
            alertLabel.setText("Erro ao acessar área de professor!");
        }
    }

    @FXML
    void acessar(){
        if(!CommomTools.isFieldReady(loginField)){
            alertLabel.setText("Preencha o campo de login!");
            return;
        }if(!CommomTools.isFieldReady(passwordField)){
            alertLabel.setText("Preencha o campo de senha!");
            return;
        }
        alertLabel.setText("");
    }
}
