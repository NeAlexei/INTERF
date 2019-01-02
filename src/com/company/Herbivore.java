package com.company;

public class Herbivore extends Animal {

    public double toEat(Meal meal){
        if (meal instanceof Meat){ //проверка если meal есть мясо - true
            System.out.println("Травоядное животное не ест мясо!");
        } else {
            weight = weight + meal.getWeight();
        }
        return weight;
    }
}
