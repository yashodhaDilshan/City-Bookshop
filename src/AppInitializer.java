import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.image.Image;

import java.awt.*;
import java.io.IOException;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        Parent parent = FXMLLoader.load(getClass().getResource("View/ManagerMenu.fxml")); // View/Intro.fxml
        Scene scene = new Scene(parent);
        primaryStage.setScene(scene);
        primaryStage.centerOnScreen();
        Image image = new Image("Images/icons8-books-48 (1).png");
        primaryStage.getIcons().add(image);
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.show();


    }
}
