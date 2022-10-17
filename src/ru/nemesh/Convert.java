package ru.nemesh;

public class Convert {

    static String checkRom(String a) {

            if (a.equals("I")) return ("I");     //проверяем в строке римская или нет
            if (a.equals("II")) return ("II");
            if (a.equals("III")) return ("III");
            if (a.equals("IV")) return ("IV");
            if (a.equals("V")) return ("V");
            if (a.equals("VI")) return ("VI");
            if (a.equals("VII")) return ("VII");
            if (a.equals("VIII")) return ("VIII");
            if (a.equals("IX")) return ("IX");
            if (a.equals("X")) return ("X");
            System.out.println("Ошибка! Вы ввели символ или букву, необходимо ввести арабские или римские цифры!");
            return a;
        }
    static int convertToArab(String a) {

        if (a.equals("I")) return 1;  //конвертируем в римские
        if (a.equals("II")) return 2;
        if (a.equals("III")) return 3;
        if (a.equals("IV")) return 4;
        if (a.equals("V")) return 5;
        if (a.equals("VI")) return 6;
        if (a.equals("VII")) return 7;
        if (a.equals("VIII")) return 8;
        if (a.equals("IX")) return 9;
        if (a.equals("X")) return 10;
        return Integer.parseInt(a);
    }
}

//        do {
//            System.out.println("Введите римскую цифру!");
//            scanner.nextLine();
//            if (scanner.hasNextLine()) ;
//            a = String.valueOf(convertrom(scanner.nextLine()));
//            } while (a == String.valueOf(0));
//        System.out.println("Все правильно, введена римская цифра");
//  } finally {