package javaFXApplication;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;


public class Szemely {
		
		private SimpleIntegerProperty id;
		private SimpleStringProperty vnev;
		private SimpleStringProperty knev;
		
		public Szemely(int id, String vnev, String knev) {
			this.id = new SimpleIntegerProperty(id);
			this.vnev = new SimpleStringProperty(vnev);
			this.knev = new SimpleStringProperty(knev);
		}
		
		//Jobb klikk --> Source --> Generate JavaFx Getters and Setters
		//A projekt futtatásához a JavaFXApplication.java-t kell futtatni
		//ID
		public final int getId() {
			return this.id.get();
		}
		public final void setId(int id) {
			this.idProperty().set(id);
		}
		public final SimpleIntegerProperty idProperty() {
			return this.id;
		}
		
		//Vezeteknev
		public final String getVnev() {
			return this.vnev.get();
		}
		public final void setVnev(String vnev) {
			this.vnevProperty().set(vnev);
		}
		public final SimpleStringProperty vnevProperty() {
			return this.vnev;
		}
		
		//Keresztnev
		public final String getKnev() {
			return this.knev.get();
		}
		public final void setKnev(String knev) {
			this.knevProperty().set(knev);
		}
		public final SimpleStringProperty knevProperty() {
			return this.knev;
		}
}
