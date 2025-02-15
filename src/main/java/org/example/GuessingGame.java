package org.example;

import java.util.*;

public class GuessingGame {

    private static int getRandomNumber() {
        return new Random().nextInt(1, 100);
    }

    private static void printRules() {
        System.out.println("""
                Welcome to the Number Guessing Game!
                I'm thinking of a number between 1 and 100.
                You have 5 chances to guess the correct number.
                """);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(2, 5);
        map.put(3, 3);

        printRules();
        int countOfGames = 0;
        boolean wantToContinue = true;

        long start = System.nanoTime();
        while (wantToContinue) {
            int numberToGuess = getRandomNumber();
            System.out.println("""
                Please select difficulty level:\s
                1. Easy (10 chances)
                2. Medium (5 chances)
                3. Hard (3 chances)
               \s
               \s""");

            System.out.print("Enter your choice: ");
            int level = scanner.nextInt();
            int chances = map.get(level);

            while (chances > 0) {
                System.out.println("Enter your guess: ");
                int guess = scanner.nextInt();

                boolean found = checkNumber(guess, numberToGuess);
                if (found) {
                    System.out.println("Congrats! You guessed the number in: " + (map.get(level) - chances) + " attempts.");
                    break;
                }
                chances--;
            }

            if (chances == 0) System.out.println("You lost. Try again!");

            System.out.print("Do you want to continue? (y/n) ");
            String s = scanner.next();

            if (s.length() != 1 || s.charAt(0) == 'n') wantToContinue = false;
            countOfGames++;
        }

        long end = System.nanoTime();
        long seconds = (end - start) / 1_000_000_000;

        System.out.println("Total count in the game: " + countOfGames);
        System.out.println("Spend time in seconds: " + seconds);
    }

    private static boolean checkNumber(int guess, int numberToGuess) {
        if (numberToGuess == guess) {
            return true;
        } else if (guess < numberToGuess) {
            System.out.println("Incorrect! The number is greater than " + guess);
        } else {
            System.out.println("Incorrect! The number is less than " + guess);
        }

        return false;
    }

}