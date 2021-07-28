package com.ivanshestakov.bsuirapplication.DAO;

import com.ivanshestakov.bsuirapplication.Model.SelectedGroup;

import java.util.List;

public interface SelectedGroupDAO {

    public void insertGroup(SelectedGroup group);

    public List<SelectedGroup> getSelectedGroups();
}
