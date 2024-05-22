package org.web.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;

    private String mail ;

    private String secret;

    @OneToMany(mappedBy = "users",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Orders> ordersArrayList;


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


    public List<Orders> getOrdersArrayList() {
        return ordersArrayList;
    }

    public void setOrdersArrayList(List<Orders> ordersArrayList) {
        this.ordersArrayList = ordersArrayList;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", mail='" + mail + '\'' +
                ", secret='" + secret + '\'' +
                ", ordersArrayList=" + ordersArrayList +
                '}';
    }
}
