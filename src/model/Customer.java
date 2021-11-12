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

    public Customer(String firstName, String lastName, String phoneNumber, String email){
        // I found this on https://www.oreilly.com/library/view/regular-expressions-cookbook/9781449327453/ch04s02.html
        String phoneRegex = "^(?:\\+?1[-.●]?)?\\(?([0-9]{3})\\)?[-.●]?([0-9]{3})[-.●]?([0-9]{4})$";
        Pattern phonePattern = Pattern.compile(phoneRegex);
        Pattern pattern = Pattern.compile("^(.+)@(.+)$",Pattern.CASE_INSENSITIVE);


        this.firstName = firstName;
        this.lastName = lastName;
        if(phonePattern.matcher(phoneNumber).matches()) {
            this.phoneNumber = phoneNumber;
        }
        else {
            throw new IllegalArgumentException("Error Invalid Phone Number");
        }

        if(pattern.matcher(email).matches()) {
            this.email = email;
        }
        else {
            throw new IllegalArgumentException("Error Invalid email");
        }
        this.dateCheckin = null ;
        this.dateCheckout = null;
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
        String phoneRegex = "^(?:\\+?1[-.●]?)?\\(?([0-9]{3})\\)?[-.●]?([0-9]{3})[-.●]?([0-9]{4})$";
        Pattern phonePattern = Pattern.compile(phoneRegex);
        if(phonePattern.matcher(phoneNumber).matches()) {
            this.phoneNumber = phoneNumber;
        }
        else {
            throw new IllegalArgumentException("Error Invalid Phone Number");
        }

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        Pattern pattern = Pattern.compile("^(.+)@(.+)$",Pattern.CASE_INSENSITIVE);
        if(pattern.matcher(email).matches()) {
            this.email = email;
        }
        else {
            throw new IllegalArgumentException("Error Invalid email");
        }
      
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
