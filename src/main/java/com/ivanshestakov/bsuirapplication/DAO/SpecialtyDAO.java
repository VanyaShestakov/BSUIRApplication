package com.ivanshestakov.bsuirapplication.DAO;

import com.ivanshestakov.bsuirapplication.Model.Specialty;

import java.util.List;

public interface SpecialtyDAO {

    public List<Specialty> getSpecialties();

    public void updateSpecialtyTable(List<Specialty> newSpecialtyList);
}
