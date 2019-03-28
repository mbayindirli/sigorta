package myapp.controller;

import myapp.domain.Customer;
import myapp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value="customers")
public class CustomerController {

  @Autowired
     CustomerService customerService;

    @RequestMapping(value = "/" ,method = RequestMethod.POST)
    public Customer addCustomer(@RequestBody Customer customer){
        return customerService.addCustomer(customer);
    }

    @RequestMapping(value = "/" ,method = RequestMethod.DELETE)
    public void  destroyCustomer(@RequestBody Long customerId){
       customerService.destroyCustomerById(customerId);
    }

    @RequestMapping(value = "/{customerId}", method = RequestMethod.GET)
    public Optional<Customer> findOne(@PathVariable Long customerId){
        return customerService.findById(customerId);
    }

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public Iterable<Customer>findAllCustomer(@RequestParam Customer customer){
        return customerService.findAllCustomer(customer);
    }



}
