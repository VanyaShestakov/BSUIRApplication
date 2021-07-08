package com.ivanshestakov.bsuirapplication.Entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "weekDay",
        "schedule"
})
@Generated("jsonschema2pojo")
public class ExamSchedule {

    @JsonProperty("weekDay")
    private String weekDay;
    @JsonProperty("schedule")
    private List<Schedule> schedule = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("weekDay")
    public String getWeekDay() {
        return weekDay;
    }

    @JsonProperty("weekDay")
    public void setWeekDay(String weekDay) {
        this.weekDay = weekDay;
    }

    @JsonProperty("schedule")
    public List<Schedule> getSchedule() {
        return schedule;
    }

    @JsonProperty("schedule")
    public void setSchedule(List<Schedule> schedule) {
        this.schedule = schedule;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
