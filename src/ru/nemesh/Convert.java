package ru.nemesh;

public class Convert {

    static int convertToArab(String a) {
        int b;

        if (a.equals("I")) return b = 1;
        if (a.equals("II")) return b = 2;
        if (a.equals("III")) return b = 3;
        if (a.equals("IV")) return b = 4;
        if (a.equals("V")) return b = 5;
        if (a.equals("VI")) return b = 6;
        if (a.equals("VII")) return b = 7;
        if (a.equals("VIII")) return b = 8;
        if (a.equals("IX")) return b = 9;
        if (a.equals("X")) return b = 10;
        return Integer.parseInt(a);
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

    static String convertToRom(int a) {
        String b = String.valueOf(a);
        if (a == 1) return b = "I";
        if (a == 2) return b = "II";
        if (a == 3) return b = "III";
        if (a == 4) return b = "IV";
        if (a == 5) return b = "V";
        if (a == 6) return b = "VI";
        if (a == 7) return b = "VII";
        if (a == 8) return b = "VIII";
        if (a == 9) return b = "IX";
        if (a == 10) return b = "X";
        return String.valueOf(a);
    }
}
