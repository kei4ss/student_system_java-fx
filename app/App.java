package app;
import app.frontEnd.Util.ConfigControllers;
import app.frontEnd.controllers.Navigation;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        ConfigControllers.setStage(stage);
        Navigation.toStudentLoginScreen();
    }
}
