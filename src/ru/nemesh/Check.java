package ru.nemesh;

public class Check {
        public static int getInt(String a) {
                 try {
                    boolean resultNumeric = Numeric(a);
                    if (a == String.valueOf(true));
                    int b = Integer.parseInt(a);
                return b;
            } catch (NumberFormatException e) { //ошибка если строка не число, отправляем в convert
                Convert.checkRom(a);         //проверяем есть ли римские в строке
                     if (a.equals(false));
                     String c = a;
                return Integer.parseInt(c);   // если вернулась римская с конверта, возвращаем в Main-num1,num2
            }
        }

            public static boolean Numeric(String a) {
            try {
                Double.parseDouble(a);    //если число то возвращаем истина/ реализация не правильная, почитать
                return true;
            } catch (NumberFormatException e) {  //если не число то возвращаем ложь
                return false;
            }
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
