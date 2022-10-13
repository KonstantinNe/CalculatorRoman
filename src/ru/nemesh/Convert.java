package ru.nemesh;

public class Convert {

    static int convertarab(String a) {

            if (a.equals("I")) return Integer.parseInt("1");     //проверяем в строке римская или нет и конвертируем в арабскую
            if (a.equals("II")) return Integer.parseInt("2");
            if (a.equals("III")) return Integer.parseInt("3");
            if (a.equals("IV")) return Integer.parseInt("4");
            if (a.equals("V")) return Integer.parseInt("5");
            if (a.equals("VI")) return Integer.parseInt("6");
            if (a.equals("VII")) return Integer.parseInt("7");
            if (a.equals("VIII")) return Integer.parseInt("8");
            if (a.equals("IX")) return Integer.parseInt("9");
            if (a.equals("X")) return Integer.parseInt("10");
            System.out.println("Ошибка! Вы ввели символ или букву, необходимо ввести арабские или римские цифры!");
            return Integer.parseInt(a);
        }
    static String convertrom(String a) {

        if (a.equals(1)) return "I";  //конвертируем в римские
        if (a.equals(2)) return "II";
        if (a.equals(3)) return "III";
        if (a.equals(4)) return "IV";
        if (a.equals(5)) return "V";
        if (a.equals(6)) return "VI";
        if (a.equals(7)) return "VII";
        if (a.equals(8)) return "VIII";
        if (a.equals(9)) return "IX";
        if (a.equals(10)) return "X";
        return a;
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