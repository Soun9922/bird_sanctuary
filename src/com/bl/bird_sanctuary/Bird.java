package com.bl.bird_sanctuary;

abstract class Bird {
    String Id;
    String name;
    String colour;
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
