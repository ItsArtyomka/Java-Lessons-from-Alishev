package Basics;

import java.util.Scanner;


@SuppressWarnings("ReassignedVariable")

public class DoWhile {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        /*int value = userInput.nextInt();
        while (value != 5){
            System.out.println("Enter '5'");
            value = userInput.nextInt();
        }
        System.out.println("You have entered '5'");*/

        // Both of the loops are identical, however one is shorter than the other

        int value;
        do {
            System.out.println("Enter '5'");
            value = userInput.nextInt();
        } while (value != 5);
        System.out.println("You have entered '5'");

    }
}
