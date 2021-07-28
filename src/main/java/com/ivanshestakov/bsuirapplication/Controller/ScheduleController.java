package com.ivanshestakov.bsuirapplication.Controller;

import com.ivanshestakov.bsuirapplication.Model.Group;
import com.ivanshestakov.bsuirapplication.Model.SelectedGroup;
import com.ivanshestakov.bsuirapplication.Service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/BSUIRApp")
public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;

    @GetMapping("/")
    private String showMySchedulePage(Model model) {
        model.addAttribute("error", "");
        return "my_schedule";
    }

    @PostMapping("/")
    private String showSchedule(@RequestParam String groupNumber, Model model) {
        if (!scheduleService.groupExists(groupNumber)) {
            model.addAttribute("error", "The group with number " + groupNumber + " does not exists");
        } else {
            model.addAttribute("schedules", scheduleService.getSchedulesForGroup(groupNumber));
            if (!scheduleService.selectedGroupExists(groupNumber)) {
                Group group = scheduleService.getGroupWithNumber(groupNumber);
                SelectedGroup selectedGroup = new SelectedGroup(group.getId(), groupNumber);
                scheduleService.addSelectedGroup(selectedGroup);
            }
        }

        return "my_schedule";
    }

    @PostMapping("/teacher")
    private String showTeacherInfoPage(@RequestParam("id") int id, Model model) {
        model.addAttribute("employee", scheduleService.getEmployeeById(id));
        return "teacher_info";
    }


}
