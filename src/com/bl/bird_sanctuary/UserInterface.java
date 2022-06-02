package com.bl.bird_sanctuary;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    int showMainMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter: 1. Add Birds \n 2. Print Birds \n 3. Remove Birds" +
                " \n 4. Update Birds \n 5. Exit");
        System.out.println("Enter your Choice: ");
        int choice = sc.nextInt();
        return choice;
    }
    void printBird(ArrayList<Bird> birds) {
        for (Bird bird : birds) {
            System.out.println(bird.toString());
        }
    }
    /*Bird createBird(){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id of Bird: ");
        String idBird = sc.next();
        System.out.println("Enter the name of Bird: ");
        String nameBird = sc.next();
        System.out.println("Enter the colour of the Bird: ");
        String colourOfBird = sc.next();
        System.out.println("Enter the age of Bird: ");
        int ageOfBird = sc.nextInt();
        System.out.println("Enter ");
        return
    }*/
}
