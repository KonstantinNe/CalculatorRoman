package ru.nemesh;

import java.io.IOException;

public class Check {
    public static int getInt(String a) {
        boolean resultNumeric = Numeric(a);
        if (resultNumeric == (true)) {
            int b = Integer.parseInt(a);
                try {
                    b = Integer.parseInt(a);
                    if (b < 0) ;
                    //              throw new Exception("Число"+b+"должно быть положительным!!!");
                } catch (Exception e) {
                    //         if (b < 0);
                    //           e.printStackTrace();
                    System.out.println("Число должно быть положительным!!!");
                    //     System.exit(1);
                }
            return b;
        } else {
            if (resultNumeric == (false)) ;
            checkRom(a);
            //          c = Convert.convertToArab(a)
        }
        return 0;
    }

    private static String checkRom(String a) {
        if (a.equals("I")) return "I";     //проверяем в строке римская или нет
        if (a.equals("II")) return "II";
        if (a.equals("III")) return "III";
        if (a.equals("IV")) return "IV";
        if (a.equals("V")) return "V";
        if (a.equals("VI")) return "VI";
        if (a.equals("VII")) return "VII";
        if (a.equals("VIII")) return "VIII";
        if (a.equals("IX")) return "IX";
        if (a.equals("X")) return "X";
        System.out.println("Ошибка! Вы ввели символ или букву, необходимо ввести арабские или римские цифры!");
        return a;

    }

    public static boolean Numeric(String a) {
        try {
            Double.parseDouble(a);    //если число то возвращаем истина/ реализация не правильная, почитать
            return true;
        } catch (NumberFormatException e) {  //если не число то возвращаем ложь
            return false;
        }
    }

    public static Calculator getCalc(Calculator calc, String a, String b) {
        try {
            Double.parseDouble(a);
            Double.parseDouble(b);
            calc = new Arab();
            return calc;
        } catch (NumberFormatException e) {
            calc = new Rom();
            return calc;
        }

//        boolean getNumeric = Numeric(String.valueOf(a));
//        if (a > 0){
//            calc = new Arab();
//            return calc;
//        } else {
//            if (a == 0);
//            calc = new Rom();
//            return calc;
//        }
    }
}
    //      Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < 1; i++) {
//            try {
//                if (a.equals(0)) {
//                    System.err.println("Число должно быть положительным!!!");
//                    break;
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//                System.out.println("Ошибка! Вы ввели символ или букву, необходимо ввести цифру. Возможно Вы ввели римскую цифру, секунду сейчас проверим.....");
//
//                return Integer.parseInt(a);
//            }
//        }
//        return Integer.parseInt(a);
//    }


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
//        if (scanner.nextLine());
//        int a = convert(scanner.nextLine());
//        System.out.println("Все правильно, введена римская цифра");
//        return a;
//            }
//
//    }
//    }
