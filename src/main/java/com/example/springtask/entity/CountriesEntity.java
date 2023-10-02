package com.example.springtask.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Objects;

@Entity
@Table(name = "COUNTRIES", schema = "HR", catalog = "")
public class CountriesEntity {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "COUNTRY_ID", nullable = false, length = 2)
    private int countryId;
    @Basic
    @Column(name = "COUNTRY_NAME", nullable = true, length = 40)
    private String countryName;
    @Basic
    @Column(name = "REGION_ID", nullable = true, precision = 0)
    private BigInteger regionId;

    public int getCountryId() {
        return countryId;
    }


    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public BigInteger getRegionId() {
        return regionId;
    }

    public void setRegionId(BigInteger regionId) {
        this.regionId = regionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountriesEntity that = (CountriesEntity) o;
        return Objects.equals(countryId, that.countryId) && Objects.equals(countryName, that.countryName) && Objects.equals(regionId, that.regionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryId, countryName, regionId);
    }
}
