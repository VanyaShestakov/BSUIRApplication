package com.ivanshestakov.bsuirapplication.BSUIRAPIEntity;

import java.util.HashMap;
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
        "name",
        "facultyId",
        "facultyName",
        "specialityDepartmentEducationFormId",
        "specialityName",
        "course",
        "id",
        "calendarId"
})
@Generated("jsonschema2pojo")
public class StudentGroup {

    @JsonProperty("name")
    private String name;
    @JsonProperty("facultyId")
    private Integer facultyId;
    @JsonProperty("facultyName")
    private Object facultyName;
    @JsonProperty("specialityDepartmentEducationFormId")
    private Integer specialityDepartmentEducationFormId;
    @JsonProperty("specialityName")
    private Object specialityName;
    @JsonProperty("course")
    private Integer course;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("calendarId")
    private String calendarId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("facultyId")
    public Integer getFacultyId() {
        return facultyId;
    }

    @JsonProperty("facultyId")
    public void setFacultyId(Integer facultyId) {
        this.facultyId = facultyId;
    }

    @JsonProperty("facultyName")
    public Object getFacultyName() {
        return facultyName;
    }

    @JsonProperty("facultyName")
    public void setFacultyName(Object facultyName) {
        this.facultyName = facultyName;
    }

    @JsonProperty("specialityDepartmentEducationFormId")
    public Integer getSpecialityDepartmentEducationFormId() {
        return specialityDepartmentEducationFormId;
    }

    @JsonProperty("specialityDepartmentEducationFormId")
    public void setSpecialityDepartmentEducationFormId(Integer specialityDepartmentEducationFormId) {
        this.specialityDepartmentEducationFormId = specialityDepartmentEducationFormId;
    }

    @JsonProperty("specialityName")
    public Object getSpecialityName() {
        return specialityName;
    }

    @JsonProperty("specialityName")
    public void setSpecialityName(Object specialityName) {
        this.specialityName = specialityName;
    }

    @JsonProperty("course")
    public Integer getCourse() {
        return course;
    }

    @JsonProperty("course")
    public void setCourse(Integer course) {
        this.course = course;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("calendarId")
    public String getCalendarId() {
        return calendarId;
    }

    @JsonProperty("calendarId")
    public void setCalendarId(String calendarId) {
        this.calendarId = calendarId;
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
