package com.bdlz.AB;

public class PersonDetails {
    private String firstName;
    private String lastName;
    private String area;
    private String city;
    private String state;
    private int zipCode;
    private long mobileNo;
    private String emailId;

    public PersonDetails (String firstName, String lastName, String area, String city, String state, int zipCode, long mobileNo, String emailId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.area = area;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.mobileNo = mobileNo;
        this.emailId = emailId;
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
