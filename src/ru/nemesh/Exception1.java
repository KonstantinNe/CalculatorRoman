package ru.nemesh;

import java.io.IOException;

public class Exception1 extends Exception {

    public Exception1 (String message) {
        super(message);
    }
}

    





//    private String a;
//
//    public int getException() throws Exception {
//        Check reader = new Check();
//        int b = Integer.parseInt(a);
//        try {
//            b = reader.getInt(a);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            System.out.println("Число должно быть положительным!!!");
//        } finally {
//            System.out.println("Inside bloсk finally");
//        }
//////        if (b < 0) ;
//////        throw new Exception("Число должно быть положительным!!!");
//////    }
////        return b;
////    }
////}
