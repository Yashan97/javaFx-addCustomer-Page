package controller;

import model.Customer;

import java.util.ArrayList;

public class AllControllers {

    static ArrayList<Customer>customerArrayList = new ArrayList<>();
    public static void addCustomer(Customer customer){
        customerArrayList.add(customer);
    }


    public static int searchCustomerByNumber(int number){
        for (int i=0; i<=customerArrayList.size() ; i++){
            if (customerArrayList.get(i).getNumber() == number){
                return i;
            }
        }
        return -1;
    }
}
