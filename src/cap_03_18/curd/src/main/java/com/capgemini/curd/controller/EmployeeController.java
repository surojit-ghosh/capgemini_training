package com.capgemini.curd.controller;

import com.capgemini.curd.dto.AddressDTO;
import com.capgemini.curd.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    @GetMapping("/mock")
    public EmployeeDTO mock() {
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setEmployeeName("John Doe");
        employeeDTO.setEmail("contact@surojit.in");
        employeeDTO.setPassword("password");
        employeeDTO.setAge(30);
        employeeDTO.setSalary(50000.0);
        employeeDTO.setGender("Male");

        AddressDTO addressDTO = new AddressDTO();
        addressDTO.setStreet("123 Main St");
        addressDTO.setCity("Anytown");
        addressDTO.setState("Anystate");
        addressDTO.setCountry("Anycountry");

        List<AddressDTO> addresses = new ArrayList<>();
        addresses.add(addressDTO);

        employeeDTO.setAddresses(addresses);
        return employeeDTO;
    }
}
