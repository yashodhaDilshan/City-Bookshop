package Controllers;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class BooksController implements Initializable {

    public Label lblBookId;
    public TextField txtName, txtAuthor, txtQty, txtPrice, txtSearch;
    public ComboBox cmbCategory;
    public Button btnBack;



    @Override
    public void initialize(URL location, ResourceBundle resources) {

        cmbCategory.getItems().add("History");
        cmbCategory.getItems().add("Novels");

    }
    public void btnAddOnAction(ActionEvent actionEvent) {

        if (txtName.getText().equals("") || txtAuthor.getText().equals("") || txtQty.getText().equals("") || txtPrice.getText().equals("") || cmbCategory.getItems().add("")){
            new Alert(Alert.AlertType.WARNING, "Please Fill All Text Fields").show();
        }
        else {
            int id = Integer.parseInt(lblBookId.getText());
            String Name = txtName.getText();
            String Author = txtAuthor.getText();
            int Qty = Integer.parseInt(txtQty.getText());
            double Price = Integer.parseInt(txtPrice.getText());
            String Category = cmbCategory.getSelectionModel().getSelectedItem().toString();
            String Stock = "in Stock";

        }


    }

    public void btnUpdateOnAction(ActionEvent actionEvent) {
        if (txtName.getText().equals("") || txtAuthor.getText().equals("") || txtQty.getText().equals("") || txtPrice.getText().equals("") || cmbCategory.getItems().add("")){
            new Alert(Alert.AlertType.WARNING, "Please Fill All Text Fields").show();
        }
        else {
            int id = Integer.parseInt(lblBookId.getText());
            String Name = txtName.getText();
            String Author = txtAuthor.getText();
            int Qty = Integer.parseInt(txtQty.getText());
            double Price = Integer.parseInt(txtPrice.getText());
            String Category = cmbCategory.getSelectionModel().getSelectedItem().toString();

        }
    }

    public void btnDeleteOnAction(ActionEvent actionEvent) {
        if (lblBookId.getText().equals("")){
            new Alert(Alert.AlertType.WARNING, "Please Select Book From the Table").show();
        }
        else {
            int id = Integer.parseInt(lblBookId.getText());
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Please Confirm");
            alert.setHeaderText("Are you sure to Exit from this");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK){
                //delete

            }
        }
    }
    public void btnSearchOnAction(ActionEvent actionEvent) {
        if (txtSearch.getText().equals("")){
            new Alert(Alert.AlertType.WARNING, "Please Insert Name or Id").show();
        }
        else {
            int Search = Integer.parseInt(txtSearch.getText());


        }
    }

    public void btnReloadOnAction(ActionEvent actionEvent) {
        txtSearch.setText("");
        txtName.setText("");
        txtAuthor.setText("");
        txtQty.setText("");
        txtPrice.setText("");
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

    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../View/ManagerMenu.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.centerOnScreen();
        Image image = new Image("Images/icons8-books-48 (1).png");
        stage.getIcons().add(image);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();

        Stage lastStage = (Stage) btnBack.getScene().getWindow();
        lastStage.close();
    }


}
