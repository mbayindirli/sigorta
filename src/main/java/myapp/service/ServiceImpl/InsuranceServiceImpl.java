package myapp.service.ServiceImpl;

import myapp.domain.Insurance;
import myapp.repository.InsuranceRepository;
import myapp.service.InsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InsuranceServiceImpl implements InsuranceService {
    @Autowired
    InsuranceRepository insuranceRepository;

    @Override
    public void deleteInsurance(Long insuranceId) {
        insuranceRepository.deleteById(insuranceId); }

    @Override
    public Insurance addInsurance(Insurance insurance) {
        return insuranceRepository.save(insurance);
    }

    @Override
    public Optional<Insurance> findById(Long insuranceId) {
        return insuranceRepository.findById(insuranceId);
    }

    @Override
    public Iterable<Insurance> findAllCustomer(Insurance insurance) {
        return insuranceRepository.findAll(Example.of(insurance));
    }
}
