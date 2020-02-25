package com.foxminded.isaev.command.pizza;

public class Pizza {

    private int pizzaSize;
    private double cheeseQuantity;
    private double baconQuantity;
    private double pineappleQuantity;
    private double mushroomQuantity;
    private double seafoodQuantity;

    public int getPizzaSize() {
        return pizzaSize;
    }

    public double getCheeseQuantity() {
        return cheeseQuantity;
    }

    public double getBaconQuantity() {
        return baconQuantity;
    }

    public double getPineappleQuantity() {
        return pineappleQuantity;
    }

    public double getMushroomQuantity() {
        return mushroomQuantity;
    }

    public double getSeafoodQuantity() {
        return seafoodQuantity;
    }

    public void setPizzaSize(int pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public void setCheeseQuantity(double cheeseQuantity) {
        this.cheeseQuantity = cheeseQuantity;
    }

    public void setBaconQuantity(double baconQuantity) {
        this.baconQuantity = baconQuantity;
    }

    public void setPineappleQuantity(double pineappleQuantity) {
        this.pineappleQuantity = pineappleQuantity;
    }

    public void setMushroomQuantity(double mushroomQuantity) {
        this.mushroomQuantity = mushroomQuantity;
    }

    public void setSeafoodQuantity(double seafoodQuantity) {
        this.seafoodQuantity = seafoodQuantity;
    }

    public Pizza() {
        this.pizzaSize = 0;
        this.cheeseQuantity = 0;
        this.baconQuantity = 0;
        this.pineappleQuantity = 0;
        this.mushroomQuantity = 0;
        this.seafoodQuantity = 0;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "pizzaSize=" + pizzaSize +
                ", cheeseQuantity=" + cheeseQuantity +
                ", baconQuantity=" + baconQuantity +
                ", pineappleQuantity=" + pineappleQuantity +
                ", mushroomQuantity=" + mushroomQuantity +
                ", seafoodQuantity=" + seafoodQuantity +
                '}';
    }

}
