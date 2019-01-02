package com.company;

public class Herbivore extends Animal {

    public double toEat(Meal meal){
        if (meal instanceof Meat){
            System.out.println("Травоядное не жрет мясо!");
        } else {
            weight = weight + meal.getWeight();
        }
        return weight;
    }
}
