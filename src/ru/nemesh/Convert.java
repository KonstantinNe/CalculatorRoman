package ru.nemesh;

public class Convert {
    static int last = 2000;
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

    //
//    static int convertToArab(String a) {
//        int b;
//
//        if (a.equals("I")) return b = 1;
//        if (a.equals("II")) return b = 2;
//        if (a.equals("III")) return b = 3;
//        if (a.equals("IV")) return b = 4;
//        if (a.equals("V")) return b = 5;
//        if (a.equals("VI")) return b = 6;
//        if (a.equals("VII")) return b = 7;
//        if (a.equals("VIII")) return b = 8;
//        if (a.equals("IX")) return b = 9;
//        if (a.equals("X")) return b = 10;
//        return Integer.parseInt(a);
//    }
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

    public static String romanToRom(int input) {
        if (input < 1 || input > 3999)
            return "Invalid Roman Number Value";
        String s = "";
        while (input >= 1000) {
            s += "M";
            input -= 1000;
        }
        while (input >= 900) {
            s += "CM";
            input -= 900;
        }
        while (input >= 500) {
            s += "D";
            input -= 500;
        }
        while (input >= 400) {
            s += "CD";
            input -= 400;
        }
        while (input >= 100) {
            s += "C";
            input -= 100;
        }
        while (input >= 90) {
            s += "XC";
            input -= 90;
        }
        while (input >= 50) {
            s += "L";
            input -= 50;
        }
        while (input >= 40) {
            s += "XL";
            input -= 40;
        }
        while (input >= 10) {
            s += "X";
            input -= 10;
        }
        while (input >= 9) {
            s += "IX";
            input -= 9;
        }
        while (input >= 5) {
            s += "V";
            input -= 5;
        }
        while (input >= 4) {
            s += "IV";
            input -= 4;
        }
        while (input >= 1) {
            s += "I";
            input -= 1;
        }
        return s;
    }


    static int convertToResult2(String romanNumeral) {
        int integerValue = 0;
        for (int i = 0; i < romanNumeral.length(); i++) {
            int ch = romanNumeral.charAt(i);
            int number = letterToNumber(Character.highSurrogate(ch));
            if (number == -1) {
                return 0;   // throw new NumberFormatException("Invalid format");
            }
            if (last < number)
                number -= last - 1;
            integerValue += number;
            last = number;
        }
        return integerValue;
    }

    private static int letterToNumber(char letter) {
        switch (letter) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1;

        }
    }

    static String convertToResult(String a) {
        int x = Integer.parseInt(a);
        int units = x % 10;
        int tens = (x % 100) / 10;
        int hundreds = (x % 1000) / 100;

        String s_units = "";
        switch (units) {
            case 1:
                s_units = "I";
            case 2:
                s_units = "II";
            case 3:
                s_units = "III";
            case 4:
                s_units = "IV";
            case 5:
                s_units = "V";
            case 6:
                s_units = "VI";
            case 7:
                s_units = "VII";
            case 8:
                s_units = "VIII";
            case 9:
                s_units = "IX";

            String s_tens = "";
            switch (tens) {
                case 1:
                    s_tens = "X";
                case 2:
                    s_tens = "XX";
                case 3:
                    s_tens = "XXX";
                case 4:
                    s_tens = "XL";
                case 5:
                    s_tens = "L";
                case 6:
                    s_tens = "LX";
                case 7:
                    s_tens = "LXX";
                case 8:
                    s_tens = "LXXX";
                case 9:
                    s_tens = "XC";

                String s_hundreds = "";
                switch (hundreds) {
                    case 1:
                        s_hundreds = "C";
                }
                return s_hundreds;
            }


//        if (a.equals("I") || a.equals("M"))
//            return "Invalid Roman Number Value";
//        int s = 0;
//        while (a.equals("M")) {
//            s += 1000;
//            a.equals("M");
//        }
//        while (a.equals("CM")) {
//            s += 900;
//            a.equals("CM");
//        }
//        while (a.equals("D")) {
//            s += 500;
//            a.equals("D");
//        }
//        while (a.equals("CD")) {
//            s += 400;
//            a.equals("CD");
//        }
//        while (a.equals("C")) {
//            s += 100;
//            a.equals("C");
//        }
//        while (input >= 90) {
//            s += "XC";
//            input -= 90;
//        }
//        while (input >= 50) {
//            s += "L";
//            input -= 50;
//        }
//        while (input >= 40) {
//            s += "XL";
//            input -= 40;
//        }
//        while (input >= 10) {
//            s += "X";
//            input -= 10;
//        }
//        while (input >= 9) {
//            s += "IX";
//            input -= 9;
//        }
//        while (input >= 5) {
//            s += "V";
//            input -= 5;
//        }
//        while (input >= 4) {
//            s += "IV";
//            input -= 4;
//        }
//        while (input >= 1) {
//            s += "I";
//            input -= 1;
//        }
//        return s;


            //   public static String convertToResult(String a) {


//    public static int romanToArabic(String input) throws IllegalArgumentException {
//                String romanNumeral = input.toUpperCase();
//                int result = 0;
//
//                List romanNumerals = RomanNumeral.getReverseSortedValues();

            //        int i = 0;

            //          while ((romanNumeral.length() > 0) && (i < romanNumerals.size()) {
            //
//                    RomanNumeral symbol = romanNumerals.get(i);
//                    if (romanNumeral.startsWith(symbol.name())) {
//                        result += symbol.getValue();
//                        romanNumeral = romanNumeral.substring(symbol.name().length());
//                    } else {
//                        i++;
//                    }
            //         }

//                if (romanNumeral.length() > 0) {
//                    throw new IllegalArgumentException(input + " не может быть преобразован в римскую цифру");
//                }
//
//                return result;
//            }


            // https://thecode.media/sobes-roman/?ysclid=layeqr2up9154996180
            //   }
        }
        return s_units;
    }
}