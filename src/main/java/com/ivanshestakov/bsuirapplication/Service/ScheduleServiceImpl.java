package com.ivanshestakov.bsuirapplication.Service;

import com.ivanshestakov.bsuirapplication.Connector.ScheduleConnector;
import com.ivanshestakov.bsuirapplication.Connector.ScheduleConnectorImpl;
import com.ivanshestakov.bsuirapplication.BSUIRAPIEntity.BSUIRSchedule;
import com.ivanshestakov.bsuirapplication.BSUIRAPIEntity.Schedules;
import com.ivanshestakov.bsuirapplication.DAO.GroupDAO;
import com.ivanshestakov.bsuirapplication.Model.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService{

    @Autowired
    private ScheduleConnector scheduleConnector;

    @Autowired
    private GroupDAO groupDAO;

    @Override
    public BSUIRSchedule getFullScheduleForGroup(String groupNumber) {
        return scheduleConnector.getBSUIRSchedule(groupNumber);
    }

    @Override
    public List<Schedules> getSchedulesForGroup(String groupNumber) {
        return scheduleConnector.getBSUIRSchedule(groupNumber).getSchedules();
    }

    @Override
    public List<Group> getGroups(){
        return scheduleConnector.getGroups();
    }

    @Transactional
    @Override
    public void updateGroups(List<Group> newGroupList){
        groupDAO.updateGroupTable(newGroupList);
    }


}
