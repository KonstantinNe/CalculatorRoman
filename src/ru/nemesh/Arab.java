package ru.nemesh;

public class Arab implements Calculator{

    @Override
    public char plus(int a, int b) {
        return (char) (a + b);
    }

    @Override
    public char minus(int a, int b) {
        return (char) (a - b);
    }

    @Override
    public char multiply(int a, int b) {
        return (char) (a * b);
    }

    @Override
    public char divide(int a, int b) {
        return (char) (a / b);
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
