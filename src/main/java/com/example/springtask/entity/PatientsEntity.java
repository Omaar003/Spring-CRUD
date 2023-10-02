package com.example.springtask.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;

@Entity
@Table(name = "PATIENTS", schema = "HR", catalog = "")
public class PatientsEntity {
 //   @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "PATIENTID", nullable = false, precision = 0)
    private BigInteger patientid;
    @Basic
    @Column(name = "FIRSTNAME", nullable = true, length = 50)
    private String firstname;
    @Basic
    @Column(name = "LASTNAME", nullable = true, length = 50)
    private String lastname;
    @Basic
    @Column(name = "DATEOFBIRTH", nullable = true)
    private Date dateofbirth;
    @Basic
    @Column(name = "GENDER", nullable = true, length = 10)
    private String gender;
    @Basic
    @Column(name = "DOCTORID", nullable = true, precision = 0)
    private BigInteger doctorid;

    public BigInteger getPatientid() {
        return patientid;
    }

    public void setPatientid(BigInteger patientid) {
        this.patientid = patientid;
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

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public BigInteger getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(BigInteger doctorid) {
        this.doctorid = doctorid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PatientsEntity that = (PatientsEntity) o;

        if (patientid != null ? !patientid.equals(that.patientid) : that.patientid != null) return false;
        if (firstname != null ? !firstname.equals(that.firstname) : that.firstname != null) return false;
        if (lastname != null ? !lastname.equals(that.lastname) : that.lastname != null) return false;
        if (dateofbirth != null ? !dateofbirth.equals(that.dateofbirth) : that.dateofbirth != null) return false;
        if (gender != null ? !gender.equals(that.gender) : that.gender != null) return false;
        if (doctorid != null ? !doctorid.equals(that.doctorid) : that.doctorid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = patientid != null ? patientid.hashCode() : 0;
        result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (dateofbirth != null ? dateofbirth.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (doctorid != null ? doctorid.hashCode() : 0);
        return result;
    }
}
