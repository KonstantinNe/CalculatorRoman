package ru.nemesh;

public class ConvertToArab implements Arab {
    public static int converta(String a) {

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
        return 0;
    }
}
