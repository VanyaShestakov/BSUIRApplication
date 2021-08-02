package com.ivanshestakov.bsuirapplication.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "specialties")
public class Specialty {

    @Id
    @Column(name = "id")
    @JsonProperty("id")
    private int id;

    @Column(name = "name")
    @JsonProperty("name")
    private String name;

    @Column(name = "abbrev")
    @JsonProperty("abbrev")
    private String abbrev;

    @Column(name = "faculty_id")
    @JsonProperty("facultyId")
    private int facultyId;

    @Column(name = "code")
    @JsonProperty("code")
    private String code;

    public Specialty() {
    }

    public Specialty(int id, String name, String abbrev, int facultyId, String code) {
        this.id = id;
        this.name = name;
        this.abbrev = abbrev;
        this.facultyId = facultyId;
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbrev() {
        return abbrev;
    }

    public void setAbbrev(String abbrev) {
        this.abbrev = abbrev;
    }

    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
