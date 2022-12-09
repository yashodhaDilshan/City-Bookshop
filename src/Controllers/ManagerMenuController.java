package Controllers;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.awt.*;
import java.io.IOException;
import java.util.Optional;

public class ManagerMenuController {

    public Button btnLogOut, btnBook, btnCashiers, btnBill;

    public void btnBookOnAction(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../View/Books.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.centerOnScreen();
        javafx.scene.image.Image image = new Image("Images/icons8-books-48 (1).png");
        stage.getIcons().add(image);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();

        Stage lastStage = (Stage) btnBook.getScene().getWindow();
        lastStage.close();
    }

    public void btnCashiersOnAction(ActionEvent actionEvent) {
    }

    public void btnBillOnAction(ActionEvent actionEvent) {
    }

    public void btnLogOutOnAction(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../View/LoginForm.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.centerOnScreen();
        javafx.scene.image.Image image = new Image("Images/icons8-books-48 (1).png");
        stage.getIcons().add(image);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();

        Stage lastStage = (Stage) btnLogOut.getScene().getWindow();
        lastStage.close();
    }

    public void btnExitOnAction(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Please Confirm");
        alert.setHeaderText("Are you sure to Exit from this");
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK){
            Platform.exit();
        }
    }
    public void btnMinimizeOnAction(ActionEvent actionEvent) {
        Stage stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setIconified(true);
    }
}
