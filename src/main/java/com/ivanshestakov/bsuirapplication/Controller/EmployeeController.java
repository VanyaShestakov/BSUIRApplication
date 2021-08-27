package com.ivanshestakov.bsuirapplication.Controller;

import com.ivanshestakov.bsuirapplication.Service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/employeeschedule")
public class EmployeeController {

    @Autowired
    private ScheduleService scheduleService;

    @PostMapping("/")
    private String showSchedule(@RequestParam("id") int id, Model model){
        model.addAttribute("schedules", scheduleService.getSchedulesForEmployee(String.valueOf(id)));
        model.addAttribute("employee", scheduleService.getEmployeeById(id));
        return "employee_schedule_view";
    }
}
