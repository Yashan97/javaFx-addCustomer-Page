import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Customer Registration Main Forme ");
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("view/mainViewform.fxml"))));
        stage.show();
    }
}