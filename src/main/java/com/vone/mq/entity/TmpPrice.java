package com.vone.mq.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TmpPrice {
    @Id
    private String price;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
