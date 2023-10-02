package com.example.springtask.entity;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "DRUGS", schema = "HR", catalog = "")
public class DrugsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "DRUGID", nullable = false, precision = 0)
    private BigInteger drugid;
    @Basic
    @Column(name = "DRUGNAME", nullable = true, length = 100)
    private String drugname;
    @Basic
    @Column(name = "MANUFACTURER", nullable = true, length = 100)
    private String manufacturer;

    public BigInteger getDrugid() {
        return drugid;
    }

    public void setDrugid(BigInteger drugid) {
        this.drugid = drugid;
    }

    public String getDrugname() {
        return drugname;
    }

    public void setDrugname(String drugname) {
        this.drugname = drugname;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DrugsEntity that = (DrugsEntity) o;

        if (drugid != null ? !drugid.equals(that.drugid) : that.drugid != null) return false;
        if (drugname != null ? !drugname.equals(that.drugname) : that.drugname != null) return false;
        if (manufacturer != null ? !manufacturer.equals(that.manufacturer) : that.manufacturer != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = drugid != null ? drugid.hashCode() : 0;
        result = 31 * result + (drugname != null ? drugname.hashCode() : 0);
        result = 31 * result + (manufacturer != null ? manufacturer.hashCode() : 0);
        return result;
    }
}
