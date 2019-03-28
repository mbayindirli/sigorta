package myapp.controller;

import myapp.domain.Agent;
import myapp.service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value="agenties")

public class AgentControlller {
    @Autowired
    AgentService agentService;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Agent addAgent(@RequestBody Agent agent) {
        return agentService.addAgent(agent);
    }


    @RequestMapping(value = "/{agentId}", method = RequestMethod.DELETE)
    public void destroyAgentById(@PathVariable Long agentId) {
        agentService.destroyAgent(agentId);
    }


    @RequestMapping(value = "/{agentId}", method = RequestMethod.GET)
    public Optional<Agent> findOne(@PathVariable Long agentId) {
        return agentService.findById(agentId);
    }


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Iterable<Agent> findAllAgent(@RequestParam Agent agent) {
        return agentService.findAllAgent(agent);
    }
}