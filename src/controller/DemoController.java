package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class DemoController {

    public TextField txtId;
    public TextField txtEmail;
    public TextField txtName;
    public TextField txtNumber;
    public TextField txtAddress;

    public void addBtn(ActionEvent actionEvent) {
            String id = txtId.getText();
            String name = txtName.getText();
            String address = txtAddress.getText();
            String email = txtEmail.getText();

        System.out.println("id is - "+id);
        System.out.println("name is - "+name);
        System.out.println("email is - "+email);
        System.out.println("address is  - "+address);



    }
}
