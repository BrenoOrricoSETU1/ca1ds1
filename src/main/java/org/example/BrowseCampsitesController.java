package org.example;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class BrowseCampsitesController {
    @FXML
    private ChoiceBox<String> campsiteChoice;

    @FXML
    private ChoiceBox<String> campingAreaChoice;

    @FXML
    private ChoiceBox<String> plotChoice;

    @FXML
    private TextArea bookingDisplay;

    @FXML
    public void initialize() {
        CampsiteNode current = CampsiteData.campsites.getHead();

        while(current != null) {
            campsiteChoice.getItems().add(current.getData().getCampsiteName());
            current = current.getNext();
        }
    }

    @FXML
    private void selectCampsite() {

        campingAreaChoice.getItems().clear();
        plotChoice.getItems().clear();
        bookingDisplay.clear();

        String campsiteName = campsiteChoice.getValue();

        Campsite campsite =
                CampsiteData.campsites.findCampsiteByName(campsiteName);

        if(campsite != null){
            CampingAreaNode current = campsite.getCampingAreas().getHead();

            while(current != null){
                campingAreaChoice.getItems().add(current.getData().getAreaID());
                current = current.getNext();
            }
        }
    }

    @FXML
    private void selectArea() {

        plotChoice.getItems().clear();
        bookingDisplay.clear();

        String campsiteName = campsiteChoice.getValue();
        String areaId = campingAreaChoice.getValue();

        Campsite campsite = CampsiteData.campsites.findCampsiteByName(campsiteName);

        if(campsite != null){
            CampingArea area = campsite.getCampingAreas().findCampingAreaById(areaId);

            if(area != null){
                PlotNode current = area.getPlots().getHead();

                while(current != null){
                    plotChoice.getItems().add(current.getData().getPlotId() );
                    current = current.getNext();
                }
            }
        }
    }

    @FXML
    private void selectPlot() {

        String plotId = plotChoice.getValue();

        if(plotId != null){

            String result = BookingData.bookings.findBookingByPlotId(plotId);

            if(result.equals("")){
                bookingDisplay.setText("No bookings for this plot");
            } else {
                bookingDisplay.setText(result);
            }
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
