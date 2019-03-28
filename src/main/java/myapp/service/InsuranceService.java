package myapp.service;

import myapp.domain.Insurance;

public interface InsuranceService {
    Insurance addInsurance(Insurance insurance);
    public void deleteInsurance(Long insuranceId);
}
