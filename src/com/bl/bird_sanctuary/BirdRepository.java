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

    void add(Penguin penguin) {
        birdList.add(penguin);
    }

    void remove(Bird bird) {
        birdList.remove(bird);
    }
    public Bird getBird(String birdId){
        for (int i = 0; i < birdList.size(); i++) {
            if(birdList.get(i).equals(birdId)){
                return birdList.get(i);
            }
        }
        return null;
    }
}
