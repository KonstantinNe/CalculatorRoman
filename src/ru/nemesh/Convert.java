package ru.nemesh;

public class Convert {

    static String convertrom(String arab) {

        if (arab.equals("1")) return "I";
        if (arab.equals("2")) return "II";
        if (arab.equals("3")) return "III";
        if (arab.equals("4")) return "IV";
        if (arab.equals("5")) return "V";
        if (arab.equals("6")) return "VI";
        if (arab.equals("7")) return "VII";
        if (arab.equals("8")) return "VIII";
        if (arab.equals("9")) return "IX";
        if (arab.equals("10")) return "X";
        return null;
    }
}
