package ru.nemesh;

public class Rom implements Calculator{
    @Override
    public int plus(int a, int b) {
        return (a + b);
//        return (Convert.convertrom(String.valueOf(a)) + Convert.convertrom(String.valueOf(b)));
    }

    @Override
    public int minus(int a, int b) {
        return (Convert.convertrom(String.valueOf(a)) - Convert.convertrom(String.valueOf(b)));
    }

    @Override
    public int multiply(int a, int b) {
        return (Convert.convertrom(String.valueOf(a)) * Convert.convertrom(String.valueOf(b)));
    }

    @Override
    public int divide(int a, int b) {
        return (Convert.convertrom(String.valueOf(a)) / Convert.convertrom(String.valueOf(b)));
    }
}
