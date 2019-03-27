package myapp.service;

import myapp.domain.Policy;

public interface PolicyService {
    Policy addPolicy(Policy policy);
    public void deletePolicy(Long policyId);
}
