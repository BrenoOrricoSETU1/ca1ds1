package org.example;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class RemoveGuestController {

    @FXML
    private TextArea displayGuests;

    @FXML
    private void initialize(){
        displayGuests.setText(GuestData.guests.displayGuest());
    }

    @FXML
    private TextField guestIdField;

    @FXML
    private Label resultLabel;

    @FXML
    private void removeGuest(){
        String id  = guestIdField.getText();
        boolean removed = GuestData.guests.removeGuestById(id);

        if(removed){
            resultLabel.setText("Guest removed");
        } else{
            resultLabel.setText("Guest not found. Please, insert a valid ID");
        }
    }

    @FXML
    private void backToHome() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("HomePageController.fxml")
        );

        Scene scene = new Scene(root);
        Stage stage = new Stage();

        stage.setScene(scene);
        stage.setTitle("Home");
        stage.show();
    }

    @FXML
    private void backToGuestArea() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("guestController.fxml"));

        Scene scene = new Scene(root);
        Stage stage = new Stage();

        stage.setScene(scene);
        stage.setTitle("Guest Area");
        stage.show();
    }
}
