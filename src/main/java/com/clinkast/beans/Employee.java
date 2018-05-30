package com.clinkast.beans;

import java.util.Date;

public class Employee {
    private Long id;
    private String firstName;
    private String lastName;
    private String adresse;
    private Date dateDeNaissance;

    public Employee() {
        super();
    }

    public Employee(Long id, String firstName, String lastName, String adresse, Date dateDeNaissance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.adresse = adresse;
        this.dateDeNaissance = dateDeNaissance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Date getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(Date dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }
}
