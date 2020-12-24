package com.alevel.homework;

public class Task1 {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone(777, "Iphone 12");
        Phone phone3 = new Phone(64172, "Samsung 7", 260.1);

        phone1.receiveCall("Саша");
        phone2.receiveCall("Даша");
        phone3.receiveCall("Маша");

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());

        System.out.println("Телефон \"" + phone1.model + "\" весит " + phone1.weight + " и имеет индивидуальный номер - \"" + phone1.number + "\".");
        System.out.println("Телефон \"" + phone2.model + "\" весит " + phone2.weight + " и имеет индивидуальный номер - \"" + phone2.number + "\".");
        System.out.println("Телефон \"" + phone3.model + "\" весит " + phone3.weight + " и имеет индивидуальный номер - \"" + phone3.number + "\".");
    }
}
