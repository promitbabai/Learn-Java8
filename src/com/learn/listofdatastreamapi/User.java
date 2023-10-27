package com.learn.listofdatastreamapi;

public class User {

    private int id;
    private String  Name;
    private String  email;
    private String city;
    private String  password;



    public User(int id, String name, String email, String mobile, String password) {
        this.id = id;
        Name = name;
        this.email = email;
        this.city = mobile;
        this.password = password;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}



