package ru.nemesh;

import java.util.Scanner;

import static ru.nemesh.Oper.getOperation;


public class Main {
    public static void main(String[] args) {
        int num1 = Numint.getInt();
        int num2 = Numint.getInt();
        char operation = getOperation();
        int result = calc(num1, num2, operation);
        System.out.println("Результат: " + result);
    }

    public static int calc(int num1, int num2, char operation) {
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