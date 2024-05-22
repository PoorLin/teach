package org.web.entity;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;

    private String mail ;

    private String secret;

    @OneToMany(mappedBy = "users")
    private ArrayList<Orders> ordersArrayList;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public ArrayList<Orders> getOrdersArrayList() {
        return ordersArrayList;
    }

    public void setOrdersArrayList(ArrayList<Orders> ordersArrayList) {
        this.ordersArrayList = ordersArrayList;
    }
}
