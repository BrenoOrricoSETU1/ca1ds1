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

public class RemovePlotController {

    @FXML
    private TextField campsiteNameField;

    @FXML
    private TextField campingAreaIdField;

    @FXML
    private TextField plotIdField;

    @FXML
    private TextArea resultDisplay;

    @FXML
    private Label resultLabel;

    @FXML
    private void removePlot(){
        String campsiteName = campsiteNameField.getText();
        String campingAreaId = campingAreaIdField.getText();
        String plotId = plotIdField.getText();

        Campsite campsite = CampsiteData.campsites.findCampsiteByName(campsiteName);
        if(campsite == null){
            resultLabel.setText("Campsite not found");
            return;
        }

        CampingArea campingArea = campsite.getCampingAreas().findCampingAreaById(campingAreaId);
        if(campingArea == null){
            resultLabel.setText("Camping Area not found");
            return;
        }

        Plot plot = campingArea.getPlots().findPlotById(plotId);
        if(plot == null){
            resultLabel.setText("Plot not found");
            return;
        }

        String reassignResult = BookingData.bookings.reassignBooking(plotId, campsite);
        boolean removed = campingArea.getPlots().removePlot(plotId);
        if(removed){
            resultLabel.setText("Plot removed" + reassignResult);
        } else{
            resultLabel.setText("Plot could not be removed");
        }
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
