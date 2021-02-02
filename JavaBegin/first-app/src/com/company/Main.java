package com.company;

public class Main {

    public static void main(String[] args) {
        //Primitive Datatype
        byte theByte = -128; // 1 bytes
        short theShort = 12342; // 2 bytes
        int theInt = 12125151; // 4 bytes
        long theLong = 1_212_121_212L; //8 bytes
        float theFloat = 3.14F; // 6 to 7 decimal digits
        double theDouble = 3.1456; //15 decimal digits
        boolean theBool = true;
        char theChar = 'A';

        System.out.println(theByte);
        System.out.println(theShort);
        System.out.println(theInt);
        System.out.println(theLong);
        System.out.println(theFloat);
        System.out.println(theDouble);
        System.out.println(theBool);
        System.out.println(theChar);

        //Reference types
        String name = new String("Vinod");
        System.out.println(name);
    }
}
