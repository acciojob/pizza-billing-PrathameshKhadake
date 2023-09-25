package com.driver;

public class Pizza {
    public void setPrice(int price) {
        this.price = price;
    }

    public int getBasePrice() {
        return BasePrice;
    }

    public int getToppingPrice() {
        return ToppingPrice;
    }

    public int getCheesePrice() {
        return cheesePrice;
    }

    public int getPaperBagPrice() {
        return PaperBagPrice;
    }

    private int price;
    private final int BasePrice;
    private final int ToppingPrice;
    private final int cheesePrice = 80;

    private final int PaperBagPrice = 20;

    private Boolean isVeg;

    public boolean extraCheese = false;

    public boolean extraTopping = false;

    public boolean TakeAway = false;

    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            BasePrice = 300;
            ToppingPrice = 70;
            price = 300;
        }else{
            BasePrice = 400;
            ToppingPrice = 120;
            price = 400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(extraCheese == false){
            price += cheesePrice;
            extraCheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(extraTopping == false){
            price += ToppingPrice;
            extraTopping = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(TakeAway == false){
            price += PaperBagPrice;
            TakeAway = true;
        }
    }


    public String getBill(){
        // your code goes here
        bill = "Base Price Of Pizza: " + BasePrice + "\n";
                if(extraCheese)
                   bill += "Extra Cheese Added: " + cheesePrice + "\n";
                if(extraTopping)
                    bill += "Extra Topping Added: " + ToppingPrice + "\n";
                if(TakeAway)
                    bill += "Paperbag Added: " + PaperBagPrice + "\n";
                bill += "Total Price: " + price + "\n";
        return this.bill;
    }
}
