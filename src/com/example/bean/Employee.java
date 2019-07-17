package com.example.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee implements Serializable {
    private static final long serialVersionUID = 4513107453540343598L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "emp_id")
    private Long empId;
    @Column(name = "emp_name")
    private String empName;
    @Column(name = "emp_dept")
    private String empDept;
    @Column(name = "emp_salary")
    private String empSalary;
    @Column(name = "emp_email")
    private String empEmail;

    public Employee() {
	// TODO Auto-generated constructor stub
    }

    public Employee(String empName, String empDept, String empSalary, String empEmail) {
	this.empDept = empDept;
	this.empEmail = empEmail;
	this.empName = empName;
	this.empSalary = empSalary;
    }

    public Long getEmpId() {
	return empId;
    }

    public void setEmpId(Long empId) {
	this.empId = empId;
    }

    public String getEmpName() {
	return empName;
    }

    public void setEmpName(String empName) {
	this.empName = empName;
    }

    public String getEmpDept() {
	return empDept;
    }

    public void setEmpDept(String empDept) {
	this.empDept = empDept;
    }

    public String getEmpSalary() {
	return empSalary;
    }

    public void setEmpSalary(String empSalary) {
	this.empSalary = empSalary;
    }

    public String getEmpEmail() {
	return empEmail;
    }

    public void setEmpEmail(String empEmail) {
	this.empEmail = empEmail;
    }

}