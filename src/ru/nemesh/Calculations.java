package ru.nemesh;

import java.util.Scanner;

import static ru.nemesh.Oper.getOperation;

public class Calculations {

    public static int calc(int num1, int num2, char operation) {
        Scanner scanner = new Scanner(System.in);
        int result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Ошибка");
                result = calc(num1, num2, getOperation());
                return result;
        }
        return result;
    }
}