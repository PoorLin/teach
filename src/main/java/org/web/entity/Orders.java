package org.web.entity;

import jakarta.persistence.*;

import java.util.Date;
@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer orderId;

    private Integer price;

    private Date createDate;


    @ManyToOne
    @JoinColumn(name = "userId",insertable = true)
    private Users users;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }



    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }


    @Override
    public String toString() {
        return "Orders{" +
                "createDate=" + createDate +
                ", price=" + price +
                ", orderId=" + orderId +
                '}';
    }
}
