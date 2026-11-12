package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GuestAreaController {
    public void addGuest() throws IOException {

        Parent root = FXMLLoader.load(
                getClass().getResource("addGuest.fxml")
        );

        Stage stage = new Stage();
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("Add Guest");
        stage.show();
    }

    public void viewGuests() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("displayGuests.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("View Guests");
        stage.show();
    }

    public void searchGuest() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("searchGuest.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Search Guests");
        stage.show();
    }

    public void searchBooking() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("searchBookings.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Search Bookings");
        stage.show();
    }

    public void viewBookings() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("displayBookings.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("View Bookings");
        stage.show();
    }

    public void findPlot() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("findBestPlot.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Find Plot");
        stage.show();
    }

    public void removeGuest() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("removeGuest.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Remove Guest");
        stage.show();
    }

    public void cancelBooking() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("cancelBooking.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Cancel Booking");
        stage.show();
    }

    public void addBooking() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("addBooking.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Add Booking");
        stage.show();
    }

    @FXML
    public void exit(){
        System.exit(0);
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
