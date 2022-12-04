package ru.nemesh;

import java.awt.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public enum RomanNumeral1 {

    I(1), IV(4), V(5), IX(9), X(10), XL(40), L(50), XC(90), C(100), CD(400), D(500), CM(900), M(1000);
    private int b;

    RomanNumeral1(int b) {
        this.b = b;
    }

    public int getB(String a) { // например String a = VI
        // читаем enum c лево на право, находим самое первое число которое больше VI, это IX (9)
        // сраниваем и отнимаем от 9 наше число 6, получается 3
        // опять сравниваем если не найдено снова применяем первый метод (ищем минимум и максимум)
        //

        
        return B;

    }
}