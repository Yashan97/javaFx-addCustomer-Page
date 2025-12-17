package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Customer;

import java.util.ArrayList;

public class DemoController {

    public TextField txtId;
    public TextField txtEmail;
    public TextField txtName;
    public TextField txtNumber;
    public TextField txtAddress;
    public TableView tblAddCustomer;
    public TableColumn colId;
    public TableColumn ColName;
    public TableColumn ColAddress;
    public TableColumn ColEmail;
    public TableColumn ColNumber;

    ArrayList<Customer>customersList = new ArrayList<>();

    public void addBtn(ActionEvent actionEvent) {
            String id = txtId.getText();
            String name = txtName.getText();
            String address = txtAddress.getText();
            String email = txtEmail.getText();
            int number = Integer.parseInt(txtNumber.getText());

            Customer customer = new Customer(id,name,email,address,number);
            customersList.add(customer);
            loadTable();


    }

    public void btnClear(ActionEvent actionEvent) {
        txtId.setText("");
        txtName.setText("");
        txtEmail.setText("");
        txtAddress.setText("");
        txtNumber.setText("");
    }

    public void btnReload(ActionEvent actionEvent) {

        loadTable();
    }
    private void loadTable(){
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        ColName.setCellValueFactory(new PropertyValueFactory<>("name"));
        ColAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        ColEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        ColNumber.setCellValueFactory(new PropertyValueFactory<>("number"));

        ObservableList<Customer> customerObservableList = FXCollections.observableArrayList();
        customersList.forEach(customer -> {
            customerObservableList.add(customer);
        });
        tblAddCustomer.setItems(customerObservableList);
    }
}
