package com.capgemini.curd.dto;

import lombok.Data;

import java.util.List;

@Data
public class EmployeeDTO {
    private String employeeName;
    private String email;
    private String password;
    private int age;
    private double salary;
    private String gender;
    private List<AddressDTO> addresses;
}
