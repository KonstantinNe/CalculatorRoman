package ru.nemesh.Util;

import ru.nemesh.Interface.Calculator;

public class Arab implements Calculator {

    @Override
    public int plus(String a, String b) { return (Convert.convertToInt(a) + Convert.convertToInt(b)); }

    @Override
    public int minus(String a, String b) {
        return (Convert.convertToInt(a) - Convert.convertToInt(b));
    }

    @Override
    public int multiply(String a, String b) {
        return (Convert.convertToInt(a) * Convert.convertToInt(b));
    }

    @Override
    public int divide(String a, String b) {
        return (Convert.convertToInt(a) / Convert.convertToInt(b));
    }

}