package myapp.controller;

import myapp.domain.Customer;
import myapp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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


}
