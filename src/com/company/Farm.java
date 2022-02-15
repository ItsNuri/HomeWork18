package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Farm {
    private String address;
    private String ownerName;
    private Sheep[] sheep;
    private Cow[] cows;
    private Horse[] horses;

    public Farm(String address, String ownerName, Sheep[] sheep, Cow[] cows, Horse[] horses) {
        this.address = address;
        this.ownerName = ownerName;
        this.sheep = sheep;
        this.cows = cows;
        this.horses = horses;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    @Override
    public String toString() {
        return
                "\n Address: " + address +
                "\n Owner name: " + ownerName +
                "\n Sheep: " + Arrays.toString(sheep) +
                "\n Cows: " + Arrays.toString(cows) +
                "\n Horses: " + Arrays.toString(horses);
    }
}
