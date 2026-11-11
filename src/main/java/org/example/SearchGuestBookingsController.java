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


public class SearchGuestBookingsController {
    @FXML
    private TextField guestIdField;

    @FXML
    private TextArea guestDisplay;

    @FXML
    private void searchGuestBookings(){
        String guestId = guestIdField.getText();

        guestDisplay.setText(BookingData.bookings.displayBookingsByGuestId(guestId));
    }

}
