package com.ivanshestakov.bsuirapplication.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "selected_groups")
public class SelectedGroup {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "group_number")
    private String groupNumber;

    public SelectedGroup() {
    }

    public SelectedGroup(int id, String groupNumber) {
        this.id = id;
        this.groupNumber = groupNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }
}
