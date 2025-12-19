package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class searchCustomerFormController {
    public TextField txtSearchNumber;
    public TextField txtId;
    public TextField txtName;
    public TextField txtEmail;
    public TextField txtAddress;
    public TextField txtNumber;

    public void btnSearch(ActionEvent actionEvent) {
        int number = Integer.parseInt(txtSearchNumber.getText());
        int index = AllControllers.searchCustomerByNumber(number);
        txtId.setText(AllControllers.customerArrayList.get(index).getId());
        txtName.setText(AllControllers.customerArrayList.get(index).getName());
        txtEmail.setText(AllControllers.customerArrayList.get(index).getEmail());
        txtAddress.setText(AllControllers.customerArrayList.get(index).getAddress());
        txtNumber.setText(String.valueOf(
                AllControllers.customerArrayList.get(index).getNumber()
        ));
    }

    public void btnUpdate(ActionEvent actionEvent) {
        int number = Integer.parseInt(txtSearchNumber.getText());
        int index = AllControllers.searchCustomerByNumber(number);
        String name = txtName.getText();
        String email = txtEmail.getText();
        String address = txtAddress.getText();
        int newNumber = Integer.parseInt(txtNumber.getText());
        AllControllers.customerArrayList.get(index).setName(name);
        AllControllers.customerArrayList.get(index).setEmail(email);
        AllControllers.customerArrayList.get(index).setAddress(address);
        AllControllers.customerArrayList.get(index).setNumber(newNumber);

    }
}
