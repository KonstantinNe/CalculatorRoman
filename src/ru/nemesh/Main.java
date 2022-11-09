package ru.nemesh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Check negative = new Check();
        boolean flag = true;
//        try {
//           // throw new NegativeException("Число должно быть положительным!!!");
//            a < 0;
//        } catch () {


        System.out.println("Введите положительные числа и нужный оператор (+/*-):");
        {

            int a;
            do {
                String input = scanner.nextLine(); //сканируем строку

                String[] mas = input.split(" ");  //  делим массив строку на части где пробел

                String num1 = (mas[0]);   //  первая строка
                a = 0;
                try {
                    a = Check.getInt(num1);
                } catch (NegativeException e) {
                    System.out.println(e.getMessage());
                    //               main(null);
                } catch (SymbolException e) {
                    System.out.println(e.getMessage());
                    //               main(null);
                }

                String operation = mas[1];  //  вторая строка

                String num2 = (mas[2]);  //  третья строка
                int b = 0;
                try {
                    b = Check.getInt(num2);
                } catch (NegativeException e) {
                    System.out.println(e.getMessage());
                    //               main(null);
                } catch (SymbolException e) {
                    System.out.println(e.getMessage());
                    //              main(null);
                }
                Calculator calc = null;
                calc = Check.getCalc(calc, num1, num2);

            } while (a > 0);
            flag = true;


            double result = 0;
            switch (operation) {
                case "+":             //если плюс то будет поведение такое поведение
                    //                       result = calc.plus(Integer.parseInt(num1), Integer.parseInt(num2));
                    result = calc.plus(a, b);
                    break;
                case "-":
                    result = calc.minus(Integer.parseInt(num1), Integer.parseInt(num2));
                    break;
                case "*":
                    result = calc.multiply(Integer.parseInt(num1), Integer.parseInt(num2));
                    break;
                case "/":
                    result = calc.divide(Integer.parseInt(num1), Integer.parseInt(num2));
                    break;
                default:
            }
            System.out.println("Результат: " + result);

        }
    }
}



    










//        int num1 = scanner.nextInt();
//        if (num1 > 0) {
//        } else {
//            if (num1 < 0);
//            System.out.println("Число должно быть положительным!!! Введите число:");
//            num1 = Integer.parseInt(scanner.nextLine());
//            System.out.println ("Ошибка! Вы ввели символ или букву");
//            num1 = scanner.nextInt();
//    }                catch (Exception e) {
//               System.out.println("Ошибка! Вы ввели символ или букву, необходимо ввести цифру. Возможно Вы ввели римскую цифру, секунду сейчас проверим.....");
//               break;
//            }
//            System.out.println("Введите число:");
//            int num2 = scanner.nextInt();
//        if (num2 > 0) {
//        } else {
//            if (num2 < 0);
//            System.out.println("Число должно быть положительным!!!");
//            System.exit(1);
//        }
//            System.out.println("Введите оператор:");
//            String operation = scanner.nextLine();
//            operation = scanner.nextLine();


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
