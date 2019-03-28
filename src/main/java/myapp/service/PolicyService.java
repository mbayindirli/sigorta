package myapp.service;

import myapp.domain.Policy;

import java.util.Optional;

public interface PolicyService {
    Policy addPolicy(Policy policy);
    public void deletePolicy(Long policyId);
    Optional<Policy> findById(Long PolicyId);
    Iterable<Policy>findAllInsurance(Policy policy);
}
