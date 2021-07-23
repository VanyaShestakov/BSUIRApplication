package com.ivanshestakov.bsuirapplication.Controller;

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
        }

        return "my_schedule";
    }

    @GetMapping("/teacher")
    private String showTeacherInfoPage() {
        return "teacher_info";
    }


}
