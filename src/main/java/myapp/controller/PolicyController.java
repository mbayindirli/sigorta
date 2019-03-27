package myapp.controller;

import myapp.domain.Policy;
import myapp.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="policies")
public class PolicyController {
    @Autowired
    PolicyService policyService;
    @RequestMapping(value = "/" ,method = RequestMethod.POST)
    public Policy addPolicy(@RequestBody Policy policy){
        return policyService.addPolicy(policy);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "{policyId}")
    public void destroyPolicy(@PathVariable("policyId") Long policyId){
        policyService.deletePolicy(policyId);
    }



}
