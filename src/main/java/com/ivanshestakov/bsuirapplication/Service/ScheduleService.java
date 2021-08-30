package com.ivanshestakov.bsuirapplication.Service;

import com.ivanshestakov.bsuirapplication.BSUIRAPIEntity.BSUIRSchedule;
import com.ivanshestakov.bsuirapplication.BSUIRAPIEntity.Schedules;
import com.ivanshestakov.bsuirapplication.Model.*;

import java.util.List;

public interface ScheduleService {

    public BSUIRSchedule getFullScheduleForGroup(String groupNumber);

    public List<Schedules> getSchedulesForGroup(String groupNumber);

    public List<Schedules> getSchedulesForEmployee(String id);

    public void updateGroups(List<Group> newGroupList);

    public List<Group> getGroupsFromServer();

    public List<Group> getGroupsFromDB();

    public boolean groupExists(String groupNumber);

    public void updateEmployees(List<Employee> newEmployeeList);

    public List<Employee> getEmployeesFromServer();

    public List<Employee> getEmployeesFromDB();

    public Employee getEmployeeById(int id);

    public Group getGroupWithNumber(String groupNumber);

    public void addSelectedGroup(SelectedGroup group);

    public boolean selectedGroupExists(String groupNumber);

    public List<SelectedGroup> getSelectedGroupsFromDB();

    public SelectedGroup getSelectedGroupWithNumber(String groupNumber);

    public void deleteSelectedGroup(String groupNumber);

    public List<Specialty> getSpecialtiesFromServer();

    public List<Specialty> getSpecialtiesFromDB();

    public void updateSpecialties(List<Specialty> newSpecialtyList);

    public List<Faculty> getFacultiesFromServer();

    public List<Faculty> getFacultiesFromDB();

    public void updateFaculties(List<Faculty> newFacultyList);

    public int getCurrentWeekFromServer();

}
