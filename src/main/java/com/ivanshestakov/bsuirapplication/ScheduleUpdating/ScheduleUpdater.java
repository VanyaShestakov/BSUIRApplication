package com.ivanshestakov.bsuirapplication.ScheduleUpdating;

import com.ivanshestakov.bsuirapplication.Model.Faculty;
import com.ivanshestakov.bsuirapplication.Model.Group;
import com.ivanshestakov.bsuirapplication.Model.Specialty;
import com.ivanshestakov.bsuirapplication.Service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@EnableScheduling
public class ScheduleUpdater {

    @Autowired
    private ScheduleService scheduleService;

    @Scheduled(initialDelay = 2000, fixedDelay = 5000)
    public void updateDatabase(){
        List<Group> groups = scheduleService.getGroupsFromServer();
        List<Faculty> faculties = scheduleService.getFacultiesFromServer();
        List<Specialty> specialties = scheduleService.getSpecialtiesFromServer();
        specialties.forEach(specialty ->
                specialty.setFaculty(faculties.stream()
                        .filter(faculty -> faculty.getId()==specialty.getFacultyId())
                        .findFirst()
                        .orElse(new Faculty())));
        groups.forEach(group -> {
                group.setFaculty(faculties.stream()
                        .filter(faculty -> faculty.getId()==group.getFacultyId())
                        .findFirst()
                        .get());
                group.setSpecialty(specialties.stream()
                        .filter(specialty -> specialty.getId()==group.getSpecialtyId())
                        .findFirst()
                        .get());
        });
        scheduleService.updateGroups(groups);
        System.out.println("updated");
    }


    @Scheduled(initialDelay = 2000, fixedDelay = 10000)
    public void updateEmployees() {
        scheduleService.updateEmployees(scheduleService.getEmployeesFromServer());
    }










}
