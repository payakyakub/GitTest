package com.java.gittest;

public class Order {
    private String userName;
    private double amount;
    private String productName;

    public Order(String userName, double amount, String productName) {
        this.userName = userName;
        this.amount = amount;
        this.productName = productName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
