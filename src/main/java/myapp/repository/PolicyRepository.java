package myapp.repository;

import myapp.domain.Policy;
import org.springframework.data.repository.CrudRepository;

public interface PolicyRepository extends CrudRepository<Policy,Long> {
}
