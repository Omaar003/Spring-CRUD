package com.example.springtask.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "EMPLOYEES", schema = "HR", catalog = "")
public class EmployeesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "EMPLOYEE_ID", nullable = false, precision = 0)
    private int employeeId;
    @Basic
    @Column(name = "FIRST_NAME", nullable = true, length = 20)
    private String firstName;
    @Basic
    @Column(name = "LAST_NAME", nullable = false, length = 25)
    private String lastName;
    @Basic
    @Column(name = "EMAIL", nullable = false, length = 25)
    private String email;
    @Basic
    @Column(name = "PHONE_NUMBER", nullable = true, length = 20)
    private String phoneNumber;
    @Basic
    @Column(name = "HIRE_DATE", nullable = false)
    private Date hireDate;
    @Basic
    @Column(name = "JOB_ID", nullable = false, length = 10)
    private String jobId;
    @Basic
    @Column(name = "SALARY", nullable = true, precision = 2)
    private Integer salary;
    @Basic
    @Column(name = "COMMISSION_PCT", nullable = true, precision = 2)
    private Byte commissionPct;
    @Basic
    @Column(name = "MANAGER_ID", nullable = true, precision = 0)
    private Integer managerId;
    @Basic
    @Column(name = "DEPARTMENT_ID", nullable = true, precision = 0)
    private Short departmentId;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Byte getCommissionPct() {
        return commissionPct;
    }

    public void setCommissionPct(Byte commissionPct) {
        this.commissionPct = commissionPct;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Short getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Short departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeesEntity that = (EmployeesEntity) o;
        return employeeId == that.employeeId && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(email, that.email) && Objects.equals(phoneNumber, that.phoneNumber) && Objects.equals(hireDate, that.hireDate) && Objects.equals(jobId, that.jobId) && Objects.equals(salary, that.salary) && Objects.equals(commissionPct, that.commissionPct) && Objects.equals(managerId, that.managerId) && Objects.equals(departmentId, that.departmentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, firstName, lastName, email, phoneNumber, hireDate, jobId, salary, commissionPct, managerId, departmentId);
    }
}
