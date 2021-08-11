package com.ivanshestakov.bsuirapplication.Controller;

import com.ivanshestakov.bsuirapplication.Service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/faculties")
public class FacultiesController {

    @Autowired
    private ScheduleService scheduleService;

    @GetMapping("/")
    private String showMainPage(Model model){
        model.addAttribute("faculties", scheduleService.getFacultiesFromDB());
        return "faculties_view";
    }

}
