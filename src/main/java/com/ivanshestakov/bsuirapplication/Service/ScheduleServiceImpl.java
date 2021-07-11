package com.ivanshestakov.bsuirapplication.Service;

import com.ivanshestakov.bsuirapplication.Connector.ScheduleConnector;
import com.ivanshestakov.bsuirapplication.Entity.BSUIRSchedule;
import com.ivanshestakov.bsuirapplication.Entity.Schedules;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService{

    @Autowired
    private ScheduleConnector scheduleConnector;

    @Override
    public BSUIRSchedule getFullScheduleForGroup(String groupNumber) {
        return scheduleConnector.getBSUIRSchedule(groupNumber);
    }

    @Override
    public List<Schedules> getSchedulesForGroup(String groupNumber) {
        return scheduleConnector.getBSUIRSchedule(groupNumber).getSchedules();
    }
}
