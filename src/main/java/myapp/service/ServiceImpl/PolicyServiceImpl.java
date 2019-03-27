package myapp.service.ServiceImpl;

import myapp.domain.Policy;
import myapp.repository.PolicyRepository;
import myapp.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

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
}
