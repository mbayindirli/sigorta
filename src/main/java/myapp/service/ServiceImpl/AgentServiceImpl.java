package myapp.service.ServiceImpl;

import myapp.domain.Agent;
import myapp.repository.AgentRepository;
import myapp.service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AgentServiceImpl implements AgentService {
    @Autowired
    AgentRepository agentRepository;
    @Override
    public Agent addAgent(Agent agent) {
        return agentRepository.save(agent);
    }

    @Override
    public Optional<Agent> findById(Long agentId) {
        return agentRepository.findById(agentId);
    }

    @Override
    public Iterable<Agent> findAllAgent(Agent agent) {
        return agentRepository.findAll(Example.of(agent));
    }

    @Override
    public Iterable<Agent> findAllAgent() {
        return agentRepository.findAll();
    }

    @Override
    public void destroyAgent(Long agentId) {
        agentRepository.deleteById(agentId);
    }
}
