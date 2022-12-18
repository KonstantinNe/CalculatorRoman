package ru.nemesh;

import ru.nemesh.Exception.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        String num1 = null;
        String num2 = null;
        String operation = null;
        String input = null;

        do {

            System.out.println("Введите положительные числа через пробел и нужный оператор +/*- (пример 2 + 3):");

            while (flag == true) {

                input = scanner.nextLine(); //сканируем строку
                try {
                    input = Check.getProbel(input);

                } catch (ProbelException e) {
                    System.out.println(e.getMessage());
                    continue;
                }

                String[] mas = input.split(" ");  //  делим массив строку на части где пробел
                try {
                    input = Check.getMas(mas[0],mas[1],mas[2]);
                } catch (NullnumException e) {
                    System.out.println(e.getMessage());
                    continue;
                }

                num1 = mas[0];   //  первая строка


                operation = mas[1];  //  вторая строка
                try {
                    operation = Check.getOperation(operation);
                } catch (OperationException e) {
                    System.out.println(e.getMessage());
                    continue;
                }

                num2 = mas[2];
                try {
                    Check.getInt(num1);
                    Check.getInt(num2);
                } catch (NegativeException e) {
                    System.out.println(e.getMessage());
                    continue;
                } catch (SymbolException e) {
                    System.out.println(e.getMessage());
                    continue;
                }
                break;
            }
            Calculator calc = null;
            calc = Check.getCalc(calc, num1, num2);


              String result = null;
            switch (operation) {
                case "+":
                    result = String.valueOf(calc.plus(num1, num2));
                    result = Check.getResult(result,num1,num2);
                        break;
                        case "-":
                            result = String.valueOf(calc.minus(num1, num2));
                            result = Check.getResult(result,num1,num2);
                            break;
                        case "*":
                            result = String.valueOf(calc.multiply(num1, num2));
                            result = Check.getResult(result,num1,num2);
                            break;
                        case "/":
                            result = String.valueOf(calc.divide(num1, num2));
                            result = Check.getResult(result,num1,num2);
                            break;
                    }
                    System.out.println("Результат: " + result);

                    System.out.println("Вы завершили работу? Да или Нет?");
                    while (flag == true) {
                        input = scanner.nextLine();
                        try {
                            input = Check.getExit(input);
                        } catch (ExitException e) {
                            System.out.println(e.getMessage());
                            continue;
                        }
                        break;
                    }

            }
            while (input.equals("Нет")) ;
            System.out.println("До свидание!");
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
