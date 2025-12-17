package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class mainviewformeController {

    public void btnAddCustomer(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Add Customer Forme");
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/DemoFxml.fxml"))));
        stage.show();
    }

    public void btnSearchCustomer(ActionEvent actionEvent) {
    }
}
