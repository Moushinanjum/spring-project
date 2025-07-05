package com.example.railwaymanagementsystem.service;
import com.example.railwaymanagementsystem.DTO.EmployeeDTO;
import com.example.railwaymanagementsystem.entity.Employee;
import com.example.railwaymanagementsystem.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public void addEmployee(EmployeeDTO employeeDTO) {
        Employee employee1 = new Employee();
        employee1.setName(employeeDTO.getName());
        employee1.setNumber(employeeDTO.getNumber());
        employee1.setSalary(employeeDTO.getSalary());

        employeeRepository.save(employee1);
    }

    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }
    public void updateEmployee(int id,Employee employee){
        Employee employee2 = new Employee();
        employee2.setName(employee.getName());
        employee2.setNumber(employee.getNumber());
        employee2.setSalary(employee.getSalary());

        employeeRepository.save(employee2);
    }

}
