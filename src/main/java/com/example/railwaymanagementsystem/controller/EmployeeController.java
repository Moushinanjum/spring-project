package com.example.railwaymanagementsystem.controller;
import com.example.railwaymanagementsystem.DTO.EmployeeDTO;
import com.example.railwaymanagementsystem.entity.Employee;
import com.example.railwaymanagementsystem.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    @PostMapping("/employee/add")
    public void addEmployee(@RequestBody EmployeeDTO employeeDTO){

        employeeService.addEmployee(employeeDTO);
    }

    @GetMapping("/employee/get")
    public List<Employee> getEmployees(){
        return employeeService.getEmployees();
    }
    @PutMapping("/employee/update/{id}")
    public void updateEmployee(@PathVariable int id,@RequestBody Employee employee){

        employeeService.updateEmployee(id,employee);
    }

}


