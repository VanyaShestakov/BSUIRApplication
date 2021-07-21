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
        newGroupList.stream().forEach(session::saveOrUpdate);
    }
}
