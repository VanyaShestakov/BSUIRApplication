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
        "employee",
        "studentGroup",
        "schedules",
        "examSchedules",
        "todayDate",
        "todaySchedules",
        "tomorrowDate",
        "tomorrowSchedules",
        "currentWeekNumber",
        "dateStart",
        "dateEnd",
        "sessionStart",
        "sessionEnd"
})
@Generated("jsonschema2pojo")
public class BSUIRSchedule {

    @JsonProperty("employee")
    private Object employee;
    @JsonProperty("studentGroup")
    private StudentGroup studentGroup;
    @JsonProperty("schedules")
    private List<Schedules> schedules = null;
    @JsonProperty("examSchedules")
    private List<ExamSchedule> examSchedules = null;
    @JsonProperty("todayDate")
    private String todayDate;
    @JsonProperty("todaySchedules")
    private List<Object> todaySchedules = null;
    @JsonProperty("tomorrowDate")
    private String tomorrowDate;
    @JsonProperty("tomorrowSchedules")
    private List<Object> tomorrowSchedules = null;
    @JsonProperty("currentWeekNumber")
    private Integer currentWeekNumber;
    @JsonProperty("dateStart")
    private String dateStart;
    @JsonProperty("dateEnd")
    private String dateEnd;
    @JsonProperty("sessionStart")
    private Object sessionStart;
    @JsonProperty("sessionEnd")
    private Object sessionEnd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("employee")
    public Object getEmployee() {
        return employee;
    }

    @JsonProperty("employee")
    public void setEmployee(Object employee) {
        this.employee = employee;
    }

    @JsonProperty("studentGroup")
    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    @JsonProperty("studentGroup")
    public void setStudentGroup(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    @JsonProperty("schedules")
    public List<Schedules> getSchedules() {
        return schedules;
    }

    @JsonProperty("schedules")
    public void setSchedules(List<Schedules> schedules) {
        this.schedules = schedules;
    }

    @JsonProperty("examSchedules")
    public List<ExamSchedule> getExamSchedules() {
        return examSchedules;
    }

    @JsonProperty("examSchedules")
    public void setExamSchedules(List<ExamSchedule> examSchedules) {
        this.examSchedules = examSchedules;
    }

    @JsonProperty("todayDate")
    public String getTodayDate() {
        return todayDate;
    }

    @JsonProperty("todayDate")
    public void setTodayDate(String todayDate) {
        this.todayDate = todayDate;
    }

    @JsonProperty("todaySchedules")
    public List<Object> getTodaySchedules() {
        return todaySchedules;
    }

    @JsonProperty("todaySchedules")
    public void setTodaySchedules(List<Object> todaySchedules) {
        this.todaySchedules = todaySchedules;
    }

    @JsonProperty("tomorrowDate")
    public String getTomorrowDate() {
        return tomorrowDate;
    }

    @JsonProperty("tomorrowDate")
    public void setTomorrowDate(String tomorrowDate) {
        this.tomorrowDate = tomorrowDate;
    }

    @JsonProperty("tomorrowSchedules")
    public List<Object> getTomorrowSchedules() {
        return tomorrowSchedules;
    }

    @JsonProperty("tomorrowSchedules")
    public void setTomorrowSchedules(List<Object> tomorrowSchedules) {
        this.tomorrowSchedules = tomorrowSchedules;
    }

    @JsonProperty("currentWeekNumber")
    public Integer getCurrentWeekNumber() {
        return currentWeekNumber;
    }

    @JsonProperty("currentWeekNumber")
    public void setCurrentWeekNumber(Integer currentWeekNumber) {
        this.currentWeekNumber = currentWeekNumber;
    }

    @JsonProperty("dateStart")
    public String getDateStart() {
        return dateStart;
    }

    @JsonProperty("dateStart")
    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    @JsonProperty("dateEnd")
    public String getDateEnd() {
        return dateEnd;
    }

    @JsonProperty("dateEnd")
    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    @JsonProperty("sessionStart")
    public Object getSessionStart() {
        return sessionStart;
    }

    @JsonProperty("sessionStart")
    public void setSessionStart(Object sessionStart) {
        this.sessionStart = sessionStart;
    }

    @JsonProperty("sessionEnd")
    public Object getSessionEnd() {
        return sessionEnd;
    }

    @JsonProperty("sessionEnd")
    public void setSessionEnd(Object sessionEnd) {
        this.sessionEnd = sessionEnd;
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
