package com.bdlz.AB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    static class ContactDetails {
        private List<PersonDetails> contacts;

        public ContactDetails(List<PersonDetails> contacts) {
            this.contacts=contacts;
        }
        public List<PersonDetails> getContacts(){
            return contacts;
        }
        public void setContacts(List<PersonDetails> contacts) {
            this.contacts = contacts;
        }
    }
    public static void contactDisplay(ContactDetails contactDetails) {
        List<PersonDetails> contactDetailsList = contactDetails.getContacts();
        for (int i = 0; i < contactDetailsList.size(); i++){
            PersonDetails person1 = contactDetailsList.get(i);
            System.out.println("Person Details : ");
            System.out.println("Name : " + person1.getFirstName() + " " + person1.getLastName());
            System.out.println("Mobile No : " + person1.getMobileNo());
            System.out.println("EmailId : " + person1.getEmailId());
            System.out.println("Address");
            System.out.println("Area : " + person1.getArea());
            System.out.println("City : " + person1.getCity());
            System.out.println("State : " + person1.getState());
            System.out.println("ZipCode : " + person1.getZipCode());
        }
    }

    public static void main(String[] args) {
        Scanner newData = new Scanner(System.in);
        System.out.println("Enter Details in AddressBook");
        System.out.println("Enter Your FirstName");
        String firstName = newData.next();
        System.out.println("Enter your LastName");
        String lastName = newData.next();
        System.out.println("Enter Your Area");
        String area = newData.next();
        System.out.println("Enter your City");
        String city = newData.next();
        System.out.println("Enter Your State");
        String state = newData.next();
        System.out.println("Enter Your ZipCode");
        int zipCode = newData.nextInt();
        System.out.println("Enter Your MobileNo");
        long mobileNo = newData.nextLong();
        System.out.println("Enter Your EmailId");
        String emailId = newData.next();
        List<PersonDetails> contactList = new ArrayList<>();
        PersonDetails contact = new PersonDetails(firstName, lastName, area, city, state, zipCode, mobileNo, emailId);
        ContactDetails contactDetails = new ContactDetails(contactList);
        contactList.add(contact);
        contactDisplay(contactDetails);
    }

}
