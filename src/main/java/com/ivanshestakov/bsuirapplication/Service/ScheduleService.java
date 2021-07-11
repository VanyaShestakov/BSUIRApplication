package com.ivanshestakov.bsuirapplication.Service;

import com.ivanshestakov.bsuirapplication.Entity.BSUIRSchedule;
import com.ivanshestakov.bsuirapplication.Entity.Schedules;

import java.util.List;

public interface ScheduleService {

    public BSUIRSchedule getFullScheduleForGroup(String groupNumber);

    public List<Schedules> getSchedulesForGroup(String groupNumber);
}
