package com.grukan.lesson2;
public class ExampleNumbers {
    public static void main(String[] args) {
// byte, int, short, long

    }
    private static void showChar() {
        char charVar = 215;
        System.out.println(charVar);
        charVar = '\'';
        System.out.println(charVar);
    }
    private static void showBoolean() {
        boolean booleanVar = true;
        System.out.println(booleanVar);
    }
    private static void showFloatAndDouble () {
            double doubleVar = 45.653;
            System.out.println("doubleVar = " + doubleVar);
            float floatVar = 342.56F;
            System.out.println("float = " + floatVar);

            int intVar = 17;
            double newVar = 17 + 0.001;
            System.out.println("newVar = " + newVar);
// may be 17.00001
        }
        private static void showNarrowingCast () {
            int intVar = 17;
//        byte byteVar = intVar; // not allowed

            byte byteVar = (byte) intVar;
            System.out.println("byteVar = " + byteVar);
            //byte: -128..127

            intVar = 128;
            byteVar = (byte) intVar;
            System.out.println("byteVar = " + byteVar);
        }
        private static void showWideningCast () {
            byte byteVar = 17;
            int intVar = (int) byteVar;
            //allowed but useless
            System.out.println("intVar = " + intVar);
        }
        private static void ShowPrimitive () {
            byte byteVar;
            byteVar = 34;
//        byteVar = 34425345432; // not allowed
            System.out.println("byteVar = " + byteVar);

            short shortVar = 5154;
//        shortVar = 15654984612 // not allowed
            System.out.println("shortVar = " + shortVar);

            int intVar = 2147483647;
//        intVar = 21474836471 not allowed
            System.out.println("intVar = " + intVar);

            long LongVar = 5149847563126484621L;
            System.out.println("LongVar = " + LongVar);
        }
    }
