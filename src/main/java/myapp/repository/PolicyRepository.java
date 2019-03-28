package myapp.repository;

import myapp.domain.Insurance;
import myapp.domain.Policy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface PolicyRepository extends CrudRepository<Policy,Long>, QueryByExampleExecutor<Policy> {
}
