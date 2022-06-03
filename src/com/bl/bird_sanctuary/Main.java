package com.bl.bird_sanctuary;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    BirdRepository birdRepository = new BirdRepository();

    public static void main(String[] args) {
        System.out.println("----Welcome to Bird Sanctuary----");
        UserInterface userInterface = new UserInterface();
        Main main = new Main();
        int choice = 0;
        while (choice != 5) {
            choice = userInterface.showMainMenu();
            main.userSelectionHandel(choice);
        }
    }

    void userSelectionHandel(int choice) {
        switch (choice) {
            case 1:
                addBird();
                break;
            case 2:
                UserInterface userInterface = new UserInterface();
                ArrayList<Bird> birdList = birdRepository.getBirdList();
                userInterface.printBird(birdList);
                break;
            case 3:
                removeBird();
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                System.out.println("Invalid Entry");
                break;
        }
    }

    void addBird() {
        Duck duck = new Duck();
        duck.name = "Duck";
        duck.Id = "DU001";
        duck.age = 5;
        duck.colour = Bird.Colour.WHITE;

        Eagle eagle = new Eagle();
        eagle.name = "Eagle";
        eagle.Id = "EA001";
        eagle.age = 4;
        eagle.colour = Bird.Colour.BLACK_WHITE;

        Ostrich ostrich = new Ostrich();
        ostrich.name = "Ostrich";
        ostrich.Id = "OS001";
        ostrich.age = 4;
        ostrich.colour = Bird.Colour.BLACK;

        Parrot parrot = new Parrot();
        parrot.name = "Parrot";
        parrot.Id = "PA001";
        parrot.age = 2;
        parrot.colour = Bird.Colour.GREEN;

        Peacock peacock = new Peacock();
        peacock.name = "Peacock";
        peacock.Id = "PE001";
        peacock.age = 1;
        peacock.colour = Bird.Colour.BLUE;

        Penguin penguin = new Penguin();
        penguin.name = "Penguin";
        penguin.Id = "PN001";
        penguin.age = 3;
        penguin.colour = Bird.Colour.BLACK_WHITE;

        birdRepository.add(duck);
        birdRepository.add(eagle);
        birdRepository.add(ostrich);
        birdRepository.add(parrot);
        birdRepository.add(peacock);
        birdRepository.add(penguin);
    }

    void removeBird() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Bird Id to be removed: ");
        String birdId = scanner.next();
        birdRepository.getBird(birdId);
        Bird bird = birdRepository.getBird(birdId);
        birdRepository.remove(bird);
    }
}

