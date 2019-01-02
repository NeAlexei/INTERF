package com.company;

public class Predator extends Animal{
        public int toEat(Meal meal){
            if (meal instanceof Grass){ //проверка,является ли тип объекта meal(это Meal) типом Grass.
                System.out.println("Хищник не ест траву!");
            }

                /*
                else if ((meal.getWeight >= weight)&&(meal instanceof Grass)){
                System.out.printLn("Вес хищника меньше веса еды, он не может съесть это!);
                {
                */

            else {
                weight = weight + meal.getWeight();
            }
            return weight;
        }
}

