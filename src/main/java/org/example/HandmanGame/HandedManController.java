package org.example.HandmanGame;

import java.util.Random;
import java.util.Scanner;

public class HandedManController {
    Scanner scanner = new Scanner(System.in);
    int random = new Random().nextInt(Constants.words.length);

    private Game game = new Game(Constants.words[random],scanner,random);

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Constants.startMessage);
        int choice = scanner.nextInt();

        if (choice == 1 ) {
           game.newGame();
        } else {
            throw new RuntimeException("Игра завершена");
        }
    }



}
