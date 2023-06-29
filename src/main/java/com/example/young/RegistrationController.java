package com.example.young;

import com.almasb.fxgl.net.Connection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RegistrationController {
    @FXML
    Button regButton;
    @FXML
    TextField passField, pass2Field, logField;

    public void registration(ActionEvent actionEvent) throws Exception{
        String login = logField.getText();
        String pass = passField.getText();
        String pass2 = pass2Field.getText();

        Connection connection = Database.ConnectDb();
        connection.addToDatabase(login, pass, pass2);

        Stage closeStage = (Stage) regButton.getScene().getWindow();
        closeStage.close();

        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("main.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Main");
        stage.setScene(scene);
        stage.show();
    }
}
