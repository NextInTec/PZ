package com.unibague.pazyregion.Model;

public class User {

    private String email;
    private String password;
    private String name;
    private String phone;
    private String userType;

    private User(){}

    public User(String email, String password, String name, String phone, String userType) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.phone = phone;
        this.userType = userType;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
