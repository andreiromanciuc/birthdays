package org.fasttrackit.birthdays.transfer;

import javax.validation.constraints.NotNull;

public class CreateUser {

    @NotNull
    private String userEmail;
    @NotNull
    private String password;


    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "UserTransfer{" +
                "userEmail='" + userEmail + '\'' +
                '}';
    }
}
