package com.heekng.kotlinStudy.java.lec10;

public class JavaCat extends Animal{

    public JavaCat(String species) {
        super(species, 4);
    }

    @Override
    public void move() {
        System.out.println("고양이가 걷는다.");
    }

}
