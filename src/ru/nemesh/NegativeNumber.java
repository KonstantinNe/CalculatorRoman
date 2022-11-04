package ru.nemesh;

public class NegativeNumber {
    public Number find(boolean a) throws Exception1 {
        if (a = false) {
        return new Number() {
            @Override
            public int intValue() {
                return 0;
            }

            @Override
            public long longValue() {
                return 0;
            }

            @Override
            public float floatValue() {
                return 0;
            }

            @Override
            public double doubleValue() {
                return 0;
            }
        };
        } else {
            throw new Exception1("Число должно быть положительным!!!");
        }
    }
}