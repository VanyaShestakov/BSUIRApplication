package com.ivanshestakov.bsuirapplication.Controller;

import com.ivanshestakov.bsuirapplication.Model.Employee;
import com.ivanshestakov.bsuirapplication.Service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Comparator;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeesController {

    @Autowired
    private ScheduleService scheduleService;

    @GetMapping("/")
    private String showMainPage(Model model) {
        List<Employee> employees = scheduleService.getEmployeesFromDB();
        employees.sort(Comparator.comparing(Employee::getLastName));
        model.addAttribute("employees", employees);
        return "employees-view";
    }

    @PostMapping("/teacher")
    private String showTeacherInfoPage(@RequestParam("id") int id, Model model) {
        model.addAttribute("employee", scheduleService.getEmployeeById(id));
        return "teacher_info";
    }


}
