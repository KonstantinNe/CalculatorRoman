package ru.nemesh;

import java.util.Scanner;

import static ru.nemesh.Oper.getOperation;

public class Main {
    public static void main(String[] args) {
        int num1 = Numint.getInt();
        int num2 = Numint.getInt();
        char operation = getOperation();
        int result = Calculations.calc(num1, num2, operation);
        System.out.println("Результат: " + result);
    }
}