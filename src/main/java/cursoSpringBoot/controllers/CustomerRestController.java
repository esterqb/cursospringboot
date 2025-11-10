package cursoSpringBoot.controllers;

import cursoSpringBoot.domain.Customer;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/clientes")
    public List<Customer> getCustomers(){
        return customers;
    }

    @GetMapping("clientes/{username}")
    public Customer getCliente(@PathVariable String username){
        for(Customer c:customers){
            if(c.getUsername().equalsIgnoreCase(username)){
                return c;
            }
        }
        return null;
    }

    @PostMapping("/clientes")
    public Customer postCliente(@RequestBody Customer customer){
        customers.add(customer);
        return customer;
    }

    @PutMapping("/clientes")
    public Customer putCliente(@RequestBody Customer customer){
        for(Customer c: customers){
            if(c.getID()==customer.getID()){
                c.setName(customer.getName());
                c.setUsername(customer.getUsername());
                c.setPassword(customer.getPassword());

                return c;
            }
        }
        return null;
    }

    @DeleteMapping("/clientes")
    public Customer deleteCliente(@PathVariable int id){
        for(Customer c:customers){
            if(c.getID()==id){
                customers.remove(c);
            }
            return c;
        }
        return null; //validar nulls luego
    }

    @PatchMapping("/clientes")
    public Customer patchCliente(@RequestBody Customer customer){ //recibir JSON por param
        for(Customer c:customers){
            if(c.getID()==customer.getID()){
                if(customer.getName()!=null){
                    c.setName(customer.getName());
                }
                if(customer.getUsername()!=null){
                    c.setUsername(customer.getUsername());
                }
                if(customer.getPassword()!=null){
                    c.setPassword(customer.getPassword());
                }

                return c;
            }
        }
        return null;//verificar nulls luego
    }
}
