package ru.nemesh;

import java.util.Scanner;

public class Main implements Rom{
    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = Oper.getOperation();
        int result = Calculations.calc(num1, num2, operation);
        System.out.println("Результат: " + result);
    }

    public static int getInt() {
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            try {
                int num = scanner.nextInt();
                if (num < 0) {
                    System.err.println("Число должно быть положительным!!!");
                    return getInt();
                }
                return num;

            } catch (Exception e) {
                System.out.println("Ошибка! Вы ввели символ или букву, необходимо ввести цифру. Возможно Вы ввели римскую цифру, секунду сейчас проверим.....");
                break;
            }
        }
        if (scanner.hasNextLine()) ;
        int num = convert(scanner.nextLine());
        System.out.println("Все правильно, введена римская цифра");
        return num;
    }
    public int convert(String a) {

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
        return getInt();
    }
}