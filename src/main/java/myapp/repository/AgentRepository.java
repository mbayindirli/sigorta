package myapp.repository;

import myapp.domain.Agent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface AgentRepository extends CrudRepository<Agent,Long> , QueryByExampleExecutor<Agent> {
}
