package com.lokesh.restapp.employee;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.lokesh.restapp.employee.Employee;
@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Integer> {
}