package myapp.controller;

import myapp.domain.Insurance;
import myapp.service.InsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(value="insurances")
public class InsuranceController {
    @Autowired
    InsuranceService insuranceService;
    @RequestMapping(value="/",method = RequestMethod.POST)
    public Insurance addInsurance(@RequestBody Insurance insurance){
        return insuranceService.addInsurance(insurance);
    }
    @RequestMapping(value = "/",method = RequestMethod.DELETE)
    public void destroyInsurance(@RequestBody Long insuranceId){
        insuranceService.deleteInsurance(insuranceId);
    }
}
