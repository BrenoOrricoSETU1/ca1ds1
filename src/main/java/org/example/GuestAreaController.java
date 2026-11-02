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
    }

    public void searchBooking() throws IOException{
    }

    public void removeGuest() throws IOException {
    }

    public void cancelBooking() throws IOException{
    }

    public void addBooking() throws IOException{
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
}
