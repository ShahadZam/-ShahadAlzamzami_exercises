package com.example.empauth.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import javax.validation.constraints.*;

@AllArgsConstructor @Data
public class Employee {
    @NotEmpty(message = "ID can't be empty")
    @Size(min = 2,message = "Id must be more than 2")
    private String ID;

    @NotEmpty(message = "ID can't be empty")
    @Size(min = 4,message = "name must be more than 4")
    private String name;

    @NotEmpty(message = "age can't be empty")
    @Min(value=26, message="must be  greater than 25")
    @Pattern(regexp="^[0-9]+$", message="the value must be positive integer")
    private String age;

    @AssertFalse(message = "must be false at first")
    private boolean onLeave;

    @NotEmpty(message = "employment Year can't be empty")
    @Pattern(regexp="^[0-9]+$", message="the value must be positive integer")
    @Min(value=1950, message="Enter a valid year")
    @Max(value=2022, message="Enter a valid year")
    private String employmentYear;

    @NotEmpty(message = "annual Leave can't be empty")
    @PositiveOrZero(message = "Enter a valid number")
    @Pattern(regexp="^[0-9]+$", message="the value must be positive integer")
    private String annualLeave;
}
