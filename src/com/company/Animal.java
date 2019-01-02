package com.company;

public abstract class Animal implements Meal{
    int weight;

    @Override
    public int getWeight() { //если метод начинается с get - это значит, что надо что-то вернуть.
        return weight;
    }
        public abstract int toEat(Meal meal); /*абстрактный метод, принимает еду и возвращает новый вес животного.
        Абстрактный метод нельзя реализовать в абстрактном классе, он реализуется в классах-наследниках.
        Если в классе есть хоть один абстрактный метод, то весь класс тоже должен быть абстрактным*/
}




