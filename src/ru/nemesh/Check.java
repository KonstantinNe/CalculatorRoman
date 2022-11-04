package ru.nemesh;

public class Check {

    public static int getInt(String a) throws Exception {
        boolean resultNumeric = Numeric(a);

        if (resultNumeric == (true)) {
           int b = Integer.parseInt(a);
                    if (b < 0) {
                    throw new Exception("Число должно быть положительным!!!");
                    }
            return b;
        } else {
            if (resultNumeric == (false)) ;
            int c = checkRom(a);
            return c;
            //          c = Convert.convertToArab(a)
        }
    }

    private static int checkRom(String a) throws Exception {
        int b = 1;
        if (a.equals("I")) return b;
        b = 2;
        if (a.equals("II")) return b;
        b = 3;
        if (a.equals("III")) return b;
        b = 4;
        if (a.equals("IV")) return b;
        b = 5;
        if (a.equals("V")) return b;
        b = 6;
        if (a.equals("VI")) return b;
        b = 7;
        if (a.equals("VII")) return b;
        b = 8;
        if (a.equals("VIII")) return b;
        b = 9;
        if (a.equals("IX")) return b;
        b = 10;
        if (a.equals("X")) return b;
        throw new Exception("Ошибка! Вы ввели символ или букву, необходимо ввести арабские или римские цифры!");

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


        //           for (int i = 1; i <= 10; i++) {
//                try {
        //                } catch (NullPointerException e) {
//                    System.out.println(e.getMessage());
//                    System.out.println("Число должно быть положительным!!!");
//                }
//            }


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
