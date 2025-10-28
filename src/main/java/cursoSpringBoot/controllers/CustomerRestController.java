package cursoSpringBoot.controllers;

import cursoSpringBoot.domain.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class CustomerRestController {
    private List<Customer> customers=new ArrayList<>(Arrays.asList(
            new Customer(123,"Gerar López", "gerardol","contrasena123"),
            new Customer(456, "Ale García", "alegar","clave456"),
            new Customer(789, "Carlos Martín", "carlosm", "pass234")
    ));

    @GetMapping("clientes")
    public List<Customer> getCustomers(){
        return customers;
    }
}
