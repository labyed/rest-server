package com.clinkast.beans;

import java.util.Date;

public class EmployeeDetails {
    private String firstName;
    private String lastName;
    private String entity;
    private String mail;
    private String phone;
    private String location;
    private Date birthDate;

    public EmployeeDetails() {
        super();
    }

    public EmployeeDetails(String firstName, String lastName, String entity, String mail, String phone, String location, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.entity = entity;
        this.mail = mail;
        this.phone = phone;
        this.location = location;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
