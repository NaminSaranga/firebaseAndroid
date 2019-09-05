package com.sliit.firebasetuteapp.firebasetuteapp;

public class Student {
    private String name;
    private String id;
    private String address;
    private Integer cuNo;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getCuNo() {
        return cuNo;
    }

    public void setCuNo(Integer cuNo) {
        this.cuNo = cuNo;
    }
}
