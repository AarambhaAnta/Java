package com.markblue.javaspeedrun.datatypes;

public class Main {
    public static void main(String[] args) {
        // Primitive Data types
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

        // Widening conversions (implicit in nature)
        System.out.println("Widening Conversion Examples:");
        System.out.println("---------------");
        byte b1 = 127;  // 1 byte
        short s1 = b1;  // 2 bytes
        int i1 = s1;    // 4 bytes
        long l1 = i1;   // 8 bytes
        float f1 = l1;  // 4 bytes
        double d1 = f1; // 8 bytes
        System.out.println("Byte Value: " + b1);
        System.out.println("Short Value: " + s1);
        System.out.println("Integer Value: " + i1);
        System.out.println("Long Value: " + l1);
        System.out.println("Float Value: " + f1);
        System.out.println("Double Value: " + d1);
        System.out.println();

        // Narrowing conversions (explicit in nature)
        System.out.println("Narrowing Conversion Examples:");
        System.out.println("---------------");
        double d2 = 123.456;
        float f2 = (float) d2;  // Narrowing from double to float
        long l2 = (long) f2;    // Narrowing from float to long
        int i2 = (int) l2;      // Narrowing from long to int
        System.out.println("Double Value: " + d2);
        System.out.println("Float Value: " + f2);
        System.out.println("Long Value: " + l2);
        System.out.println("Integer Value: " + i2);
        System.out.println();

        // Non-primitive data type
        // class based implementation
        // Dynamic memory allocation (Heap)
        // String data type
        // Stored in string pool (part of Heap memory)
        // If data are same new pointer points to same data
        // If data are same but memory allocated Dynamically, then new memory is allocated
        System.out.println("String Representation:");
        System.out.println("---------------");

        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println("str1: " + str1);    // A pointer that point to "Hello" in string pool
        System.out.println("str2: " + str2);    // Another pointer pointing to same data "Hello"
        System.out.println("str3: " + str3);    // A new data "Hello" & a new pointer
        System.out.println("String str1 & str2 same: " + (str1 == str2));   // Both pointing to same data
        System.out.println("String str1 & str3 same: " + (str1 == str3));   // Both pointing to different data
        System.out.println("String str1 & str3 equal: " + (str1.equals(str3))); // The value inside both is same
        System.out.println();

        // String Immutability
        System.out.println("String Immutability: ");
        System.out.println("---------------");

        String str4 = "hello";

        str4.toUpperCase(); // Original string doesn't change
        System.out.println("str4: " + str4);    // Doesn't change to upper case

        String str5 = str4.toUpperCase();   // A new string is created having the str4 in uppercase
        System.out.println("str5: " + str5);    // A new string with uppercase value of str4

        str4 = str4.toUpperCase();  // Re-initialized the same string with uppercase value
        System.out.println("str4: " + str4);    // Re-initialized the value of str4

        System.out.println();

        // String Operations
        System.out.println("String Operations: ");
        System.out.println("---------------");

        String text1 = "Hello World";
        System.out.println("text1: " + text1);
        System.out.println("text1 Length: " + text1.length());  // Method to get length of string
        System.out.println("Char at index 0: " + text1.charAt(0));  // Array like indexing
        System.out.println("Sub-string from index 0 to length: " + text1.substring(0, 3));  // Method to get sub-string
        System.out.println("Contains 'World': " + text1.contains("World")); // Method to check presence of sub-string
        System.out.println("Start with 'Hello': " + text1.startsWith("Hello")); // Method to check starting sub-string
        System.out.println("End with 'Hello': " + text1.endsWith("Hello")); // Method to check ending sub-string
        System.out.println("Replace 'World': " + text1.replace("World", "Java"));   // Method to replace sub-string
        System.out.println();
    }
}
