package app;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("frontEnd/gui/studentLogin.fxml"));
        stage.setTitle("java School");
        stage.setScene(new Scene(root, 800, 500));
        stage.setResizable(false);
        stage.show();
    }
}
