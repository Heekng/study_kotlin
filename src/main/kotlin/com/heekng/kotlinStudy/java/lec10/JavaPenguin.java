package com.heekng.kotlinStudy.java.lec10;

public class JavaPenguin extends Animal implements JavaFlyable, JavaSwimable{

    private final int wingCount;

    public JavaPenguin(String species) {
        super(species, 2);
        this.wingCount = 2;
    }

    @Override
    public void move() {
        System.out.println("펭귄이 움직인다.");
    }

    @Override
    public int getLegCount() {
        return super.getLegCount() + this.wingCount;
    }

    @Override
    public void act() {
        JavaSwimable.super.act();
        JavaFlyable.super.act();
    }

}
