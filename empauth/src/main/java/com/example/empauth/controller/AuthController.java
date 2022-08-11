package com.example.empauth.controller;

import com.example.empauth.model.ApiResponse;
import com.example.empauth.model.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    private ArrayList<Employee> empList =new ArrayList<>();

    @GetMapping("/emp")
    public ResponseEntity getEmployee(){
        return ResponseEntity.status(200).body(empList);
    }

    @PostMapping("/emp")
    public ResponseEntity addEmployee(@RequestBody @Valid  Employee employee, Errors errors){
        if(errors.hasErrors()){
            String message=errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(new ApiResponse(message,400));
        }
        empList.add(employee);
        return ResponseEntity.status(201).body( new ApiResponse("New employee added !",201));
    }

    @PutMapping("/emp/{index}")
    public ResponseEntity updateEmployee(@RequestBody @Valid  Employee employee
            ,@PathVariable int index,Errors errors){
        if(errors.hasErrors()){
            String message=errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(new ApiResponse(message,400));
        }
        if(index>= empList.size()){
            return ResponseEntity.status(400).body(new ApiResponse("Invalid index",400));
        }
        empList.set(index,employee);
        return ResponseEntity.status(201).body( new ApiResponse("User updated !",201));
    }

    @DeleteMapping("/emp/{index}")
    public ResponseEntity deleteUser(@PathVariable int index){
        if(index>= empList.size()){
            return ResponseEntity.status(400).body(new ApiResponse("Invalid index",400));
        }
        empList.remove(index);
        return ResponseEntity.status(200).body(new ApiResponse("User deleted !",200));
    }

    @PostMapping("/emp/leave/{index}")
    public ResponseEntity applyLeave(@PathVariable int index){
        int year=Integer.parseInt(empList.get(index).getAnnualLeave());
        if(index>= empList.size()){
            return ResponseEntity.status(400).body(new ApiResponse("Invalid index",400));
        }
        if(year==0||empList.get(index).isOnLeave()){
            return ResponseEntity.status(400).body(new ApiResponse("employee already on leave or has not annualLeave left",400));
        }

        empList.get(index).setOnLeave(true);
        year--;
        empList.get(index).setAnnualLeave(Integer.toString(year));
        return ResponseEntity.status(200).body(new ApiResponse("Ok !",200));
    }




}