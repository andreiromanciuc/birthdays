package org.fasttrackit.birthdays.transfer;

import javax.validation.constraints.NotNull;

public class UserTransfer {

    @NotNull
    private String userEmail;
    @NotNull
    private String password;
    @NotNull
    private String repeatPassword;

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

    public String getRepeatPassword() {
        return repeatPassword;
    }

    public void setRepeatPassword(String repeatPassword) {
        this.repeatPassword = repeatPassword;
    }

    @Override
    public String toString() {
        return "UserTransfer{" +
                "userEmail='" + userEmail + '\'' +
                '}';
    }
}
