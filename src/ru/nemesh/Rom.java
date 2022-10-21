package ru.nemesh;

public class Rom implements Calculator{
    @Override
    public char plus(int a, int b) {
        return ((char)(a + b));
      //  return (char) (Convert.convertToArab(String.valueOf(a)) + Convert.convertToArab(String.valueOf(b)));
    }

    @Override
    public int minus(int a, int b) {
        return (Convert.convertToArab(String.valueOf(a))) - Convert.convertToArab(String.valueOf(b));
    }

    @Override
    public int multiply(int a, int b) {
        return (Convert.convertToArab(String.valueOf(a)) * Convert.convertToArab(String.valueOf(b)));
    }

    @Override
    public int divide(int a, int b) {
        return (Convert.convertToArab(String.valueOf(a)) / Convert.convertToArab(String.valueOf(b)));
    }
}
