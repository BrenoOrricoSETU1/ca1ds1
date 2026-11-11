package org.example;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class FindBestPlotController {
    @FXML
    private TextField typeField;

    @FXML
    private TextField minSizeField;

    @FXML
    private TextField minBedroomsField;

    @FXML
    private TextField budgetField;

    @FXML
    private TextField facilitiesField;

    @FXML
    private TextArea displayResult;

    @FXML
    private void findPlot(){
        String type = typeField.getText();
        double minSize = Double.parseDouble(minSizeField.getText());
        int minBedrooms = Integer.parseInt(minBedroomsField.getText());
        double budget = Double.parseDouble(budgetField.getText());
        String facilities = facilitiesField.getText();
        String result = CampsiteData.campsites.findBestPlot(type, minSize, minBedrooms, budget, facilities);
        displayResult.setText(result);
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
