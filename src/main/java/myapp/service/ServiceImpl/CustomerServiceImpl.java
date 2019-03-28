package myapp.service.ServiceImpl;

import myapp.domain.Customer;
import myapp.repository.CustomerRepository;
import myapp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    @Override
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Optional<Customer> findById(Long customerId) {
        return customerRepository.findById(customerId);
    }

    @Override
    public Iterable<Customer> findAllCustomer(Customer customer) {
        return customerRepository.findAll(Example.of(customer));
    }

    @Override
    public void destroyCustomerById(Long customerId) {
        customerRepository.deleteById(customerId); }
}
