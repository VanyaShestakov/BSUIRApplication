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
    public void updateEmployeesTable(List<Employee> newEmployeeList) {
        Session session = entityManager.unwrap(Session.class);
        newEmployeeList.forEach(session::saveOrUpdate);
    }
}
