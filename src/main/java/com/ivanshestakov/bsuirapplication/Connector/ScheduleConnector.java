package com.ivanshestakov.bsuirapplication.Connector;

import com.ivanshestakov.bsuirapplication.BSUIRAPIEntity.BSUIRSchedule;
import com.ivanshestakov.bsuirapplication.Model.Group;

import java.util.List;

public interface ScheduleConnector {

    public BSUIRSchedule getBSUIRSchedule(String groupNumber);

    public List<Group> getGroups();
}
