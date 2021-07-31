package com.ivanshestakov.bsuirapplication.Controller;

import com.ivanshestakov.bsuirapplication.Model.Employee;
import com.ivanshestakov.bsuirapplication.Service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
