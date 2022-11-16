package ru.nemesh;

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
        int b;
        //       if (a.equals("I")) return Integer.parseInt("I");
        //      if (a.equals("II")) return Integer.parseInt("II");
        if (a.equals("I")) return b = 1;
        if (a.equals("II")) return b = 2;
        if (a.equals("III")) return b = 3;
        if (a.equals("IV")) return b = 4;
        if (a.equals("V")) return b = 5;
        if (a.equals("VI")) return b = 6;
        if (a.equals("VII")) return b = 7;
        if (a.equals("VIII")) return b = 8;
        if (a.equals("IX")) return b = 9;
        if (a.equals("X")) return b = 10;
        throw new SymbolException("Ошибка! Вы ввели символ или букву, необходимо ввести арабские или римские цифры! Или ввели цифры без пробела");

    }

    public static boolean Numeric(String a) {
        try {
            Double.parseDouble(a);    //если число то возвращаем истина/ реализация не правильная, почитать
            return true;
        } catch (NumberFormatException e) {  //если не число то возвращаем ложь
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

    public static String getProbel(String d) throws ProbelException {
        if (d.equals(" ")){
        throw new ProbelException("Ввод чисел и оператора должен быть через пробел (пример 2 + 3)");
        } else
            return d;
    }

    public static String getExit(String input) throws ExitException {
        if (input.equals("Да"))
            return input;
            //throw new ExitException("Введите Да или Нет!");
        if(input.equals("Нет"))
            return input;
        else
            throw new ExitException("Введите Да или Нет!");
        }

    }
