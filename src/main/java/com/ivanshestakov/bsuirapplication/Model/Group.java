package com.ivanshestakov.bsuirapplication.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "student_group", schema = "bsuir_application_db")
public class Group {

    @Id
    @Column(name = "id")
    @JsonProperty("id")
    private int id;

    @Column(name = "faculty_id")
    @JsonProperty("facultyId")
    private int facultyId;

    @Column(name = "faculty_name")
    @JsonProperty("facultyName")
    private String facultyName;

    @Column(name = "specialty_name")
    @JsonProperty("specialtyName")
    private String specialtyName;

    @Column(name = "course")
    @JsonProperty("course")
    private int course;

    @Column(name = "group_number")
    @JsonProperty("name")
    private String groupNumber;

    @Column(name = "specialty_id")
    @JsonProperty("specialityDepartmentEducationFormId")
    private int specialtyId;

    public Group() {
    }

    public Group(int id, int facultyId, String specialtyName, int course, String name, String facultyName, int specialtyId) {
        this.id = id;
        this.facultyId = facultyId;
        this.specialtyName = specialtyName;
        this.course = course;
        this.groupNumber = name;
        this.facultyName = facultyName;
        this.specialtyId = specialtyId;
    }

    public int getSpecialitId() {
        return specialtyId;
    }

    public void setSpecialitId(int specialtyId) {
        this.specialtyId = specialtyId;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    public String getSpecialtyName() {
        return specialtyName;
    }

    public void setSpecialtyName(String specialtyName) {
        this.specialtyName = specialtyName;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", facultyId=" + facultyId +
                ", specialtyName='" + specialtyName + '\'' +
                ", course=" + course +
                ", groupNumber='" + groupNumber + '\'' +
                '}';
    }
}
