package AbaCal;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class AbaCal extends Application {

    public static void main(String[] args) {
        System.out.println("Hello world");
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("AbaCal.fxml")));
        primaryStage.setTitle("Hello World");
        if (root != null) {
            primaryStage.setScene(new Scene(root, 300, 275));
        } else {
            return;
        }
        primaryStage.show();

    }
}
