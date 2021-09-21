package com.ivanshestakov.bsuirapplication.Controller;

import com.ivanshestakov.bsuirapplication.Model.Employee;
import com.ivanshestakov.bsuirapplication.Service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeesController {

    @Autowired
    private ScheduleService scheduleService;

    @GetMapping("/")
    private String showMainPage(Model model) {
        return "employees-view";
    }

    @PostMapping("/teacher")
    private String showTeacherInfoPage(@RequestParam("id") int id, Model model) {
        model.addAttribute("employee", scheduleService.getEmployeeById(id));
        return "teacher_info";
    }

    @PostMapping("/search-teacher")
    private String searchEmployees(Model model, @RequestParam("employeeName") String employeeName){
        if (employeeName.isBlank()) {
            model.addAttribute("errorMessage", "Заполните поле!");
        } else {
            List<Employee> employees = scheduleService.getEmployeesFromDBWithName(employeeName);
            employees.sort(Comparator.comparing(Employee::getLastName));
            model.addAttribute("employees", employees);
        }
        return "employees-view";
    }


}
