package com.ivanshestakov.bsuirapplication.DAO;

import com.ivanshestakov.bsuirapplication.Model.Group;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class GroupDAOImpl implements GroupDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public void updateGroupTable(List<Group> newGroupList){
        Session session = entityManager.unwrap(Session.class);
        newGroupList.forEach(session::saveOrUpdate);
        System.out.println("groups updated!");
    }

    public List<Group> getGroups(){
        return entityManager.unwrap(Session.class).createQuery("from Group ", Group.class).getResultList();
    }

    public Group getGroupWithNumber(String groupNumber) {
        Group group = entityManager.unwrap(Session.class).createQuery("from Group where groupNumber = '" + groupNumber + "'", Group.class).getSingleResult();
        return group;
    }
}
