package com.ivanshestakov.bsuirapplication.Service;

import com.ivanshestakov.bsuirapplication.BSUIRAPIEntity.BSUIRSchedule;
import com.ivanshestakov.bsuirapplication.BSUIRAPIEntity.Schedules;
import com.ivanshestakov.bsuirapplication.Model.Employee;
import com.ivanshestakov.bsuirapplication.Model.Group;
import com.ivanshestakov.bsuirapplication.Model.SelectedGroup;

import java.util.List;

public interface ScheduleService {

    public BSUIRSchedule getFullScheduleForGroup(String groupNumber);

    public List<Schedules> getSchedulesForGroup(String groupNumber);

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

}
