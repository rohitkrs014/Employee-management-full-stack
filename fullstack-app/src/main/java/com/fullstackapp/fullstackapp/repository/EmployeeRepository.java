package com.fullstackapp.fullstackapp.repository;

import com.fullstackapp.fullstackapp.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee,Long>{
    
}
