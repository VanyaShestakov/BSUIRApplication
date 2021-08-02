package com.ivanshestakov.bsuirapplication.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "faculties")
public class Faculty {

    @Id
    @Column(name = "id")
    @JsonProperty("id")
    private int id;

    @Column(name = "abbrev")
    @JsonProperty("abbrev")
    private String abbrev;

    @Column(name = "name")
    @JsonProperty("name")
    private String name;

    public Faculty() {
    }

    public Faculty(int id, String abbrev, String name) {
        this.id = id;
        this.abbrev = abbrev;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAbbrev() {
        return abbrev;
    }

    public void setAbbrev(String abbrev) {
        this.abbrev = abbrev;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
