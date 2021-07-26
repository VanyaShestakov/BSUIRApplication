package com.ivanshestakov.bsuirapplication.DAO;

import com.ivanshestakov.bsuirapplication.Model.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> getEmployees();

    public void updateEmployeesTable(List<Employee> newEmployeeList);

}
