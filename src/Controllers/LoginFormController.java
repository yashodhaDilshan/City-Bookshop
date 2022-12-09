package Controllers;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javax.swing.*;
import java.io.IOException;
import java.util.Optional;


public class LoginFormController {

   public TextField txtUserName, txtPassword;
    public Button btnLogin;

    public void btnLoginOnAction(ActionEvent actionEvent) throws IOException {
        if (txtUserName.getText().equals("yash") && txtPassword.getText().equals("1234")){
            Parent parent = FXMLLoader.load(getClass().getResource("../View/ManagerMenu.fxml"));
            Scene scene = new Scene(parent);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.centerOnScreen();
            Image image = new Image("Images/icons8-books-48 (1).png");
            stage.getIcons().add(image);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.show();

            Stage thisStage = (Stage) btnLogin.getScene().getWindow();
            thisStage.close();
        }
        else {
            JOptionPane.showMessageDialog(null, "Wrong Username or Password");
        }
    }

    public void btnResetOnAction(ActionEvent actionEvent) {
        txtUserName.setText("");
        txtPassword.setText("");
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
