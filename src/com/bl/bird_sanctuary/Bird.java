package com.bl.bird_sanctuary;

abstract class Bird {
    enum Colour {BLACK, BLUE, GREEN, WHITE, BLACK_WHITE}

    String Id;
    String name;
    Colour colour;
    int age;

    abstract void eat();

    abstract void fly();

    abstract void swim();

    @Override
    public String toString() {
        return "Bird{" +
                "Id='" + Id + '\'' +
                ", name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", age=" + age +
                '}';
    }
}
