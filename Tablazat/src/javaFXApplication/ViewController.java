package javaFXApplication;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ViewController implements Initializable {

    @FXML
    private TableView<Szemely> tabla;

    @FXML
    private TableColumn<Szemely, Number> tablaid;

    @FXML
    private TableColumn<Szemely, String> tablavnev;

    @FXML
    private TableColumn<Szemely, String> tablaknev;

    @FXML
    private TextField textid;

    @FXML
    private TextField textvnev;

    @FXML
    private TextField textknev;

    @FXML
    void hozzaadGomb(ActionEvent event) { //nem az awt-t válasszuk

    }
    
    private ObservableList<Szemely> adat = FXCollections.observableArrayList();
    
    private void adatHozaad() {
    	Szemely szemely1 = new Szemely(1, "Nagy", "Ádám");
    	Szemely szemely2 = new Szemely(2, "Kovács", "Edina");
    	Szemely szemely3 = new Szemely(3, "Lantos", "István");
    	adat.add(szemely1);
    	adat.add(szemely2);
    	adat.add(szemely3);
    }
    
    private void tablazatletrehoz() {
    	tablaid.setCellValueFactory(cellaAdat -> cellaAdat.getValue().idProperty());
    	tablavnev.setCellValueFactory(cellaAdat -> cellaAdat.getValue().vnevProperty());
    	tablaknev.setCellValueFactory(cellaAdat -> cellaAdat.getValue().knevProperty());
    	tabla.setItems(adat);
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		adatHozaad(); //Elsőbb adatok viszünk fel a táblára
		tablazatletrehoz(); //Aztán létrehozzuk a táblázatot és a set items beállítja az adatokat.
	}    
    
}
