package myapp.repository;

import myapp.domain.Insurance;
import org.springframework.data.repository.CrudRepository;

public interface InsuranceRepository extends CrudRepository<Insurance,Long> {
}
