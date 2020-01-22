package com.company;

import com.Exception.WrongCharacterException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws WrongCharacterException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите математический пример:");
        String string = scanner.nextLine();
        scanner.close();

        System.out.println("Ответ: " + Answer.toAnswer(ParsingString.pars(string)));
    }
}
