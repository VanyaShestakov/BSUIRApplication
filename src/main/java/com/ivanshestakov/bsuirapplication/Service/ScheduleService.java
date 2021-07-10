package com.ivanshestakov.bsuirapplication.Service;

import com.ivanshestakov.bsuirapplication.Connector.ScheduleConnector;
import com.ivanshestakov.bsuirapplication.Entity.BSUIRSchedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScheduleService {

    @Autowired
    private ScheduleConnector scheduleConnector;

    public BSUIRSchedule getScheduleForGroup(String groupNumber) {
        return scheduleConnector.getBSUIRSchedule(groupNumber);
    }
}
