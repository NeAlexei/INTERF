package com.company;

public class Herbivore extends Animal {

    public int toEat(Meal meal){
        if (meal instanceof Meat){ // Проверка, является ли тип объекта meal типом Meat
            System.out.println("Травоядное животное не ест мясо!");
        } else {
            weight = weight + meal.getWeight();
        }
        return weight;
    }
}
