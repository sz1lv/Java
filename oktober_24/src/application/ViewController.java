package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ViewController implements Initializable{ //az initet importálni, majd a viewcontrollert add ... method

    @FXML
    private TableView<?> tabla;

    @FXML
    private TextField idMezo;

    @FXML
    private TextField szuletesidatumMezo;

    @FXML
    private TextField keresztnevMezo;

    @FXML
    private TextField vezeteknevMezo;

    @FXML
    void hozzaadGomb(ActionEvent event) {
    	//System.out.println("MŰKÖDIK!");
    	System.out.println(idMezo.getText()); //Konzolon lecsekkoljuk, működnek-e a filedek
    	System.out.println(vezeteknevMezo.getText());
    	System.out.println(keresztnevMezo.getText());
    	System.out.println(szuletesidatumMezo.getText());
    }

    @FXML
    void menuItemKilepes(ActionEvent event) {
    	Platform.exit(); //fájl --> kilépés
    }

    @FXML
    void menuItemNevjegy(ActionEvent event) {

    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
