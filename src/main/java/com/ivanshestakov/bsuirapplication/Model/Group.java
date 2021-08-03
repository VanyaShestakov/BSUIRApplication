package com.ivanshestakov.bsuirapplication.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "student_groups", schema = "bsuir_application_db")
public class Group {

    @Id
    @Column(name = "id")
    @JsonProperty("id")
    private int id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "faculty_id")
    private Faculty faculty;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "specialty_id")
    private Specialty specialty;

    @Transient
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

    @Transient
    @JsonProperty("specialityDepartmentEducationFormId")
    private int specialtyId;

    public Group() {
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }

    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public int getSpecialtyId() {
        return specialtyId;
    }

    public void setSpecialtyId(int specialtyId) {
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

}
