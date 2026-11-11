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

public class CancelBookingController {

    @FXML
    private TextField bookingIdField;

    @FXML
    private Label resultLabel;

    @FXML
    private TextArea displayBookings;

    @FXML
    private void initialize() {
        displayBookings.setText(BookingData.bookings.displayBookings());
    }

    @FXML
    private void cancelBooking(){
        String bookingId = bookingIdField.getText();

        boolean cancelled = BookingData.bookings.cancelBooking(bookingId);

        if(cancelled){
            resultLabel.setText("Booking canceled.");
        } else{
            resultLabel.setText("Booking not found. Please try again.");
        }
    }

    @FXML
    private void backToGuestArea() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("guestController.fxml"));

        Scene scene = new Scene(root);
        Stage stage = new Stage();

        stage.setScene(scene);
        stage.setTitle("Guests Area");
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
