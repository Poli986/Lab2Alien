package alien;

import javafx.application.Application;
import javafx.css.SimpleStyleableObjectProperty;
import javafx.stage.Stage;
import parole.AlienDictionary;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader=new FXMLLoader(getClass().getResource("Alien.fxml"));
			BorderPane root = (BorderPane)loader.load();
			AlienController controller=loader.getController();
			AlienDictionary ad=new AlienDictionary();
			controller.setModel(ad);
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}