package com.company;

import com.exception.InvalidOperationException;
import com.exception.WrongCharacterException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = false;

        while (!check) {
            System.out.println("Введите математический пример:");
            String string = scanner.nextLine();

            try {
                CheckValidation.check(string);
                check = true;
                System.out.println("Ответ: " + Answer.toAnswer(ParsingString.pars(string)));
            } catch (WrongCharacterException | InvalidOperationException e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}
