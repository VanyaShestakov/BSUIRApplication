package com.ivanshestakov.bsuirapplication.DAO;

import com.ivanshestakov.bsuirapplication.Model.Group;

import java.util.List;

public interface GroupDAO {
    public void updateGroupTable(List<Group> newGroupList);

    public List<Group> getGroups();
}
