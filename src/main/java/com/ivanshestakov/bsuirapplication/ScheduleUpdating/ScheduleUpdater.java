package com.ivanshestakov.bsuirapplication.ScheduleUpdating;

import com.ivanshestakov.bsuirapplication.Model.Group;
import com.ivanshestakov.bsuirapplication.Service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
@EnableScheduling
public class ScheduleUpdater {

    @Autowired
    private ScheduleService scheduleService;

    @Scheduled(initialDelay = 2000, fixedDelay = 10000)
    public void updateGroups(){
        scheduleService.updateGroups(scheduleService.getGroups());
    }
}
