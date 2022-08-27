package ru.nemesh;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        ConvertToRoman convert = new ConvertToRoman();
        char operation = getOperation();
        int result = calc(num1,num2,operation);
        System.out.println("Результат операции: "+result);
    }

    public static int getInt(){
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        int num;
        if(scanner.hasNextLine()){
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();
            num = getInt();
        }
        return num;
    }

    public static char getOperation(){
        System.out.println("Введите операцию:");
        Scanner scanner = new Scanner(System.in);
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();//рекурсия
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int num1, int num2, char operation){
        int result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }
}

//public class Main {
//    private static final char exitCharacter = '!';
//
//    public static void main(String[] args) {
//        DataReader reader = new DataReader(exitCharacter);
//        while (true) {
//            try {
//                reader.read();
//            } catch (RuntimeException e) {
//                System.err.println(e.getMessage());
//                continue;
//            }
//            if (reader.isExitFlag()) {
//                System.out.println("В выражении пристутствует знак выхода: " + exitCharacter);
//                System.out.println("Завершение программы.");
//                break;
//            }
//            double result = Calculator.calculate(reader.getVar1(), reader.getVar2(), reader.getOper());
//            System.out.println(result);
//        }
//    }
//}
//





//public class Main {
//    public static void main (String[] args) {
//        String[] num1;
//        String[] num2;
//        String operation = null;
//        boolean exitFlag;
//        char exitCharacter = 0;
//        char resultChar = 0;
//        Integer[] arabic = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
//        String[] roman = {"X", "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"};
//        Convert convert = new Convert();
//
//        System.out.println("Введите 2 целых арабских числа от 0 до 10 или 2 римских числа от I до X: ");
//        Scanner scanner = new Scanner(System.in);
//
//        String text = scanner.nextLine();
//        if (text.indexOf(exitCharacter) != -1) {
//            exitFlag = true;
//            return;
//        }
//
//        try {
//            if ((text.charAt(text.length() - 1) != resultChar)) {
//                throw new RuntimeException();
//            }
//
//            text = text.substring(0, text.length() - 1);
//            String[] blocks = text.split("[+-/*]");
//           // проверяем, входит ли строка blocks[0] в массив строк массива "roman"
//           boolean flag = false;
//            for (int i = 0; i < roman.length; i++){
//                if (roman[i].equals(blocks[0]) || roman[i].equals(blocks[1])){
//                    flag = true;
//                }
//                //flag = true, значит будем иметь дело с римскими обозначениями
//                if(flag){
//                    num1 = romanToNumber(blocks[0]);
//                    num2 = romanToNumber(blocks[2]);
//                } else {
//                   num1 = Integer.parseInt(blocks[0]);
//                   operation = String.valueOf(text.charAt(blocks[0].length()));
//                   num2 = Integer.parseInt(blocks[1]);
//
//                }
//           }
//           if ((num1 > 10 || num1 < 0) || (num2 > 10 || num2 < 0)) {
//               throw new IllegalArgumentException();
//           }
//       } catch (RuntimeException e) {
//           throw new IllegalArgumentException("Неверный формат данных");
//       }
//}

//

    //       if (num1 > 0 || num1 < 10) {
        //          num1 = scanner.nextInt();
        //    operation = scanner.next();
        //     num2 = scanner.nextInt();

        //}
//        if (operation.equals("+")) {
//            System.out.println(num1 + num2);
//        }
//        if (operation.equals("-")) {
//            System.out.println(num1 - num2);
//        }
//        if (operation.equals("*")) {
//           System.out.println(num1 * num2);
//        }
//        if (operation.equals("/")) {
//            System.out.println(num1 / num2);
//        }
//   }
//}



// String[] blocks = text.split("[+-/*]");