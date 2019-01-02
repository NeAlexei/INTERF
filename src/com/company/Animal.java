package com.company;

public abstract class Animal implements Meat{
    double weight;

    @Override
    public double getWeight() { //если метод начинается с get то это какбЭ намекает на то, шо надо что-то вернуть
        return weight;
    }

        public abstract double toEat(Meal meal); /*абстрактный метод, принимает еду и возвращает новый вес животного
        если в классе есть хоть один абстрактный метод, то весь класс тоже должен быть абстрактным*/

}




