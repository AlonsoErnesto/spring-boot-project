package com.amigoscode.customer;

import java.util.List;

public class CustomerService {

    private final CustomerDAO customerDAO;

    public CustomerService(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    public List<Customer> getAllCustomers(){
        return customerDAO.selectAllCustomer();
    }

    public Customer getCustomer(Integer id){
        return customerDAO.selectCustomerById(id)
                .orElseThrow(()->new IllegalArgumentException(
                        "No exist Customer with ID  [%s] not found".formatted(id)
                ));
    }

}
