package alien;

/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */


import parole.AlienDictionary;
import parole.Word;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class AlienController {
	
	private AlienDictionary model;

    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private TextField txtWord;
    @FXML
    private TextArea txtResult;
    @FXML
    private Button btnTranslate;
    @FXML
    private Button btnReset;
        
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnTranslate != null : "fx:id=\"bntTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";
    	
    }
  
    void setModel(AlienDictionary ad) {
    	this.model=ad;
    }
    
    @FXML
    void doTranslate(ActionEvent event) { 
    	txtResult.setText(model.scelta(txtWord.getText()));
    }
    
    
    @FXML
    void doReset(ActionEvent event) {

    }
    
}
