package org.example;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HomePageController {
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
    private void exit(){
        System.exit(0);
    }

    @FXML
    private void saveData(){
        DataStore dataStore = new DataStore();

        try{
            dataStore.save();
            System.out.println("Data saved successfully");
        } catch (Exception e) {
            System.err.println("Error saving data");
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
    private void reset() {
        CampsiteData.campsites.reset();
        GuestData.guests.reset();
        BookingData.bookings.reset();
    }
}
