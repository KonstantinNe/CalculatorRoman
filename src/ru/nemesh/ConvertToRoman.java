package ru.nemesh;

import java.util.Scanner;

public class ConvertToRoman implements Rom {
    public static int convertr(String a) {

        if (a.equals("I")) return 1;
        if (a.equals("II")) return 2;
        if (a.equals("III")) return 3;
        if (a.equals("IV")) return 4;
        if (a.equals("V")) return 5;
        if (a.equals("VI")) return 6;
        if (a.equals("VII")) return 7;
        if (a.equals("VIII")) return 8;
        if (a.equals("IX")) return 9;
        if (a.equals("X")) return 10;
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
