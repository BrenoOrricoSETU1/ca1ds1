package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


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
}

