package org.example;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class SearchCampsiteController {

    @FXML
    private TextField searchField;

    @FXML
    private TextArea resultDisplay;

    @FXML
    private void searchCampsite(){
        String name = searchField.getText();

        Campsite campsite = CampsiteData.campsites.findCampsiteByName(name);
        if(campsite != null){
            resultDisplay.setText(campsite.toString());
        } else{
            resultDisplay.setText("Campsite not found");
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

