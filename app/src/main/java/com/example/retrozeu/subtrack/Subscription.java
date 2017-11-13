package com.example.retrozeu.subtrack;

import java.util.Date;

public class Subscription {

    //instance variables
    private String name;
    private String desc;
    private String type;
    private Date dueDate;
    private double fee;

    //constructor
    public Subscription(String name, String desc, String type, Date dueDate, double fee) {
        this.name = name;
        this.desc = desc;
        this.type = type;
        this.dueDate = dueDate;
        this.fee = fee;
    }

    //getters and setters
    public String getName() {
        return name;
    }
    public String getDesc() {
        return desc;
    }
    public String getType() {
        return type;
    }
    public Date getDueDate() {
        return dueDate;
    }
    public double getFee() {
        return fee;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
    public void setFee(double fee) {
        this.fee = fee;
    }
}
