package com.ivanshestakov.bsuirapplication.Service;

import com.ivanshestakov.bsuirapplication.BSUIRAPIEntity.BSUIRSchedule;
import com.ivanshestakov.bsuirapplication.BSUIRAPIEntity.Schedules;
import com.ivanshestakov.bsuirapplication.Model.Group;

import java.util.List;

public interface ScheduleService {

    public BSUIRSchedule getFullScheduleForGroup(String groupNumber);

    public List<Schedules> getSchedulesForGroup(String groupNumber);

    public void updateGroups(List<Group> newGroupList);

    public List<Group> getGroupsFromServer();

    public List<Group> getGroupsFromDB();

    public boolean groupExists(String groupNumber);

}
