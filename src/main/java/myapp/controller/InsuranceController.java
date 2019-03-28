package myapp.controller;

import myapp.domain.Insurance;
import myapp.service.InsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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


    @RequestMapping(value = "/insuranceId",method = RequestMethod.GET)
    public Optional<Insurance>findOne(@PathVariable Long insuranceId){
       return  insuranceService.findById(insuranceId);
    }


    @RequestMapping(value = "/",method = RequestMethod.GET)
    public Iterable<Insurance>findAllInsurance(@RequestParam Insurance insurance){
        return insuranceService.findAllInsurance(insurance);
    }
}
