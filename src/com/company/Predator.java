package com.company;

public class Predator extends Animal{
        public double toEat(Meal meal){
            if (meal instanceof Grass){ //проверка: если еда есть трава - сообщение, если еда есть мясо - норм
                System.out.println("Хищник не ест траву!");
            } else {
                /*if (meal.getWeight >= weight){
                    System.out.printLn("Вес хищника меньше веса "жертвы", он не может это съесть);
                 } else {
                    weight = weight + meal.getWeight(); */

                weight = weight + meal.getWeight();
            }
            return weight;
        }
}

