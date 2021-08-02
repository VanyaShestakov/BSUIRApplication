package com.ivanshestakov.bsuirapplication.DAO;

import com.ivanshestakov.bsuirapplication.Model.Specialty;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class SpecialtyDAOImpl implements SpecialtyDAO{

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Specialty> getSpecialties() {
        return entityManager.unwrap(Session.class).createQuery("from Specialty", Specialty.class).getResultList();
    }

    @Override
    public void updateSpecialtyTable(List<Specialty> newSpecialtyList){
        Session session = entityManager.unwrap(Session.class);
        newSpecialtyList.forEach(session::saveOrUpdate);
    }
}
