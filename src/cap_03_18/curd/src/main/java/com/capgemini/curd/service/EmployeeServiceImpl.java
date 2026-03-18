package com.capgemini.curd.service;

import com.capgemini.curd.dto.AddressDTO;
import com.capgemini.curd.dto.EmployeeDTO;
import com.capgemini.curd.entity.Address;
import com.capgemini.curd.entity.Employee;
import com.capgemini.curd.repository.EmployeeRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepositry employeeRepositry;

    @Override
    public String saveEmployee(EmployeeDTO employeeDTO) {
        Employee employee = Employee.builder()
                .employeeName(employeeDTO.getEmployeeName())
                .age(employeeDTO.getAge())
                .email(employeeDTO.getEmail())
                .salary(employeeDTO.getSalary())
                .password(employeeDTO.getPassword())
                .gender(employeeDTO.getGender())
                .build();

        List<Address> addressList = new ArrayList<>();

        List<AddressDTO> addresses = employeeDTO.getAddresses();
        System.out.println(addresses);
//        if (addresses != null) {
            for (AddressDTO address : addresses) {
                Address addressEntity = Address.builder()
                        .street(address.getStreet())
                        .city(address.getCity())
                        .state(address.getState())
                        .country(address.getCountry())
                        .employee(employee)
                        .build();

                addressList.add(addressEntity);
            }
//        }

        employee.setAddresses(addressList);

        employeeRepositry.save(employee);

        return "Employee saved successfully";
    }
}
