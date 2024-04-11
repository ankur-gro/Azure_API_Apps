package com.otservices.authentication.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Restaurant extends BaseEntity{

    @Override
    public LocalDateTime getCreatedAt() {
        // TODO Auto-generated method stub
        return super.getCreatedAt();
    }

    @Override
    public String getCreatedBy() {
        // TODO Auto-generated method stub
        return super.getCreatedBy();
    }

    @Override
    public LocalDateTime getUpdatedAt() {
        // TODO Auto-generated method stub
        return super.getUpdatedAt();
    }

    @Override
    public String getUpdatedBy() {
        // TODO Auto-generated method stub
        return super.getUpdatedBy();
    }

    @Override
    public void setCreatedAt(LocalDateTime createdAt) {
        // TODO Auto-generated method stub
        super.setCreatedAt(createdAt);
    }

    @Override
    public void setCreatedBy(String createdBy) {
        // TODO Auto-generated method stub
        super.setCreatedBy(createdBy);
    }

    @Override
    public void setUpdatedAt(LocalDateTime updatedAt) {
        // TODO Auto-generated method stub
        super.setUpdatedAt(updatedAt);
    }

    @Override
    public void setUpdatedBy(String updatedBy) {
        // TODO Auto-generated method stub
        super.setUpdatedBy(updatedBy);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rest_id")
    private Long restId;

    public Restaurant() {
    }

    private String name;

    private String email;

    public Restaurant(Long restId, String name, String email, String mobileNumber) {
        this.restId = restId;
        this.name = name;
        this.email = email;
        this.mobileNumber = mobileNumber;
    }

    public Long getRestId() {
        return restId;
    }

    public void setRestId(Long restId) {
        this.restId = restId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Column(name="mobile_number")
    private String mobileNumber;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
