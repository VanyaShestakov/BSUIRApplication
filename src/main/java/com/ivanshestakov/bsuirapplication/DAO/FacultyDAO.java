package com.ivanshestakov.bsuirapplication.DAO;

import com.ivanshestakov.bsuirapplication.Model.Faculty;

import java.util.List;

public interface FacultyDAO {

    public List<Faculty> getFaculties();

    public void updateFacultyTable(List<Faculty> newFacultyList);
}
