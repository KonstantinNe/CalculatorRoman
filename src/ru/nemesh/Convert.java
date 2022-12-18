package ru.nemesh;

public class Convert {
    static String[] Rom = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    static int[] Arab = {100, 90, 50, 40, 10, 9, 5, 4, 1};

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
        if (a.equals("1")) return 1;
        if (a.equals("2")) return 2;
        if (a.equals("3")) return 3;
        if (a.equals("4")) return 4;
        if (a.equals("5")) return 5;
        if (a.equals("6")) return 6;
        if (a.equals("7")) return 7;
        if (a.equals("8")) return 8;
        if (a.equals("9")) return 9;
        if (a.equals("10")) return 10;
        return Integer.parseInt(a);
    }
}