package ru.nemesh;

public class Arab implements Calculator{

    @Override
    public char plus(int a, int b) { return ((char)(a + b)); }   //поведение с интерфейсом

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