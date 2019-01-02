package com.company;

public class Squirrel extends Herbivore{
    int weight;

    Squirrel(int weight){
        this.weight = weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int getWeight() {
        return weight;
    }
}
