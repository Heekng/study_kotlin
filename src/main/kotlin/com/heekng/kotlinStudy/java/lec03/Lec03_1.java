package com.heekng.kotlinStudy.java.lec03;

public class Lec03_1 {

    public static void main(String[] args) {

    }

    public static void printAgeIfPerson(Object obj) {
        if (obj instanceof Person) {
            Person person = (Person) obj;
            System.out.println(person.getName());
        }
    }
}
