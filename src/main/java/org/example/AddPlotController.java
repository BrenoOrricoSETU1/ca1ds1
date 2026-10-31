package org.example;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class AddPlotController {
    //Search for Campsite part of GUI
    @FXML
    private TextField campsiteNameField;

    @FXML
    private TextArea campsiteDisplay;
    private Campsite selectedCampsite;

    //Search for Camping Area part of GUI
    @FXML
    private TextField campingAreaIdField;

    @FXML
    private TextArea campingAreaDisplay;
    private CampingArea selectedCampingArea;

    //Adding Plot part of GUI
    @FXML
    private TextField plotIdField;

    @FXML
    private TextField typeField;

    @FXML
    private ChoiceBox<String> poweredChoiceBox;

    @FXML
    private TextField bedroomsField;

    @FXML
    private TextField bedsField;

    @FXML
    private TextField sizeField;

    @FXML
    private TextField facilitiesField;

    @FXML
    private TextField costPerNightField;

    @FXML
    private TextField urlField;

    @FXML
    private Label resultLabel;

    @FXML
    private void initialize() {
        poweredChoiceBox.getItems().add("Yes");
        poweredChoiceBox.getItems().add("No");
    }

    @FXML
    private void searchCampsite() {
        String campsiteName = campsiteNameField.getText();
        selectedCampsite = CampsiteData.campsites.findCampsiteByName(campsiteName);

        if (selectedCampsite != null) {
            campsiteDisplay.setText(selectedCampsite.toString());
        } else {
            campsiteDisplay.setText("Campsite not found");
        }
    }

    @FXML
    private void searchCampingArea() {
        String campingAreaId = campingAreaIdField.getText();

        selectedCampingArea = selectedCampsite.getCampingAreas().findCampingAreaById(campingAreaId);
        if (selectedCampingArea != null) {
            campingAreaDisplay.setText(selectedCampingArea.toString());
        } else {
            campingAreaDisplay.setText("Camping Area not found");
        }
    }

    @FXML
    private void addPlotArea() {
        if (selectedCampsite == null || selectedCampingArea == null) {
            resultLabel.setText("Failing adding plot");
        } else {
            String plotId = plotIdField.getText();
            String type = typeField.getText();
            boolean isPowered = poweredChoiceBox.getValue().equals("Yes");
            int bedrooms = Integer.parseInt(bedroomsField.getText());
            int beds = Integer.parseInt(bedsField.getText());
            double size = Double.parseDouble(sizeField.getText());
            String facilities = facilitiesField.getText();
            double costPerNight = Double.parseDouble(costPerNightField.getText());
            String url = urlField.getText();

            Plot plot = new Plot(plotId, type, isPowered, bedrooms, beds, size, facilities, costPerNight, url);

            selectedCampingArea.getPlots().addPlot(plot);
            resultLabel.setText("Plot added successfully");
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
