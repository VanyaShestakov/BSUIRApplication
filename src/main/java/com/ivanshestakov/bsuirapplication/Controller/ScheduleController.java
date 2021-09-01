package com.ivanshestakov.bsuirapplication.Controller;

import com.ivanshestakov.bsuirapplication.Model.Group;
import com.ivanshestakov.bsuirapplication.Model.SelectedGroup;
import com.ivanshestakov.bsuirapplication.Service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;

@Controller
@RequestMapping("/BSUIRApp")
public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;

    @GetMapping("/")
    private String showMainPage(Model model, /*@CookieValue(value = "groupNumber") String groupNumber,*/ HttpServletRequest request) {
        Cookie[] cookies;
        if ((cookies = request.getCookies()) != null) {
            String groupNumber = cookies[0].getValue();
            model.addAttribute("error", "");
            fillModelForView(model, groupNumber, true);
        } else {
            model.addAttribute("selectedGroups", scheduleService.getSelectedGroupsFromDB());
        }
        return "my_schedule";
    }

    @PostMapping("/fullSchedule")
    private String showFullSchedule(@RequestParam String groupNumber, Model model, HttpServletResponse response) {
        fillModelForView(model, groupNumber, true);
        response.addCookie(new Cookie("groupNumber", groupNumber));
        return "my_schedule";
    }

    @PostMapping("/scheduleByWeek")
    private String showScheduleByWeek(@RequestParam String groupNumber, Model model, HttpServletResponse response) {
        fillModelForView(model, groupNumber, false);
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

    private void fillModelForView(Model model, String groupNumber, boolean isFull) {
        model.addAttribute("schedules", scheduleService.getSchedulesForGroup(groupNumber));
        model.addAttribute("selectedGroups", scheduleService.getSelectedGroupsFromDB());
        model.addAttribute("group", scheduleService.getGroupWithNumber(groupNumber));
        model.addAttribute("currentWeek", scheduleService.getCurrentWeekFromServer());
        model.addAttribute("isFull", isFull);
    }


}
