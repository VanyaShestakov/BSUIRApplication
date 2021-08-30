package com.ivanshestakov.bsuirapplication.Controller;

import com.ivanshestakov.bsuirapplication.Model.Group;
import com.ivanshestakov.bsuirapplication.Model.SelectedGroup;
import com.ivanshestakov.bsuirapplication.Service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/BSUIRApp")
public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;

    @GetMapping("/")
    private String showMainPage(Model model, @CookieValue(value = "groupNumber") String groupNumber) {
        if (groupNumber != null) {
            model.addAttribute("error", "");
            fillModelForView(model, groupNumber);
        } else {
            model.addAttribute("selectedGroups", scheduleService.getSelectedGroupsFromDB());
        }
        return "my_schedule";
    }

    @PostMapping("/")
    private String showSchedule(@RequestParam String groupNumber, Model model, HttpServletResponse response) {
        fillModelForView(model, groupNumber);
        response.addCookie(new Cookie("groupNumber", groupNumber));
        return "my_schedule";
    }

    @PostMapping("/deletegroup")
    private String deleteSelectedGroup(@RequestParam String groupNumber, Model model) {
        scheduleService.deleteSelectedGroup(groupNumber);
        return "redirect:/BSUIRApp/";
    }

    @PostMapping("/addgroup")
    private String addGroup (@RequestParam ("groupNumber") String groupNumber, Model model) {
        if (!scheduleService.groupExists(groupNumber)) {
            model.addAttribute("error", "Группы: '" + groupNumber + "' не существует");
            model.addAttribute("selectedGroups", scheduleService.getSelectedGroupsFromDB());
            return "my_schedule";
        } else {
            if (!scheduleService.selectedGroupExists(groupNumber)) {
                Group group = scheduleService.getGroupWithNumber(groupNumber);
                SelectedGroup selectedGroup = new SelectedGroup(group.getId(), groupNumber);
                scheduleService.addSelectedGroup(selectedGroup);
            }
            return "redirect:/BSUIRApp/";
        }
    }

    private void fillModelForView(Model model, String groupNumber) {
        model.addAttribute("schedules", scheduleService.getSchedulesForGroup(groupNumber));
        model.addAttribute("selectedGroups", scheduleService.getSelectedGroupsFromDB());
        model.addAttribute("group", scheduleService.getGroupWithNumber(groupNumber));
        model.addAttribute("currentWeek", scheduleService.getCurrentWeekFromServer());
    }


}
