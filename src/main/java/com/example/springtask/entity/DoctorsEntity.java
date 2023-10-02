package com.example.springtask.entity;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "DOCTORS", schema = "HR", catalog = "")
public class DoctorsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "DOCTORID", nullable = false, precision = 0)
    private BigInteger doctorid;
    @Basic
    @Column(name = "FIRSTNAME", nullable = true, length = 73)
    private String firstname;
    @Basic
    @Column(name = "LASTNAME", nullable = true, length = 83)
    private String lastname;
    @Basic
    @Column(name = "SPECIALTY", nullable = true, length = 108)
    private String specialty;

    public BigInteger getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(BigInteger doctorid) {
        this.doctorid = doctorid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DoctorsEntity that = (DoctorsEntity) o;

        if (doctorid != null ? !doctorid.equals(that.doctorid) : that.doctorid != null) return false;
        if (firstname != null ? !firstname.equals(that.firstname) : that.firstname != null) return false;
        if (lastname != null ? !lastname.equals(that.lastname) : that.lastname != null) return false;
        if (specialty != null ? !specialty.equals(that.specialty) : that.specialty != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = doctorid != null ? doctorid.hashCode() : 0;
        result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (specialty != null ? specialty.hashCode() : 0);
        return result;
    }
}
