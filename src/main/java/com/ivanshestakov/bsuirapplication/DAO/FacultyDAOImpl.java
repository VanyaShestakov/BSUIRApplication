package com.ivanshestakov.bsuirapplication.DAO;

import com.ivanshestakov.bsuirapplication.Model.Faculty;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class FacultyDAOImpl implements FacultyDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Faculty> getFaculties() {
        return entityManager.unwrap(Session.class).createQuery("from Faculty", Faculty.class).getResultList();
    }

    @Override
    public void updateFacultyTable(List<Faculty> newFacultyList) {
        newFacultyList.forEach(entityManager.unwrap(Session.class)::saveOrUpdate);
    }
}
