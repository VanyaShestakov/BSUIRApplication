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
        "weekNumber",
        "studentGroup",
        "studentGroupInformation",
        "numSubgroup",
        "auditory",
        "lessonTime",
        "startLessonTime",
        "endLessonTime",
        "gradebookLesson",
        "subject",
        "note",
        "lessonType",
        "employee",
        "studentGroupModelList",
        "zaoch",
        "gradebookLessonlist"
})
@Generated("jsonschema2pojo")
public class Schedule {

    @JsonProperty("weekNumber")
    private List<Integer> weekNumber = null;
    @JsonProperty("studentGroup")
    private List<String> studentGroup = null;
    @JsonProperty("studentGroupInformation")
    private List<String> studentGroupInformation = null;
    @JsonProperty("numSubgroup")
    private Integer numSubgroup;
    @JsonProperty("auditory")
    private List<String> auditory = null;
    @JsonProperty("lessonTime")
    private String lessonTime;
    @JsonProperty("startLessonTime")
    private String startLessonTime;
    @JsonProperty("endLessonTime")
    private String endLessonTime;
    @JsonProperty("gradebookLesson")
    private Object gradebookLesson;
    @JsonProperty("subject")
    private String subject;
    @JsonProperty("note")
    private Object note;
    @JsonProperty("lessonType")
    private String lessonType;
    @JsonProperty("employee")
    private List<Employee> employee = null;
    @JsonProperty("studentGroupModelList")
    private Object studentGroupModelList;
    @JsonProperty("zaoch")
    private Boolean zaoch;
    @JsonProperty("gradebookLessonlist")
    private Object gradebookLessonlist;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("weekNumber")
    public List<Integer> getWeekNumber() {
        return weekNumber;
    }

    @JsonProperty("weekNumber")
    public void setWeekNumber(List<Integer> weekNumber) {
        this.weekNumber = weekNumber;
    }

    @JsonProperty("studentGroup")
    public List<String> getStudentGroup() {
        return studentGroup;
    }

    @JsonProperty("studentGroup")
    public void setStudentGroup(List<String> studentGroup) {
        this.studentGroup = studentGroup;
    }

    @JsonProperty("studentGroupInformation")
    public List<String> getStudentGroupInformation() {
        return studentGroupInformation;
    }

    @JsonProperty("studentGroupInformation")
    public void setStudentGroupInformation(List<String> studentGroupInformation) {
        this.studentGroupInformation = studentGroupInformation;
    }

    @JsonProperty("numSubgroup")
    public Integer getNumSubgroup() {
        return numSubgroup;
    }

    @JsonProperty("numSubgroup")
    public void setNumSubgroup(Integer numSubgroup) {
        this.numSubgroup = numSubgroup;
    }

    @JsonProperty("auditory")
    public List<String> getAuditory() {
        return auditory;
    }

    @JsonProperty("auditory")
    public void setAuditory(List<String> auditory) {
        this.auditory = auditory;
    }

    @JsonProperty("lessonTime")
    public String getLessonTime() {
        return lessonTime;
    }

    @JsonProperty("lessonTime")
    public void setLessonTime(String lessonTime) {
        this.lessonTime = lessonTime;
    }

    @JsonProperty("startLessonTime")
    public String getStartLessonTime() {
        return startLessonTime;
    }

    @JsonProperty("startLessonTime")
    public void setStartLessonTime(String startLessonTime) {
        this.startLessonTime = startLessonTime;
    }

    @JsonProperty("endLessonTime")
    public String getEndLessonTime() {
        return endLessonTime;
    }

    @JsonProperty("endLessonTime")
    public void setEndLessonTime(String endLessonTime) {
        this.endLessonTime = endLessonTime;
    }

    @JsonProperty("gradebookLesson")
    public Object getGradebookLesson() {
        return gradebookLesson;
    }

    @JsonProperty("gradebookLesson")
    public void setGradebookLesson(Object gradebookLesson) {
        this.gradebookLesson = gradebookLesson;
    }

    @JsonProperty("subject")
    public String getSubject() {
        return subject;
    }

    @JsonProperty("subject")
    public void setSubject(String subject) {
        this.subject = subject;
    }

    @JsonProperty("note")
    public Object getNote() {
        return note;
    }

    @JsonProperty("note")
    public void setNote(Object note) {
        this.note = note;
    }

    @JsonProperty("lessonType")
    public String getLessonType() {
        return lessonType;
    }

    @JsonProperty("lessonType")
    public void setLessonType(String lessonType) {
        this.lessonType = lessonType;
    }

    @JsonProperty("employee")
    public List<Employee> getEmployee() {
        return employee;
    }

    @JsonProperty("employee")
    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }

    @JsonProperty("studentGroupModelList")
    public Object getStudentGroupModelList() {
        return studentGroupModelList;
    }

    @JsonProperty("studentGroupModelList")
    public void setStudentGroupModelList(Object studentGroupModelList) {
        this.studentGroupModelList = studentGroupModelList;
    }

    @JsonProperty("zaoch")
    public Boolean getZaoch() {
        return zaoch;
    }

    @JsonProperty("zaoch")
    public void setZaoch(Boolean zaoch) {
        this.zaoch = zaoch;
    }

    @JsonProperty("gradebookLessonlist")
    public Object getGradebookLessonlist() {
        return gradebookLessonlist;
    }

    @JsonProperty("gradebookLessonlist")
    public void setGradebookLessonlist(Object gradebookLessonlist) {
        this.gradebookLessonlist = gradebookLessonlist;
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
