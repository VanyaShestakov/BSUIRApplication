package com.ivanshestakov.bsuirapplication.Connector;

import com.ivanshestakov.bsuirapplication.BSUIRAPIEntity.BSUIRSchedule;
import com.ivanshestakov.bsuirapplication.Model.Employee;
import com.ivanshestakov.bsuirapplication.Model.Faculty;
import com.ivanshestakov.bsuirapplication.Model.Group;
import com.ivanshestakov.bsuirapplication.Model.Specialty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Type;
import java.util.List;

@Component
public class ServerConnectorImpl implements ServerConnector {

    @Autowired
    private RestTemplate restTemplate;

    private final String SCHEDULE_URL = "https://journal.bsuir.by/api/v1/studentGroup/schedule?studentGroup=";
    private final String EMPLOYEE_SCHEDULE_URL = "https://journal.bsuir.by/api/v1/portal/employeeSchedule?employeeId=";
    private final String GROUP_URL = "https://journal.bsuir.by/api/v1/groups";
    private final String EMPLOYEE_URL = "https://journal.bsuir.by/api/v1/employees";
    private final String SPECIALTIES_URL = "https://journal.bsuir.by/api/v1/specialities";
    private final String FACULTIES_URL = "https://journal.bsuir.by/api/v1/faculties";
    private final String CURRENT_WEEK_URL = "https://journal.bsuir.by/api/v1/week";

    public BSUIRSchedule getBSUIRSchedule(String groupNumber) {
        ResponseEntity<BSUIRSchedule> responseEntity =
                restTemplate.exchange
                        (SCHEDULE_URL + groupNumber,
                                HttpMethod.GET,
                                null,
                                new ParameterizedTypeReference<BSUIRSchedule>() {});
        return responseEntity.getBody();
    }

    public BSUIRSchedule getBSUIRScheduleForEmployee(String id) {
        ResponseEntity<BSUIRSchedule> responseEntity =
                restTemplate.exchange
                        (EMPLOYEE_SCHEDULE_URL + id,
                                HttpMethod.GET,
                                null,
                                new ParameterizedTypeReference<BSUIRSchedule>() {});
        return responseEntity.getBody();
    }

    public List<Group> getGroups() {
        ResponseEntity<List<Group>> responseEntity =
                restTemplate.exchange(GROUP_URL,
                        HttpMethod.GET,
                        null,
                        new ParameterizedTypeReference<List<Group>>() {});
        return responseEntity.getBody();
    }

    public List<Employee> getEmployees() {
        ResponseEntity<List<Employee>> responseEntity =
                restTemplate.exchange(EMPLOYEE_URL,
                        HttpMethod.GET,
                        null,
                        new ParameterizedTypeReference<List<Employee>>() {});
        return responseEntity.getBody();
    }

    public List<Specialty> getSpecialties(){
        ResponseEntity<List<Specialty>> responseEntity =
                restTemplate.exchange(SPECIALTIES_URL,
                        HttpMethod.GET,
                        null,
                        new ParameterizedTypeReference<List<Specialty>>() {});
        return responseEntity.getBody();
    }

    public List<Faculty> getFaculties() {
        ResponseEntity<List<Faculty>> responseEntity =
                restTemplate.exchange(FACULTIES_URL,
                        HttpMethod.GET,
                        null,
                        new ParameterizedTypeReference<List<Faculty>>() {});
        return responseEntity.getBody();
    }

    public int getCurrentWeek() {
        ResponseEntity<Integer> responseEntity =
                restTemplate.exchange(CURRENT_WEEK_URL,
                        HttpMethod.GET,
                        null,
                        new ParameterizedTypeReference<Integer>() {});
        return responseEntity.getBody();
    }

}
