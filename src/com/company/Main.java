package com.company;

public class Main {

    public static void main(String[] args) {

    Herbivore trava = new Trava(5);
        System.out.println("Трава весит = " + ((Trava) trava).weight);
        Meal ukrop;
        ukrop = trava;
        System.out.println("Укроп весит = " + trava.weight);


    Herbivore squirrel = new Squirrel(6);
        System.out.println("Вес белки = " );
    Animal animal_01 = squirrel;
        System.out.println("Белка съела траву и стала весить: " + animal_01.toEat(trava));

//    Rabbit rabbit = new Rabbit(8);
//    Animal animal_02 = rabbit;
//        System.out.println("Кролик съел траву и стал весить: " + animal_02.toEat(ukrop));
//
//    Wolf wolf = new Wolf(9);
//    Animal animal_03 = wolf;
//        System.out.println("Волк съел голодную белочку и стал весить: " + animal_03.toEat(squirrel));
//        System.out.println("Волк не съел сытую белочку: " + animal_03.toEat(animal_01));





    }
}
