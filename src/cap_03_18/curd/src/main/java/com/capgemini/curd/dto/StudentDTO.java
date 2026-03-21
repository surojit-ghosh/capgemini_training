package com.capgemini.curd.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class StudentDTO {
    @NotBlank(message = "Name cannot be blank")
    private String studentName;

    @Email(message = "Invalid email format")
    @NotBlank(message = "Email cannot be blank")
    private String email;

    @Min(value = 1, message = "Age must be at least 1")
    @Max(value = 100, message = "Age must be under 100")
    private int age;

    @NotBlank(message = "Gender cannot be blank")
    private String gender;

    @Min(value = 0, message = "Marks cannot be negative")
    @Max(value = 100, message = "Marks cannot exceed 100")
    private int marks;

    @NotBlank(message = "Password cannot be blank")
    @Size(min = 6, message = "Password must be at least 6 characters")
    private String password;

    @NotBlank(message = "Stream cannot be blank")
    private String stream;
}