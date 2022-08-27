package ru.nemesh;

import java.util.Scanner;

import static ru.nemesh.ConvertToRoman.convert;

public class Calculator<num> {
    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        ConvertToRoman convert = new ConvertToRoman();
        char operation = getOperation();
        int result = calc(num1, num2, operation);
        System.out.println("Результат: " + result);
    }

    public static int getInt(){
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        int num;
        if(scanner.hasNextLine()){
            num = convert(scanner.nextLine());
        } else {
            num = scanner.nextInt();
        }
        return num;
    }

    public static char getOperation(){
        System.out.println("Введите операцию (+-*/):");
        Scanner scanner = new Scanner(System.in);
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int num1, int num2, char operation){
        int result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }
}