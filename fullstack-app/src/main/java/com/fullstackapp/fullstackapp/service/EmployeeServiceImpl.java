package com.fullstackapp.fullstackapp.service;

import java.util.List;
import java.util.Optional;

import com.fullstackapp.fullstackapp.model.Employee;
import com.fullstackapp.fullstackapp.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        this.employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(Long id) {
        Optional<Employee> optional=employeeRepository.findById(id);
        Employee employee=null;
        if(optional.isPresent()) {
            employee=optional.get();
        } else {
            throw new RuntimeException("Employee not found for id :: "+ id);
        }
        return employee;
    }

    @Override
    public void deleteEmployeeById(Long id) {
        this.employeeRepository.deleteById(id);
    }
    
    
    
}
