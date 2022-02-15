package com.company;

public class Animal {
    private double weight;
    private byte age;
    private char gender;
    private String nickName;

    public Animal(double weight, byte age, char gender, String nickName) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.nickName = nickName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return  "                    "+
                "\n Weight: " + weight +
                "\n Age: " + age +
                "\n Gender: " + gender +
                "\n Nick name: " + nickName ;
    }
}
