package com.lokesh.restapp.employee;


import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Document("employee")
public class Employee {
    @Id
    private int eid;
    private String ename;
    private String Designation;

    public Employee() {}

    public Employee(int eid, String ename, String Designation) {
        this.eid = eid;
        this.ename = ename;
        this.Designation = Designation;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }
}
