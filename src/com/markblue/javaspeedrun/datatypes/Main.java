package com.markblue.javaspeedrun.datatypes;

public class Main {
    public static void main(String[] args) {
        // Integral numbers
        // Byte data type (1 byte)
        System.out.println("\nByte Range:");
        System.out.println("---------------");
        byte b = 127;
        System.out.println("Example of byte value: " + b);
        System.out.println("Minimum byte value: " + Byte.MIN_VALUE);    // -128 (8 bits signed)
        System.out.println("Maximum byte value: " + Byte.MAX_VALUE);    // 127 (8 bits signed)
        System.out.println();

        // Short data type (2 bytes)
        System.out.println("Short Range:");
        System.out.println("---------------");
        short s = 2;
        System.out.println("Example of short value: " + s);
        System.out.println("Minimum short value: " + Short.MIN_VALUE);  // -32,768 (16 bits signed)
        System.out.println("Maximum short value: " + Short.MAX_VALUE);  // 32,767 (16 bits signed)
        System.out.println();

        // Integer data type (4 bytes)
        System.out.println("Integer Range:");
        System.out.println("---------------");
        int i = 2;
        System.out.println("Example of int value: " + i);
        System.out.println("Minimum int value: " + Integer.MIN_VALUE);  // -2^31 (32 bits signed)
        System.out.println("Maximum int value: " + Integer.MAX_VALUE);  // 2^31 - 1 (32 bits signed)
        System.out.println();

        // Long data type (8 bytes)
        System.out.println("Long Range:");
        System.out.println("---------------");
        long l = 2L;
        System.out.println("Example of long value: " + l);
        System.out.println("Minimum long value: " + Long.MIN_VALUE);    // -2^63 (64 bits signed)
        System.out.println("Maximum long value: " + Long.MAX_VALUE);    // 2^63 - 1 (64 bits signed)
        System.out.println();

        // Decimal numbers
        // Float data type (4 bytes)
        System.out.println("Float Range:");
        System.out.println("---------------");
        float f = 2.0f; // ~ 7 significant digits
        System.out.println("Example of float value: " + f);
        System.out.println("Smallest positive float value: " + Float.MIN_VALUE);    // 1.4E-45
        System.out.println("Largest positive float value: " + Float.MAX_VALUE); // 3.4028234E38
        System.out.println("Smallest negative float value: " + -Float.MIN_VALUE);   // -1.4E-45
        System.out.println("Largest negative float value: " + -Float.MAX_VALUE);    // -3.4028234E38
        System.out.println();

        // Double data type (8 bytes)
        System.out.println("Double Range:");
        System.out.println("---------------");
        double d = 2.0; // ~ 15 significant digits
        System.out.println("Example of double value: " + d);
        System.out.println("Smallest positive double value: " + Double.MIN_VALUE);  //  4.9E-324
        System.out.println("Largest positive double value: " + Double.MAX_VALUE);   // 1.7976931348623157E308
        System.out.println("Smallest negative double value: " + -Double.MIN_VALUE); // -4.9E-324
        System.out.println("Largest negative double value: " + -Double.MAX_VALUE);  // -1.7976931348623157E308
        System.out.println();

        // Logical data
        // Boolean data type (1 bit)
        System.out.println("Boolean Range:");
        System.out.println("---------------");
        boolean bool = true;
        System.out.println("Example of boolean value: " + bool);
        System.out.println("Smallest boolean value: " + Boolean.FALSE); // false (1 bit)
        System.out.println("Largest boolean value: " + Boolean.TRUE);   // true (1 bit)
        System.out.println();

        // Symbolic data
        // Character data type (2 bytes)
        // JAVA follows UTF-16 character set (16 bits or 2 bytes)
        // Range 0-127 is ASCII character set (8 bits or 1 byte)
        // ASCII is a subset of UTF-16
        System.out.println("Character Range:");
        System.out.println("---------------");
        char c = 'A';   // mapped with integer values between 0-65535
        System.out.println("Example of char value: " + c);
        System.out.println("Smallest char value: " + (int) Character.MIN_VALUE);    // 0 (2 bytes)
        System.out.println("Largest char value: " + (int) Character.MAX_VALUE); // 65535 (2 bytes)
        System.out.println((char) 10084);   // integer 10084 associated with character ❤
        System.out.println();
    }
}
