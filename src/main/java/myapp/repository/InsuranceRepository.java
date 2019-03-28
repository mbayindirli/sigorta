package myapp.repository;

import myapp.domain.Customer;
import myapp.domain.Insurance;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface InsuranceRepository extends CrudRepository<Insurance,Long> , QueryByExampleExecutor<Insurance> {
}
