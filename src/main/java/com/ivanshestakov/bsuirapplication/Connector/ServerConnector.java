package com.ivanshestakov.bsuirapplication.Connector;

import com.ivanshestakov.bsuirapplication.BSUIRAPIEntity.BSUIRSchedule;
import com.ivanshestakov.bsuirapplication.Model.Employee;
import com.ivanshestakov.bsuirapplication.Model.Faculty;
import com.ivanshestakov.bsuirapplication.Model.Group;
import com.ivanshestakov.bsuirapplication.Model.Specialty;

import java.util.List;

public interface ServerConnector {

    public BSUIRSchedule getBSUIRSchedule(String groupNumber);

    public List<Group> getGroups();

    public List<Employee> getEmployees();

    public List<Specialty> getSpecialties();

    public List<Faculty> getFaculties();

    public BSUIRSchedule getBSUIRScheduleForEmployee(String id);

    public int getCurrentWeek();
}
