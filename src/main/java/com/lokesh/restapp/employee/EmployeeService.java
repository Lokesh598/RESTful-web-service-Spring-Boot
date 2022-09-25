package com.lokesh.restapp.employee;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Transactional(readOnly= true)
    public List<Employee> findAllEmployee() {
        return employeeRepository.findAll();
    }

    @Transactional(readOnly=true)
    public Employee findEmployeeById(int employeeId) {
        Optional<Employee> emp = employeeRepository.findById(employeeId);
        if(emp.isPresent())
            return emp.get();
        return null;
    }

    @Transactional
    public boolean deleteEmployeeById(int employeeId) {
        long count = employeeRepository.count();
        employeeRepository.deleteById(employeeId);
        return employeeRepository.count() < count;
    }

    public Employee insertOrModifyEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}
