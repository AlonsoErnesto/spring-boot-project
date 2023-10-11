package com.amigoscode.customer;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class CustomerDataAccessService implements CustomerDAO {
    private static List<Customer> customers;
    static {
        customers = new ArrayList<>();
        Customer ernesto = new Customer(
                1,
                "ernesto",
                "ernesto@gmail.com",
                23

        );
        customers.add(ernesto);
        Customer claudia =  new Customer(
                2,
                "Claudia",
                "claudia@gmai.com",
                26
        );
        customers.add(claudia);
    }
    @Override
    public List<Customer> selectAllCustomer(){
        return customers;
    }

    @Override
    public Optional<Customer> selectCustomerById(Integer id) {
        return customers.stream()
                .filter(customer -> customer.getId().equals(id))
                .findFirst();
    }
}
