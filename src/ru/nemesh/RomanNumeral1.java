package ru.nemesh;

import java.util.Scanner;

public enum RomanNumeral1 {

    I("I", 1), IV("IV", 4), V("V", 5), IX("IX", 9), X("IX", 10), XL("XL", 40), L("L", 50), XC("XC", 90), C("C", 100), CD("CD", 400), D("D", 500), CM("CM", 900), M("M", 1000);

    private int value;
    private String key;

    RomanNumeral1(String key, int value) {
        this.value = value;
    }

    public String getValue(String a) {
        Scanner scanner = new Scanner(System.in);
        try {
            if (a.equals(key)) return a;
        } catch (NumberFormatException e) {
            String input = scanner.nextLine();

        }

        return a;
    }
}
//    public int getValue(){
//        return value;}
//    public String getKey(){
//        return key;}
//    int toInt(key) {
//            for (RomanNumeral1 i: this.values())
//                if (i.getKey.equals(key))
//                    return i.getValue();
//
//            return "";
//        }
//    }




 //   private int b;

//    RomanNumeral1(int b) {
// //       this.b = b;
//    }
//
//    public int getB(String a) {
//        try {
//            Double.parseDouble(a);
//            if(a.equals(b)) return b;
//        } catch (NumberFormatException e) {
//            return calc;
//        }
        // 1.получили строку например String a = VI
        // 2.читаем enum c лево на право, находим самое первое число которое больше VI, это IX (9) и запоминаем которое меньшев в диапазоне, это V
        // 3.сраниваем и отнимаем от 9 наше число 6, получается 3 - тут видимо сравнение как раз с десятками надо делать, правильно?
        // 4.опять сравниваем полученное 3 с enum: но сначало с методом где десятки определяем какая строка (это III), далее сравнива с enum если не найдено снова применяем первый метод (ищем минимум и максимум), это между I и IV, вычитаем от большего и получаем I
        // 5. добавляем его I к запомниному V и получается VI
        //

