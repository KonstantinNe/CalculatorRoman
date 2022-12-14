package ru.nemesh;

import ru.nemesh.Exception.*;

public class Check {

    public static int getInt(String a) throws Exception {
        boolean resultNumeric = Numeric(a);

        if (resultNumeric == (true)) {
            int b = Integer.parseInt(a);
            boolean c = NegativeNumber(Integer.parseInt(a));
            if (c == true) {
                throw new NegativeException("Число должно быть положительным!!! Введите положительные числа через пробел и нужный оператор +/*- (пример 2 + 3):");
            } else
                return b;
        } else {
            if (resultNumeric == (false)) ;
            return checkRom(a);
        }
    }

    private static int checkRom(String a) throws Exception {
        String[] mas = a.split("");
        String c = mas[0];
        if (a.equals("I")) return 1;
        if (a.equals("II")) return 2;
        if (a.equals("III")) return 3;
        if (a.equals("IV")) return 4;
        if (a.equals("V")) return 5;
        if (a.equals("VI")) return 6;
        if (a.equals("VII")) return 7;
        if (a.equals("VIII")) return 8;
        if (a.equals("IX")) return 9;
        if (a.equals("X")) return 10;
        if (c.equals("X")) return 20;
        if (c.equals("L")) return 20;
        if (a.equals("XC")) return 90;
        if (c.equals("C")) return 100;
        if (c.equals("D")) return 500;
        if (a.equals("CM")) return 1000;
        throw new SymbolException("Ошибка! Вы ввели символ или букву, необходимо ввести арабские или римские цифры! Или ввели цифры без пробела");

    }

    public static boolean Numeric(String a) {
        try {
            Double.parseDouble(a);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static Calculator getCalc(Calculator calc, String a, String b) {
        try {
            Double.parseDouble(a);
            Double.parseDouble(b);
            calc = new Arab();
            return calc;
        } catch (NumberFormatException e) {
            calc = new Rom();
            return calc;
        }
    }

    private static boolean NegativeNumber(int a) {

        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static String getProbel(String input) throws ProbelException {
        boolean space = containsWhiteSpace(input);
        if (space == true)
            return input;
        else
            throw new ProbelException("Ввод чисел и оператора должен быть через пробел (пример 2 + 3)");
    }

    public static boolean containsWhiteSpace(String input) {
        boolean space = false;
        if (input != null) {
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ') {
                    space = true;
                }
            }
        }
        return space;
    }

    public static String getExit(String input) throws ExitException {
        if (input.equals("Да"))
            return input;

        if (input.equals("Нет"))
            return input;
        else
            throw new ExitException("Введите Да или Нет!");
    }

    public static String getOperation(String operation) throws OperationException {
            if (operation.equals("+"))
            return operation;
            if (operation.equals("-"))
            return operation;
            if (operation.equals("/"))
            return operation;
            if (operation.equals("*"))
            return operation;
            else
                throw new OperationException("Введите оператор (пример +-/*) или пропустили пробел между числои и оператором");
    }


    public static String getResult(String result, String num1, String num2) {

        try {
            Double.parseDouble(num1);
            Double.parseDouble(num2);
            if (num1.equals(true)) ;
            return result;
        } catch (NumberFormatException e) {
            return getUnits(result);
        }
    }

    static String getUnits(String a) {
        String units[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String tens[] = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String hundreds[] = {"C"};
        String arab[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

            String[] mas = a.split("");
            String c = mas[0];
            String e = mas[1];
        String result1 = getTen(c);
        String result2 = getUn(e);
        String result = result1+result2;
        return result;
    }

    static String getTen(String a) {
        if (a.equals("1")) return "X";
        if (a.equals("2")) return "XX";
        if (a.equals("3")) return "XXX";
        if (a.equals("4")) return "XL";
        if (a.equals("5")) return "L";
        if (a.equals("6")) return "LX";
        if (a.equals("7")) return "LXX";
        if (a.equals("8")) return "LXXX";
        if (a.equals("9")) return "XC";
        return a;
    }

    static String getUn(String a) {
        if (a.equals("1")) return "I";
        if (a.equals("2")) return "II";
        if (a.equals("3")) return "III";
        if (a.equals("4")) return "IV";
        if (a.equals("5")) return "V";
        if (a.equals("6")) return "VI";
        if (a.equals("7")) return "VII";
        if (a.equals("8")) return "VIII";
        if (a.equals("9")) return "IX";
        if (a.equals("10")) return "X";
        if (a.equals("0")) return "";
        return a;
    }

    public static String getMas(String a, String b, String c) throws NullnumException {
            String result = null;
            if (a.equals(null))
            if (b.equals(null))
                return result;
            else
                throw new NullnumException("Введите второе число!");
        return result;
    }

}