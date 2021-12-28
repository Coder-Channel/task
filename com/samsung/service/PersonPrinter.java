package com.samsung.service;

import com.samsung.model.Person;

public class PersonPrinter implements Printer {
    public void printInfo(Person p) {
        StringBuilder result = new StringBuilder();
        result.append("First name: ").append(p.getFirstName())
                .append("\nSecond name: ").append(p.getSecondName())
                .append("\nAge: ").append(p.getAge())
                .append("\nPhone: ").append(p.getPhone());
        System.out.println(result);
    }
}
