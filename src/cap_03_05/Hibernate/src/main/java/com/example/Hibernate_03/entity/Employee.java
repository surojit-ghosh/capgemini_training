package com.example.Hibernate_03.entity;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.*;

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "employee_id", nullable = false, unique = true)
    private int employeeId;

    @Column(name = "employee_name", nullable = false)
    private String employeeName;

    @Column(name = "date_of_birth", nullable = false)
    private LocalDate dateOfBirth;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "department", nullable = false)
    private Department department;

    @Column(name = "gender", nullable = false)
    private String gender;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "phone", nullable = false, unique = true)
    private String phone;

    @Column(name = "salary", nullable = false)
    private double salary;

    @OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
    private Address addressEntity;

    public  Employee(Address addressEntity) {
        super();
        this.addressEntity = addressEntity;
    }

    public Employee(int employeeId, String employeeName, LocalDate dateOfBirth, String email, String password, Department department, String gender, String address, String phone, double salary, Address addressEntity) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.password = password;
        this.department = department;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
        this.salary = salary;
        this.addressEntity = addressEntity;
    }

    public Employee() {
        super();
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Department getDepartment() {
        return department;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public double getSalary() {
        return salary;
    }

    public  Address getAddressEntity() {
        return addressEntity;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAddressEntity(Address addressEntity) {
        this.addressEntity = addressEntity;
    }

    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", department=" + department +
                ", gender='" + gender + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                '}';
    }


    @Override
    public int hashCode() {
        return Objects.hash(employeeId, employeeName, dateOfBirth, email, password, department, gender, phone, salary);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeId == employee.employeeId && Double.compare(salary, employee.salary) == 0
                && Objects.equals(employeeName, employee.employeeName) && Objects.equals(dateOfBirth, employee.dateOfBirth)
                && Objects.equals(email, employee.email) && Objects.equals(password, employee.password)
                && Objects.equals(department, employee.department) && Objects.equals(gender, employee.gender)
                && Objects.equals(phone, employee.phone);
    }
}
