package com.company;

public class Goodie {
    private int code;
    private int price;
    private int amount;
    private String name;

    public int calculatePrice() {
        int result = 0;

        result = price * amount;

        return result;
    }

    public int getCode() {
        return this.code;
    }

    public int getAmount() {
        return this.amount;
    }

    public int getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }
}
