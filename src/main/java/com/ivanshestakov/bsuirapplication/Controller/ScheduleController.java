package com.ivanshestakov.bsuirapplication.Controller;

import com.ivanshestakov.bsuirapplication.Service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/BSUIRApp")
public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;

    @GetMapping("/schedule/groupNumber={groupNumber}")
    private String showMySchedulePage(@PathVariable String groupNumber, Model model) {
        model.addAttribute("schedules",  scheduleService.getScheduleForGroup(groupNumber).getSchedules());
        model.addAttribute("hello", "hello");
        System.out.println(scheduleService.getScheduleForGroup(groupNumber).getSchedules().get(0).getSchedule().get(0).getSubject());
        return "my_schedule";
    }

}
