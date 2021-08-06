package com.ivanshestakov.bsuirapplication.Service;

import com.ivanshestakov.bsuirapplication.Connector.ServerConnector;
import com.ivanshestakov.bsuirapplication.BSUIRAPIEntity.BSUIRSchedule;
import com.ivanshestakov.bsuirapplication.BSUIRAPIEntity.Schedules;
import com.ivanshestakov.bsuirapplication.DAO.*;
import com.ivanshestakov.bsuirapplication.Model.*;
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

    @Autowired
    private SelectedGroupDAO selectedGroupDAO;

    @Autowired
    private SpecialtyDAO specialtyDAO;

    @Autowired
    private FacultyDAO facultyDAO;

    @Override
    public BSUIRSchedule getFullScheduleForGroup(String groupNumber) {
        return serverConnector.getBSUIRSchedule(groupNumber);
    }

    @Override
    public List<Schedules> getSchedulesForGroup(String groupNumber) {
        return serverConnector.getBSUIRSchedule(groupNumber).getSchedules();
    }

    @Override
    public List<Schedules> getSchedulesForEmployee(String id) {
        return serverConnector.getBSUIRScheduleForEmployee(id).getSchedules();
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

    @Transactional
    @Override
    public Group getGroupWithNumber(String groupNumber){
        return groupDAO.getGroupWithNumber(groupNumber);
    }

    @Transactional
    @Override
    public void addSelectedGroup(SelectedGroup group) {
        selectedGroupDAO.insertGroup(group);
    }

    @Transactional
    @Override
    public boolean selectedGroupExists(String groupNumber) {
        return selectedGroupDAO.getSelectedGroups()
                .stream()
                .map(SelectedGroup::getGroupNumber)
                .collect(Collectors.toList())
                .contains(groupNumber);
    }

    @Transactional
    @Override
    public List<SelectedGroup> getSelectedGroupsFromDB() {
        return selectedGroupDAO.getSelectedGroups();
    }

    @Transactional
    @Override
    public SelectedGroup getSelectedGroupWithNumber(String groupNumber){
        return selectedGroupDAO.getSelectedGroupWithNumber(groupNumber);
    }

    @Transactional
    @Override
    public void deleteSelectedGroup(String groupNumber) {
        selectedGroupDAO.deleteSelectedGroup(groupNumber);
    }

    @Override
    public List<Specialty> getSpecialtiesFromServer() {
        return serverConnector.getSpecialties();
    }

    @Transactional
    @Override
    public List<Specialty> getSpecialtiesFromDB() {
        return specialtyDAO.getSpecialties();
    }

    @Transactional
    @Override
    public void updateSpecialties(List<Specialty> newSpecialtyList) {
        specialtyDAO.updateSpecialtyTable(newSpecialtyList);
    }

    @Override
    public List<Faculty> getFacultiesFromServer() {
        return serverConnector.getFaculties();
    }

    @Transactional
    @Override
    public List<Faculty> getFacultiesFromDB() {
        return facultyDAO.getFaculties();
    }

    @Transactional
    @Override
    public void updateFaculties(List<Faculty> newFacultyList) {
        facultyDAO.updateFacultyTable(newFacultyList);
    }


}
