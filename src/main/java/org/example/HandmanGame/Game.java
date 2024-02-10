package org.example.HandmanGame;

import java.util.Scanner;

public class Game {
    private String word;
    private String hiddenWord;
    private final Scanner scanner;
    private int randomNumber;

    public Game(String word, Scanner scanner, int randomNumber) {
        this.word = word;
        this.scanner = scanner;
        this.randomNumber = randomNumber;
    }

    public void newGame() {
        System.out.println(Constants.startGameMassage);
        int mistakes = 0;
        this.hiddenWord = this.createHiddenWordFrom(word);
        this.word = Constants.words[randomNumber];

        while (mistakes < Constants.gallows.length) {
            Character input = scanner.next().charAt(0);
             if (this.word.contains(input.toString())) {
                 System.out.println("ВЫ угадали букву!");
                 this.hiddenWord = transform(input);
             } else {
                 mistakes++;
             }

            if (!this.hiddenWord.contains("*")) {
                System.out.printf(Constants.winMassage, this.word);
                setNewWord();
                newGame();
            } else {
                System.out.println(hiddenWord);
            }

            System.out.printf(Constants.mistakes, mistakes);

            if (mistakes < Constants.gallows.length) {
                System.out.printf(Constants.gallows[mistakes]);
            } else {
                System.out.printf(Constants.badEndMassage, this.word);
                setNewWord();
                newGame();
            }

        }
        newGame();
    }

    private void setNewWord() {
        this.word = Constants.words[randomNumber];
    }

    private String transform(char character) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < this.word.length(); i++) {
            if (this.word.charAt(i) == character ) {
               str.append(character);
            } else if (this.hiddenWord.charAt(i) == '*') {
                str.append("*");
            } else {
                str.append(word.charAt(i));
            }
        }
        return str.toString();
    }

    private String createHiddenWordFrom(String string) {
    return "*".repeat(this.word.length());
    }
}
