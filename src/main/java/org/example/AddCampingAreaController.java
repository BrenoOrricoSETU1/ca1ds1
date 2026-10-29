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

public class AddCampingAreaController {
    @FXML
    private TextField campsiteNameField;

    @FXML
    private TextField idField;

    @FXML
    private TextField descriptionField;

    @FXML
    private TextArea campsiteDisplay;
    private Campsite selectedCampsite;

    @FXML
    private Label resultLabel;


    @FXML
    private void searchCampsite(){
        String campsiteName = campsiteNameField.getText();
        selectedCampsite = CampsiteData.campsites.findCampsiteByName(campsiteName);

        if(selectedCampsite != null){
            campsiteDisplay.setText(selectedCampsite.toString());
        } else{
            campsiteDisplay.setText("Campsite not found");
        }
    }

    @FXML
    private void addArea(){
        if(selectedCampsite == null){
            resultLabel.setText("Failed adding campsite");
        } else{
        String areaId = idField.getText();
        String description = descriptionField.getText();

        CampingArea campingArea = new CampingArea(areaId, description);

        selectedCampsite.getCampingAreas().addCampingArea(campingArea);
        resultLabel.setText("Camping area added successfully");
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
