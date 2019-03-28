package myapp.repository;

import myapp.domain.Agent;
import myapp.domain.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface CustomerRepository extends CrudRepository<Customer,Long>, QueryByExampleExecutor<Customer> {
}
