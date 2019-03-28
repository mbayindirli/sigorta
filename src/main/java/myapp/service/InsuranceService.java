package myapp.service;

import myapp.domain.Insurance;

import java.util.Optional;

public interface InsuranceService {
    Insurance addInsurance(Insurance insurance);
    void deleteInsurance(Long insuranceId);
    Optional<Insurance> findById(Long insuranceId);
    Iterable<Insurance>findAllInsurance(Insurance insurance);
}
