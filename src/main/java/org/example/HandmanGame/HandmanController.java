package org.example.HandmanGame;

import java.util.Random;
import java.util.Scanner;

public class HandmanController {

    private int random = new Random().nextInt(Constants.words.length);

    private Game game = new Game(Constants.words[random]);

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Constants.start_message);
        int chouce = scanner.nextInt();

        if (chouce == 1 ) {
           game.newGame();
        } else {
            throw new RuntimeException("Игра завершена");
        }
    }



}
