package com.capgemini.curd.controller;

import com.capgemini.curd.dto.AddressDTO;
import com.capgemini.curd.dto.EmployeeDTO;
import com.capgemini.curd.entity.Student;
import com.capgemini.curd.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/mock")
    public ResponseEntity<EmployeeDTO> mock() {
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
        return ResponseEntity.ok(employeeDTO);
    }

    @PostMapping("/save-employee")
    public ResponseEntity<String> saveEmployee(@RequestBody EmployeeDTO employeeDTO) {
        String message =  employeeService.saveEmployee(employeeDTO);

        return ResponseEntity.ok(message);
    }
}
