package com.example.young;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AuthorizationController {
    @FXML
    Button authButton;
    @FXML
    TextField passField, logField;


    public void goAuth(ActionEvent actionEvent) {
        String login = logField.getText();
        String pass = passField.getText();

        if(Database.ConnectDb().isExist){

            Stage closeStage = (Stage) authButton.getScene().getWindow();
            closeStage.close();

            Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("registration.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            stage.setTitle("Hello!");
            stage.setScene(scene);
            stage.show();
        }
    }
}
