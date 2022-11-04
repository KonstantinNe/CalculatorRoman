package ru.nemesh;

public class Convert {

    static int convertToArab(String a) {

        if (a.equals("1")) return 1;
        if (a.equals("2")) return 2;
//        if (a.equals("III")) return b = 3;
//        if (a.equals("IV")) return b = 4;
//        if (a.equals("V")) return b = 4;
//        if (a.equals("VI")) return b = 6;
//        if (a.equals("VII")) return b = 7;
//        if (a.equals("VIII")) return b = 8;
//        if (a.equals("IX")) return b = 9;
//        if (a.equals("X")) return b = 10;
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