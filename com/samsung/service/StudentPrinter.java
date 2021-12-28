package com.samsung.service;

import com.samsung.model.Person;
import com.samsung.model.Student;

public class StudentPrinter implements Printer {
    public void printInfo(Person p) {
        PersonPrinter printer = new PersonPrinter();
        printer.printInfo(p);

        StringBuilder result = new StringBuilder();
        result.append("Group: ").append(((Student) p).getGroup())
                .append("\nScore: ").append(((Student) p).getScore());
        System.out.println(result);
    }
}
