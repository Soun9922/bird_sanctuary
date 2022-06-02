package com.bl.bird_sanctuary;

import java.util.ArrayList;

public class BirdRepository {
    private ArrayList<Bird> birdList = new ArrayList<>();

    public ArrayList<Bird> getBirdList() {
        return birdList;
    }

    void add(Parrot parrot) {
        birdList.add(parrot);
    }

    void add(Duck duck) {
        birdList.add(duck);
    }

    void add(Eagle eagle) {
        birdList.add(eagle);
    }

    void add(Ostrich ostrich) {
        birdList.add(ostrich);
    }

    void add(Peacock peacock) {
        birdList.add(peacock);
    }
    void add(Penguin penguin){
        birdList.add(penguin);
    }

    void remove(Parrot parrot) {
        birdList.remove(parrot);
    }
    void remove(Eagle eagle) {
        birdList.remove(eagle);
    }
    void remove(Duck duck) {
        birdList.remove(duck);
    }
    void remove(Ostrich ostrich) {
        birdList.remove(ostrich);
    }
    void remove(Peacock peacock) {
        birdList.remove(peacock);
    }
    void remove(Penguin penguin){
        birdList.remove(penguin);
    }
}
