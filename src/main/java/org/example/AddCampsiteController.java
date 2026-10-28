package org.example;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class AddCampsiteController {

    @FXML
    private TextField nameField;
    @FXML
    private TextField addressField;
    @FXML
    private TextField starsField;
    @FXML
    private TextField contactField;
    @FXML
    private TextField facilitiesField;

    @FXML
    private void addCampsite() {
        String name = nameField.getText();
        String address = addressField.getText();
        int stars = Integer.parseInt(starsField.getText());
        String contact = contactField.getText();
        String facilities = facilitiesField.getText();

        Campsite campsite = new Campsite(
                name,
                address,
                stars,
                contact,
                facilities
        );

        CampsiteData.campsites.addCampsite(campsite);
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
}
