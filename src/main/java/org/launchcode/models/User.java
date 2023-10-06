package org.launchcode.models;

public class User {

    private String username;
    private String email;
    private String password;
    private final String verifyPassword;


    public User(String username, String email, String password, String verifyPassword) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.verifyPassword = verifyPassword;
    }

    public String getVerifyPassword() {
        return verifyPassword;
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
    }

    @Override
    public String toString() {
        String newline =System.lineSeparator();
        return "User:" + newline +
                "username=: " + username + newline +
                "email: " + email  + newline;
    }
}
