package com.company;

public class Horse extends Animal {
    private String color;

    public Horse(double weight, byte age, char gender, String nickName, String color) {
        super(weight, age, gender, nickName);
        this.color = color;

    }
}
