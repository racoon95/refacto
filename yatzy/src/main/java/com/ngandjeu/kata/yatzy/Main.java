package com.ngandjeu.kata.yatzy;

import com.ngandjeu.kata.yatzy.scocer.WrongCategoryException;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Yahtzee !!!");

        System.out.println("Enter your last name: ");
        String firstName = scan.nextLine();

        System.out.println("Enter your category: ");
        String category = scan.nextLine();

        System.out.println("Press ENTER to play");
        scan.nextLine();

        List<Integer> diceResults = generateRollResult();
        System.out.println("Your Roll result is : " + diceResults);

        System.out.println("Press ENTER to see your result");

        scan.nextLine();

        YatzyGame yatzyGame = new YatzyGame();

        try {
            var score = yatzyGame.calculateRollScore(diceResults, category);
            System.out.println(firstName + ", Your roll result is: " + score);
        } catch (WrongCategoryException e) {
            System.out.println(firstName + ", You entered wrong Category");
        }
        scan.close();
    }

    private static List<Integer> generateRollResult() {
        int min = 1;
        int max = 6;
        return IntStream.of(1,2,3,4,5)
                .map(integer -> new Random().nextInt(max - min + 1) + min)
                .boxed().toList();
    }
}
