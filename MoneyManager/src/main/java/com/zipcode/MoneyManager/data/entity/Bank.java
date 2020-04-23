package com.zipcode.MoneyManager.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BANK")
public class Bank {

    /*CUSTOMER BANK
    BANK_ID INT PRIMARY KEY AUTO_INCREMENT,
    BRANCH_NAME VARCHAR(64),
    ADDRESS VARCHAR(100),
    STATE VARCHAR(32),
    COUNTRY VARCHAR(32),
    PHONE_NUMBER VARCHAR(24)
    */

    @Id
    @Column(name="BANK_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bankId;
    @Column(name="BRANCH_NAME")
    private String branchName;
    @Column(name="ADDRESS")
    private String address;
    @Column(name="STATE")
    private String state;
    @Column(name="COUNTRY")
    private String country;
    @Column(name="PHONE_NUMBER")
    private String phoneNumber;

    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}


