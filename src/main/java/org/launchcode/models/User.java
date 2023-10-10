package org.launchcode.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.Objects;

public class User {
    @NotBlank(message = "Username is required!")
    @Size(min=5, max=15, message = "Username must be 5-15 characters in length.")
    private String username;
    @Email(message = "Email format is mandatory!")
    private String email;
    @NotBlank(message = "Password is required!")
    @Size(min=6, message = "Password must be at least 6 characters in length!")
    private String password;

//    @NotBlank(message = "Verify password field is required!")
    @NotNull(message = "Passwords do not match!!")
    private String verifyPassword;

    //private String verify?
    public User() {

    }

    public User(String username, String email, String password, String verifyPassword) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
        this.verifyPassword = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        checkPassword(password, verifyPassword);
    }

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
        checkPassword(password, verifyPassword);
    }

    private void checkPassword(String password, String verifyPassword) {
        if (!password.equals(verifyPassword) && password!=null && verifyPassword!=null) {
            setVerifyPassword(null);
        }
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        User user = (User) o;
//        return Objects.equals(password, user.password) && Objects.equals(verifyPassword, user.verifyPassword);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(password, verifyPassword);
//    }
}

