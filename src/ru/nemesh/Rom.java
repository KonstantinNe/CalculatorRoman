package ru.nemesh;

public class Rom implements Calculator{
    @Override
    public int plus(String a, String b) {
        int c = (Convert.convertToArab(a) + Convert.convertToArab(b));
  //    int result = (Convert.convertToArab(a) + Convert.convertToArab(b));
  //    String c = Convert.convertToRom(result);
      return c;
    }

    @Override
    public int minus(String a, String b) {
        int c = (Convert.convertToArab(a) - Convert.convertToArab(b));
        return c;
    }

    @Override
    public int multiply(String a, String b) {
        int c = (Convert.convertToArab(a) * Convert.convertToArab(b));
        return c;
    }

    @Override
    public int divide(String a, String b) {
        int c = (Convert.convertToArab(a) / Convert.convertToArab(b));
        return c;
    }
}
