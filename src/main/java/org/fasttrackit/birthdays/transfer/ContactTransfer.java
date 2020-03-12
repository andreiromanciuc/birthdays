package org.fasttrackit.birthdays.transfer;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class ContactTransfer {
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private Date date;
    @NotNull
    private Integer phone;
    private String email;
    private String facebookAccount;

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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFacebookAccount() {
        return facebookAccount;
    }

    public void setFacebookAccount(String facebookAccount) {
        this.facebookAccount = facebookAccount;
    }

    @Override
    public String toString() {
        return "ContactsTransfer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", date=" + date +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", facebookAccount='" + facebookAccount + '\'' +
                '}';
    }
}
