package com.samsung.service;

import com.samsung.model.Person;
import com.samsung.model.Student;

public class PersonDemo {
    public static void playDemo() {
        Person p1 = new Person("Alexander", "Egorov", 14);
        Person p2 = new Person("Alexandr", "Help", 404, "20317846123");

        Student s = new Student("Alexander", "AAAAAAAA", 26, "1654016524");
        s.setGroup("B");
        s.setScore(-9999);

        PersonPrinter personPrinter = new PersonPrinter();
        StudentPrinter studentPrinter = new StudentPrinter();

        personPrinter.printInfo(p1);
        System.out.println();
        personPrinter.printInfo(p2);
        System.out.println();
        studentPrinter.printInfo(s);
    }
}
