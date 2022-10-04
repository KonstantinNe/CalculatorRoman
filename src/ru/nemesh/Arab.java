package ru.nemesh;

public class Arab implements Calculator{

    @Override
    public int plus(int a, int b) {
        return (a + b);
    }

    @Override
    public String minus(int a, int b) {
        return String.valueOf((char) (a - b));
    }

    @Override
    public String multiply(int a, int b) {
        return String.valueOf((char) (a * b));
    }

    @Override
    public String divide(int a, int b) {
        return String.valueOf((char) (a / b));
    }
}
//    public String plus(String a, String b) {
//        return (a + b);
//    }
//
//    public char minus(String a, String b) {
//        return char (a - b);
//    }
//
//    public char multiply(String a, String b) {
//
//        return (char) (a * b);
//    }
//
//    public char divide(String a, String b) {
//
//        return (char) (a / b);
//    }
