package com.ivanshestakov.bsuirapplication.BSUIRAPIEntity;

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
        "firstName",
        "lastName",
        "middleName",
        "degree",
        "rank",
        "photoLink",
        "calendarId",
        "academicDepartment",
        "id",
        "urlId",
        "fio"
})
@Generated("jsonschema2pojo")
public class Employee {

    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("middleName")
    private String middleName;
    @JsonProperty("degree")
    private String degree;
    @JsonProperty("rank")
    private String rank;
    @JsonProperty("photoLink")
    private String photoLink;
    @JsonProperty("calendarId")
    private String calendarId;
    @JsonProperty("academicDepartment")
    private List<String> academicDepartment = null;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("urlId")
    private String urlId;
    @JsonProperty("fio")
    private String fio;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("middleName")
    public String getMiddleName() {
        return middleName;
    }

    @JsonProperty("middleName")
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @JsonProperty("degree")
    public String getDegree() {
        return degree;
    }

    @JsonProperty("degree")
    public void setDegree(String degree) {
        this.degree = degree;
    }

    @JsonProperty("rank")
    public String getRank() {
        return rank;
    }

    @JsonProperty("rank")
    public void setRank(String rank) {
        this.rank = rank;
    }

    @JsonProperty("photoLink")
    public String getPhotoLink() {
        return photoLink;
    }

    @JsonProperty("photoLink")
    public void setPhotoLink(String photoLink) {
        this.photoLink = photoLink;
    }

    @JsonProperty("calendarId")
    public String getCalendarId() {
        return calendarId;
    }

    @JsonProperty("calendarId")
    public void setCalendarId(String calendarId) {
        this.calendarId = calendarId;
    }

    @JsonProperty("academicDepartment")
    public List<String> getAcademicDepartment() {
        return academicDepartment;
    }

    @JsonProperty("academicDepartment")
    public void setAcademicDepartment(List<String> academicDepartment) {
        this.academicDepartment = academicDepartment;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("urlId")
    public String getUrlId() {
        return urlId;
    }

    @JsonProperty("urlId")
    public void setUrlId(String urlId) {
        this.urlId = urlId;
    }

    @JsonProperty("fio")
    public String getFio() {
        return fio;
    }

    @JsonProperty("fio")
    public void setFio(String fio) {
        this.fio = fio;
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