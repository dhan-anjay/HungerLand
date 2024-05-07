package com.example.hungerland.model;

public class Information {
    private String outletName;
    private String foodName;
    private int price;

    public Information() {
    }

    public Information(String outletName, String foodName, int price) {
        this.outletName = outletName;
        this.foodName = foodName;
        this.price = price;
    }

    public String getoutletName() {
        return outletName;
    }

    public void setOutletName(String outletName) {
        this.outletName = outletName;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
