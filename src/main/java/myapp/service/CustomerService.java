package myapp.service;

import myapp.domain.Customer;

import java.util.Optional;


public interface CustomerService {
    Customer addCustomer(Customer customer);
    void destroyCustomerById(Long customerId);
    Optional<Customer>findById(Long customerId);
    Iterable<Customer>findAllCustomer(Customer customer);

}
