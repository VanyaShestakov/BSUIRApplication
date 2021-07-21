package com.ivanshestakov.bsuirapplication.Connector;

import com.ivanshestakov.bsuirapplication.BSUIRAPIEntity.BSUIRSchedule;
import com.ivanshestakov.bsuirapplication.Model.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class ScheduleConnectorImpl implements ScheduleConnector{

    @Autowired
    private RestTemplate restTemplate;

    private final String SCHEDULE_URL = "https://journal.bsuir.by/api/v1/studentGroup/schedule?studentGroup=";
    private final String GROUP_URL = "https://journal.bsuir.by/api/v1/groups";

    public BSUIRSchedule getBSUIRSchedule(String groupNumber) {
        ResponseEntity<BSUIRSchedule> responseEntity =
                restTemplate.exchange
                        (SCHEDULE_URL + groupNumber, HttpMethod.GET, null, new ParameterizedTypeReference<BSUIRSchedule>() {});
        return responseEntity.getBody();
    }

    public List<Group> getGroups() {
        ResponseEntity<List<Group>> responseEntity =
                restTemplate.exchange(GROUP_URL, HttpMethod.GET, null, new ParameterizedTypeReference<List<Group>>() {});
        return responseEntity.getBody();
    }
}
