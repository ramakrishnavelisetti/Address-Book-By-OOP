package com.bdlz.AB;

public class AddressBook {
   static class PersonDetails {
        private String FirstName;
        private String LastName;
        private String Area;
        private String City;
        private String State;
        private int ZipCode;
        private long MobileNo;
        private String Email;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book Program");

        PersonDetails data = new PersonDetails();

        data.FirstName = ("Ramakrishna");
        data.LastName = ("Velisetti");
        data.Area = ("Sitaramapuram-A");
        data.City = ("Vijayawada");
        data.State = ("Andhra Pradesh");
        data.ZipCode = (521109);
        data.MobileNo = (8500029054L);
        data.Email = ("ramakrishna31.velisetti@gmail.com");

        System.out.println("Personal Details:- ");
        System.out.println("Name" + " : " + data.FirstName +" " + data.LastName);
        System.out.println("Email.Id" + " : " + data.Email);
        System.out.println("MobileNo" + " : " + data.MobileNo);

        System.out.println("Address:- ");
        System.out.println("Area" + " : " + data.Area);
        System.out.println("City" + " : " + data.City);
        System.out.println("State" + " : " + data.State);
        System.out.println("ZipCode" + " : " + data.ZipCode);
    }
}
