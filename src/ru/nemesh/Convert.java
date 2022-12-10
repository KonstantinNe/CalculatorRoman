package ru.nemesh;

public class Convert {
    static String[] Rom = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    static int[] Arab = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    public static int convertToRom(String a) {

        StringBuffer romNumber = new StringBuffer(a);
        int arabNumber = 0, i = 0; // Проверяем переданную строку на наличие символов
        if (romNumber.length() > 0) {
            while (true) {
                do {
                    if (Rom[i].length() <= romNumber.length()) { // Выделяем из строки подстроку и сравниваем со значением из массива Arab
                        if (Rom[i].equals(romNumber.substring(0,
                                Rom[i].length()))) {  // После чего прибавляем число соответствующее индексу элемента римской цифры из массива Arab и удаляем из строки римскую цифру
                            arabNumber += Arab[i];
                            romNumber.delete(0, Rom[i].length());
                            if (romNumber.length() == 0)
                                return arabNumber;
                        } else
                            break;
                    } else
                        break;
                } while (true && romNumber.length() != 0);
                i++;
            }
        }
        return 0;

    }

    static int convertToInt(String a) {
        int b;
        if (a.equals("1")) return b = 1;
        if (a.equals("2")) return b = 2;
        if (a.equals("3")) return b = 3;
        if (a.equals("4")) return b = 4;
        if (a.equals("5")) return b = 5;
        if (a.equals("6")) return b = 6;
        if (a.equals("7")) return b = 7;
        if (a.equals("8")) return b = 8;
        if (a.equals("9")) return b = 9;
        if (a.equals("10")) return b = 10;
        return Integer.parseInt(a);
    }

    static String convertToResult1(String a) {
        if (a.equals("1")) return "I";
        if (a.equals("2")) return "II";
        if (a.equals("3")) return "III";
        if (a.equals("4")) return "IV";
        if (a.equals("5")) return "V";
        if (a.equals("6")) return "VI";
        if (a.equals("7")) return "VII";
        if (a.equals("8")) return "VIII";
        if (a.equals("9")) return "IX";
        if (a.equals("10")) return "X";
        return String.valueOf(a);
    }
}