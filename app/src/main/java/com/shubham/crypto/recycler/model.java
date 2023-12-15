package com.shubham.crypto.recycler;

import android.graphics.drawable.Drawable;

public class model {
    String name;
    String symbol;
    String price;
    String date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public model(String name, String symbol, String price, Drawable logo, String date) {
        this.name = name;
        this.symbol = symbol;
        this.price = price;
        this.date = date;
    }
}
