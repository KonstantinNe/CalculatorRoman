package ru.nemesh;

public class Arab implements Calculator{

    @Override
    public int plus(int a, int b) {
        return (a + b);
    }

    @Override
    public int minus(int a, int b) {
        return ((char) (a - b));
    }

    @Override
    public int multiply(int a, int b) {
        return ((char) (a * b));
    }

    @Override
    public int divide(int a, int b) {
        return ((char) (a / b));
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
