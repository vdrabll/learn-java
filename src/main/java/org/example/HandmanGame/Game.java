package org.example.HandmanGame;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Game {

    private String word;
    private String hiddenWord;

    public Game(String word) {
        this.word = word;
    }

    public void newGame() {
        System.out.println("Мы загадали слово, введите предпологаемую букву:");
        ; // TODO: fix
        int mistakes = 0;
        Scanner scanner = new Scanner(System.in);
        int random = new Random().nextInt(Constants.words.length);
        this.hiddenWord = this.createHiddenWordFrom(word);
        this.word = Constants.words[random];

        while (mistakes < Constants.handMans.length) {
            Character input = scanner.next().charAt(0);
             if (this.word.contains(input.toString())) {
                 System.out.println("ВЫ угадали букву!");
                 this.hiddenWord = transform(input);
             } else {
                 mistakes++;
             }

            if (!this.hiddenWord.contains("*")) {
                System.out.printf("Вы угадали слово: %s! \n", this.word);
                setNewWord();
                newGame();
            } else {
                System.out.println(hiddenWord);
            }

            System.out.printf("Ошибок: %s", mistakes);

            if (mistakes < Constants.handMans.length) {
                System.out.printf(Constants.handMans[mistakes]);
            } else {
                System.out.printf("Вы не угадали слово и меня уволили с работы, штош, пора открывать резюме на HH снова :( Попробуйте еще раз");
                setNewWord();
                newGame();
            }

        }
        newGame();
    }

    private void setNewWord() {
        this.word = Constants.words[new Random().nextInt(Constants.words.length)];
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
        String str = "";
        for (int i = 0; i < string.length(); i++) {
            str += "*";
        }
        return str;
    }
}
