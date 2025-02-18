package com.example.ptuddn.service;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ptuddn.modal.Employee;
import com.example.ptuddn.repository.EmployeeRepository;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public ArrayList<Employee> findAllEmployee() {
        return (ArrayList<Employee>) employeeRepository.findAll();
    }

    @Override
    public Employee findAllEmployeeByID(long id) {
        Optional<Employee> opt = employeeRepository.findById(id);
        return opt.orElse(null);
    }

    @Override
    public void addEmployee() {
        employeeRepository.save(new Employee("John Doe", "john.doe@example.com"));
    }

    @Override
    public void deleteAllData() {
        employeeRepository.deleteAll();
    }
}