package model;

import java.util.Calendar;
import java.util.regex.Pattern;

public class Customer {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private Calendar dateCheckin;
    private Calendar dateCheckout;

    public Customer(String firstName, String phoneNumber, String email, Calendar dateCheckin,Calendar dateCheckout){
        Pattern pattern = Pattern.compile("^(.+)@(.+)$",Pattern.CASE_INSENSITIVE);

        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
        this.email = (pattern.matcher(email).matches()) ? email : throw new IllegalArgumentException("Error Invalid email");
        this.dateCheckin = dateCheckin;
        this.dateCheckout = dateCheckout;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Calendar getDateCheckin() {
        return dateCheckin;
    }

    public void setDateCheckin(Calendar dateCheckin) {
        this.dateCheckin = dateCheckin;
    }

    public Calendar getDateCheckout() {
        return dateCheckout;
    }

    public void setDateCheckout(Calendar dateCheckout) {
        this.dateCheckout = dateCheckout;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", dateCheckin=" + dateCheckin +
                ", dateCheckout=" + dateCheckout +
                '}';
    }
}
