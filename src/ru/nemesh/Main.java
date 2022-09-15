package ru.nemesh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int num1 = scanner.nextInt();
        if (num1 > 0) {
        } else {
            if (num1 < 0);
            System.out.println("Число должно быть положительным!!!");
                System.exit(1);
    }
            System.out.println("Введите число:");
            int num2 = scanner.nextInt();
        if (num2 > 0) {
        } else {
            if (num2 < 0);
            System.out.println("Число должно быть положительным!!!");
            System.exit(1);
        }
            System.out.println("Введите оператор:");
            String operation = scanner.nextLine();
            operation = scanner.nextLine();

            Arab calc = new Arab();
            int result = 0;
            switch (operation) {
                case "+":
                    result = calc.plus(num1, num2);
                    break;
                case "-":
                    result = calc.minus(num1, num2);
                    break;
                case "*":
                    result = calc.multiply(num1, num2);
                    break;
                case "/":
                    result = calc.divide(num1, num2);
                    break;
            default:
                System.out.println("Ошибка, Вы не ввели оператор (+-*/)!!!");
                System.exit(1);
            }
            System.out.println("Результат: " + result);
        }
    }
    
        


//        int num1;
//        int num2;
//        char operation = Oper.getOperation();
//        int result = Calculations.calc(num1, num2, operation);
//        System.out.println("Результат: " + result);
//    }
//
//    public int getInt() {
//        System.out.println("Введите число:");
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < 5; i++) {
//            try {
//                int num = scanner.nextInt();
//                if (num < 0) {
//                    System.err.println("Число должно быть положительным!!!");
//                    return getInt();
//                }
//                return num;
//
//            } catch (Exception e) {
//                System.out.println("Ошибка! Вы ввели символ или букву, необходимо ввести цифру. Возможно Вы ввели римскую цифру, секунду сейчас проверим.....");
//                break;
//            }
//        }
//        if (scanner.hasNextLine()) ;
//        int num = convert(scanner.nextLine());
//        System.out.println("Все правильно, введена римская цифра");
//        return num;
//    }
//    public int convert(String a) {
//
//        if (a.equals("I")) return 1;
//        if (a.equals("II")) return 2;
//        if (a.equals("III")) return 3;
//        if (a.equals("IV")) return 4;
//        if (a.equals("V")) return 5;
//        if (a.equals("VI")) return 6;
//        if (a.equals("VII")) return 7;
//        if (a.equals("VIII")) return 8;
//        if (a.equals("IX")) return 9;
//        if (a.equals("X")) return 10;
//        return getInt();
//    }
//}



//package ru.nemesh;
//
//import java.util.Scanner;
//
//public class Oper {
//    public char getOperation() {
//        System.out.println("Введите операцию (+-*/):");
//        Scanner scanner = new Scanner(System.in);
//        char operation;
//        if (scanner.hasNext());
//            operation = scanner.next().charAt(0);
//            return operation;
//        }
//    }
