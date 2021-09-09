package com.ivanshestakov.bsuirapplication.DAO;

import com.ivanshestakov.bsuirapplication.Model.Employee;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Employee> getEmployees(){
        return entityManager.unwrap(Session.class).createQuery("from Employee ", Employee.class).getResultList();
    }

    @Override
    public List<Employee> getEmployeesWithName(String employeeName) {
        employeeName = employeeName.replaceAll(" ", "");
        return entityManager.unwrap(Session.class).createQuery("from Employee where " +
                "concat(firstName, lastName, middleName) like '%" + employeeName + "%' or " +
                "concat(firstName, middleName, lastName) like '%" + employeeName + "%' or " +
                "concat(middleName, lastName, firstName) like '%" + employeeName + "%' or " +
                "concat(middleName, firstName, lastName) like '%" + employeeName + "%' or " +
                "concat(lastName, firstName, middleName) like '%" + employeeName + "%' or " +
                "concat(lastName, middleName, firstName) like '%" + employeeName + "%'", Employee.class)
                .getResultList();
    }

    @Override
    public void updateEmployeesTable(List<Employee> newEmployeeList) {
        Session session = entityManager.unwrap(Session.class);
        newEmployeeList.forEach(session::saveOrUpdate);
    }

    @Override
    public Employee getEmployeeById(int id){
        return entityManager.unwrap(Session.class).get(Employee.class, id);
    }
}
