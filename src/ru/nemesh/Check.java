package ru.nemesh;

import java.util.Scanner;

public class Check {
    public static int getInt(int a) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 1; i++) {
            try {
                if (a < 0) {
                    System.err.println("Число должно быть положительным!!!");
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Ошибка! Вы ввели символ или букву, необходимо ввести цифру. Возможно Вы ввели римскую цифру, секунду сейчас проверим.....");

            }
        }
        return a;
    }
}


//        for (int i = 0; i < 5; i++) {
//            if (num1 > 0) {
//        try {
//            if (num1 <= 0);
//            System.out.println("Число должно быть положительным!!! Введите число:");
//            num1 = scanner.nextInt();
//    }
//            catch (Exception e) {
//               System.out.println("Ошибка! Вы ввели символ или букву, необходимо ввести цифру. Возможно Вы ввели римскую цифру, секунду сейчас проверим.....");
//               break;
//            }

//            try {
//                int a = scanner.nextInt();
//                if (a < 0) {
//                    System.err.println("Число должно быть положительным!!!");
//                }
//
//            } catch (Exception e) {
//                System.out.println("Ошибка! Вы ввели символ или букву, необходимо ввести цифру. Возможно Вы ввели римскую цифру, секунду сейчас проверим.....");
//                break;



//        }
//        if (scanner.nextLine()) ;
//        int a = convert(scanner.nextLine());
//        System.out.println("Все правильно, введена римская цифра");
//        return a;
//            }
//
//    }
//    }
