package ru.nemesh;

import java.util.Scanner;

public class Calculations {

    public int calc(int num1, int num2, char operation) {
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
                result = calc(num1, num2, Oper.getOperation());
                return result;
        }
        return result;
    }
}