package org.example;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class SearchGuestController {
    @FXML
    private TextField searchField;

    @FXML
    private TextArea guestDisplay;

    @FXML
    private void searchGuest(){
        String name = searchField.getText();

        Guest guest = GuestData.guests.findGuestByName(name);

        if(guest != null){
            String result = guest.toString();
            result += "\nBookings: \n";
            result+= BookingData.bookings.displayBookingsByGuestId(guest.getGuestId());
            guestDisplay.setText(result);
        } else{
            guestDisplay.setText("No guest found");
        }
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
        stage.setTitle("Guest Area");
        stage.show();
    }

}
