package myapp.service;

import myapp.domain.Agent;

import java.util.Optional;

public interface AgentService {
    Agent addAgent(Agent agent);
    void destroyAgent(Long agentId);
    Optional<Agent> findById(Long agentId);
    Iterable<Agent>findAllAgent(Agent agent);
}
