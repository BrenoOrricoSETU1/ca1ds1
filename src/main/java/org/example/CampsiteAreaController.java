package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CampsiteAreaController {

    @FXML
    private void addCampsite() throws IOException {

        Parent root = FXMLLoader.load(
                getClass().getResource("addCampsite.fxml")
        );

        Stage stage = new Stage();
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("Add Campsite");
        stage.show();
    }

    @FXML
    private void displayCampsites() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("displayCampsites.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("Display Campsites");
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

    public void addCampingArea(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("addCampingArea.fxml"));

        Stage stage = new Stage();
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("Add Camping Area");
        stage.show();
    }

    @FXML
    private void exit(){
        System.exit(0);
    }
}