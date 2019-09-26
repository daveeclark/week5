package com.week5;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,25,5);
        Monitor monitor = new Monitor("27 inch Beast","HP",27,100);
        MotherBoard motherboard = new MotherBoard("BJ-300","Pentium",4,6,"v2.44");
        Case case1 = new Case("H240", "Fuji","240 powerSupply",new Dimensions(30,20,12));
        PC pc = new PC(case1, motherboard, monitor);


        System.out.println("Welcome to worstBuy's PC section!!");
        System.out.println("Below is a description of our PC deal of the day!!!");
        System.out.println("==========================");
        pc.description();
        System.out.println("================");
        pc.powerUp();


//        int guesses = 0;
//        int correctGuess = (int) (Math.random() * 10);
//
//        System.out.println("Welcome to the guessing game! " +
//                "\n" + "Guess a number between 0-10!");
//        Scanner scanner = new Scanner(System.in);
//
//        ArrayList<Integer> guessHoe = new ArrayList<Integer>();
//
//        while (true) {
//            int enterGuess = scanner.nextInt();
//            if (guessHoe.contains(enterGuess)){
//
//            } else {
//                guessHoe.add(enterGuess);
//            }
//                if (enterGuess > correctGuess) {
//                System.out.println("Too Large");
//                //guessHoe.add(enterGuess);
//            } else if (enterGuess < correctGuess) {
//                    System.out.println("Too Small");
//                    //guessHoe.add(enterGuess);
//                }
//                if (enterGuess == correctGuess) {
//                    System.out.println("Correct Guess");
//                break;
//            }
//
//        }
//            System.out.println("It took you " + guessHoe.size() +
//                    " guesses for the correct number");
//        }
//
//        Vehicle vehicle = new Vehicle(3);
//        vehicle.name="Gary";
//        System.out.println(vehicle);
//
//        Car car = new Car(4);
//        car.setShape("circle");
//        car.name="I am a car";
//        System.out.println(car.name);
//    }
    }

}
