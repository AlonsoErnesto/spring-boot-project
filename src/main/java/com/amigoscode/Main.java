package com.amigoscode;

import com.amigoscode.customer.CustomerController;
import com.amigoscode.customer.CustomerDataAccessService;
import com.amigoscode.customer.CustomerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        /*
        Never do this.
        CustomerService customerService = new CustomerService(new CustomerDataAccessService());
        CustomerController customerController = new CustomerController(customerService);
         */
        ConfigurableApplicationContext applicationContext =
        SpringApplication.run(Main.class,args);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }

}
