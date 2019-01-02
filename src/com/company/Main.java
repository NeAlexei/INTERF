package com.company;

public class Main {

    public static void main(String[] args) {

    Trava trava = new Trava(4);
    Meal ukrop = trava;

    Squirrel squirrel = new Squirrel(6);
    Animal animal_01 = squirrel;
        System.out.println("Белка съела траву и стала весить: " + animal_01.toEat(ukrop));

    Rabbit rabbit = new Rabbit(8);
    Animal animal_02 = rabbit;
        System.out.println("Кролик съел траву и стал весить: " + animal_02.toEat(ukrop));

    Wolf wolf = new Wolf(9);
    Animal animal_03 = wolf;
        System.out.println("Волк съел голодную белочку и стал весить: " + animal_03.toEat(squirrel));
        System.out.println("Волк не съел сытую белочку: " + animal_03.toEat(animal_01));





    }
}
