package com.fullstackapp.fullstackapp.service;

import com.fullstackapp.fullstackapp.model.Employee;
import java.util.*;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(Long id);
    void deleteEmployeeById(Long id);
}
