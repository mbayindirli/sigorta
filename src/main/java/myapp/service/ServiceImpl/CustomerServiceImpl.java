package myapp.service.ServiceImpl;

import myapp.domain.Customer;
import myapp.repository.CustomerRepository;
import myapp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    @Override
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public void destroyCustomerById(Long customerId) {
        customerRepository.deleteById(customerId); }
}
