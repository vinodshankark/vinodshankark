package com.company;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //Primitive Datatype
//    byte theByte = -128; // 1 bytes
//    short theShort = 12342; // 2 bytes
//    int theInt = 12125151; // 4 bytes
//    long theLong = 1_212_121_212L; //8 bytes
//    float theFloat = 3.14F; // 6 to 7 decimal digits
//    double theDouble = 3.1456; //15 decimal digits
//    boolean theBool = true;
//    char theChar = 'A';
//
//    System.out.println(theByte);
//    System.out.println(theShort);
//    System.out.println(theInt);
//    System.out.println(theLong);
//    System.out.println(theFloat);
//    System.out.println(theDouble);
//    System.out.println(theBool);
//    System.out.println(theChar);
//
//    //Reference types
//    String name = new String("Vinod");
//    System.out.println(name);

    String sentence = "this is vinod";
    System.out.println("Enter string you want find position");
    Scanner sc = new Scanner(System.in);
    String inputString = sc.next();
    char sentenceChar[] = sentence.toCharArray();
    char inputChar[] = inputString.toCharArray();
    System.out.println(inputChar);
    for (int i = 0; i < sentenceChar.length; i++) {
      int flag = 0;
      for (int j = 0; j < inputChar.length; j++) {
        if (sentenceChar[i + j] == inputChar[j]) {
          flag = 1;
        } else {
          flag = 0;
          break;
        }
      }
      if (flag == 0) {
        continue;
      } else {
        System.out.println("position " + i);
        break;
      }

    }

  }
}
