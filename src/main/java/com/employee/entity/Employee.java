package com.employee.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "employee_name", nullable = false)
    private String employeeName;

    @Column(name = "email_id", nullable = false)
    private String emailId;

    @Column(name = "phone", nullable = false, length = 10)
    private String phone;

    @Column(name = "date_of_join", nullable = false)
    private LocalDateTime dateOfJoin;

    public LocalDateTime getDateOfJoin() {
        return dateOfJoin;
    }

    public void setDateOfJoin(LocalDateTime dateOfJoin) {
        this.dateOfJoin = dateOfJoin;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}