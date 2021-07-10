package com.ivanshestakov.bsuirapplication.Connector;

import com.ivanshestakov.bsuirapplication.Entity.BSUIRSchedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ScheduleConnector {

    @Autowired
    private RestTemplate restTemplate;

    private final String URL = "https://journal.bsuir.by/api/v1/studentGroup/schedule?studentGroup=";

    public BSUIRSchedule getBSUIRSchedule(String groupNumber) {
        ResponseEntity<BSUIRSchedule> responseEntity =
                restTemplate.exchange
                        (URL + groupNumber, HttpMethod.GET, null, new ParameterizedTypeReference<BSUIRSchedule>() {});
        return responseEntity.getBody();
    }
}
