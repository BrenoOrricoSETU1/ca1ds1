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

    public void addPlot(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("addPlot.fxml"));

        Stage stage = new Stage();
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("Add Plot");
        stage.show();
    }

    public void removePlot(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("removePlot.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Remove Plot");
        stage.show();
    }

    public void browseCampsites(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("browseCampsites.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Browse Campsites");
        stage.show();
    }

    @FXML
    private void exit(){
        System.exit(0);
    }

    @FXML
    private void saveData(){

        DataStore dataStore = new DataStore();

        try {
            dataStore.save();
            System.out.println("Data saved successfully");
        } catch (Exception e) {
            System.err.println("Error saving data: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @FXML
    private void loadData(){
        DataStore dataStore = new DataStore();
        try{
            dataStore.load();
            System.out.println("Data loaded successfully");
        } catch (Exception e) {
            System.err.println("Error loading data");
        }
    }

    @FXML
    private void openCampsiteArea() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("campsiteController.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Campsite Area");
        stage.show();
    }

    @FXML
    private void openGuestArea() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("guestController.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Guest Area");
        stage.show();
    }

    @FXML
    private void reset() {
        CampsiteData.campsites.reset();
        GuestData.guests.reset();
        BookingData.bookings.reset();
    }
}