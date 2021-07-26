package com.ivanshestakov.bsuirapplication.Service;

import com.ivanshestakov.bsuirapplication.Connector.ServerConnector;
import com.ivanshestakov.bsuirapplication.BSUIRAPIEntity.BSUIRSchedule;
import com.ivanshestakov.bsuirapplication.BSUIRAPIEntity.Schedules;
import com.ivanshestakov.bsuirapplication.DAO.EmployeeDAO;
import com.ivanshestakov.bsuirapplication.DAO.GroupDAO;
import com.ivanshestakov.bsuirapplication.Model.Employee;
import com.ivanshestakov.bsuirapplication.Model.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ScheduleServiceImpl implements ScheduleService{

    @Autowired
    private ServerConnector serverConnector;

    @Autowired
    private GroupDAO groupDAO;

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    public BSUIRSchedule getFullScheduleForGroup(String groupNumber) {
        return serverConnector.getBSUIRSchedule(groupNumber);
    }

    @Override
    public List<Schedules> getSchedulesForGroup(String groupNumber) {
        return serverConnector.getBSUIRSchedule(groupNumber).getSchedules();
    }

    @Override
    public List<Group> getGroupsFromServer(){
        return serverConnector.getGroups();
    }

    @Transactional
    @Override
    public List<Group> getGroupsFromDB() {
        return groupDAO.getGroups();
    }

    @Transactional
    @Override
    public void updateGroups(List<Group> newGroupList){
        groupDAO.updateGroupTable(newGroupList);
    }

    @Override
    public boolean groupExists(String groupNumber) {
        return getGroupsFromDB().stream()
                .map(Group::getGroupNumber)
                .collect(Collectors.toList())
                .contains(groupNumber);
    }

    @Override
    public List<Employee> getEmployeesFromServer(){
        return serverConnector.getEmployees();
    }

    @Transactional
    @Override
    public List<Employee> getEmployeesFromDB(){
        return employeeDAO.getEmployees();
    }

    @Transactional
    @Override
    public void updateEmployees(List<Employee> newEmployeeList){
        employeeDAO.updateEmployeesTable(newEmployeeList);
    }

    @Transactional
    @Override
    public Employee getEmployeeById(int id){
        return employeeDAO.getEmployeeById(id);
    }




}
