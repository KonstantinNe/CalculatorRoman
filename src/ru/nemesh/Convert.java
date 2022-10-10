package ru.nemesh;

import java.util.Scanner;

public class Convert {

    static int convertrom(String a) {
        Scanner scanner = new Scanner(System.in);

        if (a.equals("I")) return 1;
        if (a.equals("II")) return 2;
        if (a.equals("III")) return 3;
        if (a.equals("IV")) return 4;
        if (a.equals("V")) return 5;
        if (a.equals("VI")) return 6;
        if (a.equals("VII")) return 7;
        if (a.equals("VIII")) return 8;
        if (a.equals("IX")) return 9;
        if (a.equals("X")) return 10;
        System.out.println("Ошибка! Вы ввели символ или букву, необходимо ввести арабскую или римскую цифру!");
//        do {
//            System.out.println("Введите римскую цифру!");
//            scanner.nextLine();
//            if (scanner.hasNextLine()) ;
//            a = String.valueOf(convertrom(scanner.nextLine()));
//            } while (a == String.valueOf(0));
//        System.out.println("Все правильно, введена римская цифра");
//        return Integer.parseInt(a);
        while (scanner.hasNextLine());
        return Integer.parseInt(a);
    }
}

