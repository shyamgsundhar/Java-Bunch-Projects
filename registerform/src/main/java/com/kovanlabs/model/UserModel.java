package com.kovanlabs.model;

public class UserModel {
    private int id;
    private String name;
    private String emailid;
    UserModel(int id, String name, String emailid, String password){
        this.id=id;
        this.name=name;
        this.emailid=emailid;
    }

    public int getId() {
        return id;
    }

    public String getEmailid() {
        return emailid;
    }

    public String getName() {
        return name;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
