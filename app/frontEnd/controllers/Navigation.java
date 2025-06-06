package app.frontEnd.controllers;

import app.frontEnd.Util.ConfigControllers;

public class Navigation {
    public static void toStudentLoginScreen() throws Exception{
        ConfigControllers.changeScreen("../gui/FXML/studentLogin.fxml", "Student login");
    }
    public static void toProfessorLoginScreen() throws Exception{
        ConfigControllers.changeScreen("../gui/FXML/professorLogin.fxml", "Professor login");
    }
}
