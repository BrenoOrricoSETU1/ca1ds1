package org.example;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import java.io.IOException;

public class AddGuestController {

    @FXML
    private TextField nameField;

    @FXML
    private TextField dobField;

    @FXML
    private TextField contactField;

    @FXML
    private TextField additionalInfoField;

    public void addGuest(ActionEvent actionEvent) {
        String id = GuestData.getNextGuestId();
        String name = nameField.getText();
        String dob = dobField.getText();
        String contact = contactField.getText();
        String additionalInfo = additionalInfoField.getText();

        Guest guest = new Guest(id,
                name,
                dob,
                contact,
                additionalInfo);
        GuestData.guests.addGuest(guest);
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
        stage.setTitle("Campsites Area");
        stage.show();
    }
}
