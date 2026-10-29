package org.example;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class DisplayCampsitesController {
    @FXML
    private TextArea campsiteDisplay;

    @FXML
    private void initialize(){
        campsiteDisplay.setText(CampsiteData.campsites.displayCampsites());
    }

    @FXML
    private void backToCampsiteArea() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("campsiteController.fxml"));

        Scene scene = new Scene(root);
        Stage stage = new Stage();

        stage.setScene(scene);
        stage.setTitle("Campsites Area");
        stage.show();
    }

    @FXML
    private void backToHome() throws IOException {

        Parent root = FXMLLoader.load(
                getClass().getResource("HomePageController.fxml")
        );

        Scene scene = new Scene(root);
        Stage stage = new Stage();

        stage.setScene(scene);
        stage.setTitle("Home");
        stage.show();
    }
}

