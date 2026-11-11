package org.example;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class AddBookingController {

    @FXML
    private TextField budgetField;

    @FXML
    private TextField campsiteNameField;

    @FXML
    private TextField guestIdField;

    @FXML
    private TextField campingIdField;

    @FXML
    private TextField plotIdField;

    @FXML
    private TextField startDateField;

    @FXML
    private TextField endDateField;

    @FXML
    private Label resultLabel;

    @FXML
    private TextField typeField;

    @FXML
    private TextField numberOfGuestsField;

    @FXML
    private TextField minSizeField;

    @FXML
    private TextField minBedroomsField;

    @FXML
    private ChoiceBox<String> poweredField;

    @FXML
    private void initialize() {
        poweredField.getItems().addAll("Yes", "No");
    }

    @FXML
    private void addBooking(){
        String campsiteName = campsiteNameField.getText();
        String guestId = guestIdField.getText();
        String campingAreaId = campingIdField.getText();
        String plotId = plotIdField.getText();
        String startDate = startDateField.getText();
        String endDate = endDateField.getText();
        String type = typeField.getText();
        int numberOfGuests = Integer.parseInt(numberOfGuestsField.getText());
        double minimumSize = Double.parseDouble(minSizeField.getText());
        int minBedrooms = Integer.parseInt(minBedroomsField.getText());
        boolean powered = "Yes".equals(poweredField.getValue());
        double budget = Double.parseDouble(budgetField.getText());

        Campsite campsite = CampsiteData.campsites.findCampsiteByName(campsiteName);

        if(campsite == null){
            resultLabel.setText("Campsite not found");
            return;
        }

        CampingArea campingArea = campsite.getCampingAreas().findCampingAreaById(campingAreaId);

        if(campingArea == null){
            resultLabel.setText("CampingArea not found");
            return;
        }

        Plot plot = campingArea.getPlots().findPlotById(plotId);
        if(plot == null){
            resultLabel.setText("Plot not found");
            return;
        }

        Guest guest = GuestData.guests.findGuestById(guestId);
        if(guest == null){
            resultLabel.setText("Guest not found");
            return;
        }

        String bookingId = BookingData.getNextBookingId();

        Booking booking = new Booking(bookingId, startDate, endDate, campingAreaId, guestId, plotId, type, numberOfGuests, powered, minimumSize, minBedrooms, budget);
        BookingData.bookings.addBooking(booking);

        if(BookingData.bookings.isPlotBooked(plotId, startDate, endDate)){
            resultLabel.setText("Plot is already booked. Please try another date");
            return;
        }

        resultLabel.setText("Booking added successfully. ID: " + bookingId);
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
