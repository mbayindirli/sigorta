package myapp.service;

import myapp.domain.Customer;



public interface CustomerService {
    Customer addCustomer(Customer customer);
    void destroyCustomerById(Long customerId);
}
