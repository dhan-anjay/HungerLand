package com.example.hungerland;

interface OutletDetails{
    void showMenu();
}
 abstract class FoodIdentification{
    protected String name;    // Need to be protected bcz in showMenu() you need to access these properties
    protected float price;    // // Need to be protected bcz in showMenu() you need to access these properties

     FoodIdentification(){
         // Default
     }
     FoodIdentification(String name,float price){
        this.name=name;
        this.price=price;
    }
    protected String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
public class Constraints {
}
