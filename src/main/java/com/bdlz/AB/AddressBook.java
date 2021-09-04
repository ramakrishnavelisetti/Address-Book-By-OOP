package com.bdlz.AB;

import java.io.Console;

public class AddressBook {
    static class PersonDetails {
        private String firstName;
        private String lastName;
        private String area;
        private String city;
        private String state;
        private int zipCode;
        private long mobileNo;
        private String emailId;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book Program");

        PersonDetails data = new PersonDetails();

        data.firstName = ("Ramakrishna");
        data.lastName = ("Velisetti");
        data.area = ("Sitaramapuram-A");
        data.city = ("Vijayawada");
        data.state = ("Andhra Pradesh");
        data.zipCode = (521109);
        data.mobileNo = (8500029054L);
        data.emailId = ("ramakrishna31.velisetti@gmail.com");

        System.out.println("Personal Details:- ");
        System.out.println("Name" + " : " + data.firstName +" " + data.lastName);
        System.out.println("Email.Id" + " : " + data.emailId);
        System.out.println("MobileNo" + " : " + data.mobileNo);

        System.out.println("Address:- ");
        System.out.println("Area" + " : " + data.area);
        System.out.println("City" + " : " + data.city);
        System.out.println("State" + " : " + data.state);
        System.out.println("ZipCode" + " : " + data.zipCode);
    }
}
