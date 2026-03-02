package cap_02_19.stream_api;

import java.time.LocalDate;

public class Employee {
    private String name;
    private double salary;
    private int age;
    private String email;
    private LocalDate dob;
    private LocalDate hireDay;
    private String phoneNumber;
    private String address;
    private String gender;

    public Employee() {

    }

    public Employee(String name, double salary, int age, String email, LocalDate dob, LocalDate hireDay, String phoneNumber, String address, String gender) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.email = email;
        this.dob = dob;
        this.hireDay = hireDay;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.gender = gender;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /// //////////////////////////////////////////////////////
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    /// //////////////////////////////////////////////////////
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /// ///////////////////////////////////////////////////////
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /// //////////////////////////////////////////////////////
    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    /// //////////////////////////////////////////////////////
    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }

    /// ///////////////////////////////////////////////////////
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /// ////////////////////////////////////////////////////////
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /// /////////////////////////////////////////////////////////
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    /// //////////////////////////////////////////////////////////
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", hireDay=" + hireDay +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
