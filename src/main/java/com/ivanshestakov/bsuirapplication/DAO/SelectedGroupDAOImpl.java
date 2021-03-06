package com.ivanshestakov.bsuirapplication.DAO;

import com.ivanshestakov.bsuirapplication.Model.Group;
import com.ivanshestakov.bsuirapplication.Model.SelectedGroup;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class SelectedGroupDAOImpl implements SelectedGroupDAO{

    @Autowired
    private EntityManager entityManager;

    @Override
    public void insertGroup(SelectedGroup group) {
        entityManager.unwrap(Session.class).persist(group);
    }

    @Override
    public List<SelectedGroup> getSelectedGroups() {
        return entityManager.unwrap(Session.class).createQuery("from SelectedGroup ", SelectedGroup.class).getResultList();
    }

    @Override
    public SelectedGroup getSelectedGroupWithNumber(String groupNumber) {
        return entityManager.unwrap(Session.class).createQuery("from SelectedGroup where groupNumber = '" + groupNumber + "'", SelectedGroup.class).getSingleResult();
    }

    @Override
    public void deleteSelectedGroup(String groupNumber) {
        entityManager.unwrap(Session.class).delete(getSelectedGroupWithNumber(groupNumber));
    }
}
