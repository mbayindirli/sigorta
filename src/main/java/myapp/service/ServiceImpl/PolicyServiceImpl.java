package myapp.service.ServiceImpl;

import myapp.domain.Policy;
import myapp.repository.PolicyRepository;
import myapp.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class PolicyServiceImpl implements PolicyService {
    @Autowired
    PolicyRepository policyRepository;
    @Override
    public Policy addPolicy(Policy policy) {
        return policyRepository.save(policy);
    }

    @Override
    public void deletePolicy(Long policyId) {
     policyRepository.deleteById(policyId);
    }

    @Override
    public Optional<Policy> findById(Long PolicyId) {
        return policyRepository.findById(PolicyId);
    }

    @Override
    public Iterable<Policy> findAllInsurance(Policy policy) {
        return policyRepository.findAll(Example.of(policy));
    }
}
