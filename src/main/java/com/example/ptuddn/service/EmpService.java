package com.example.ptuddn.service;

import java.util.ArrayList;
import com.example.ptuddn.modal.Employee;

public interface EmpService {
    ArrayList<Employee> findAllEmployee();
    Employee findAllEmployeeByID(long id);
    void addEmployee();
    void deleteAllData();
}
