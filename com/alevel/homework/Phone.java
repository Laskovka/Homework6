package com.alevel.homework;

public class Phone {
    int number = 1;
    String model = "Nokia";
    double weight = 250;

    Phone() {
    }

    Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    int getNumber() {
        return number;
    }
}
