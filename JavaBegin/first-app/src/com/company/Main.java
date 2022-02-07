package com.company;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {
    String x = "test";
    System.out.println(x);
    x = "Vinod";
    System.out.println(x);
//    String x = "2017-06-04T05:00:06";
//    String[] split = x.split(Pattern.quote("."), 0);
//    String join = null;
//    System.out.println(split.length);
//    if(split.length == 2){
//      StringBuilder t = new StringBuilder(split[1]);
//      while(t.length() < 6){
//        t.append("0");
//      }
//       System.out.println(String.join(".", split[0], t.toString()));
//    }
//    System.out.println("no join");
//    System.out.println(join);
//    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-ddhh:mm:ss.SSSSSS");
//    SimpleDateFormat output = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSSSSS");
//    Date d = sdf.parse("2017-09-20 00:35:44.885006");
//    String formattedTime = output.format(d);
//    System.out.println(formattedTime);

//    String date="2017-06-04T05:00:06.286";
//    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
//    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSS");
//    try{
//      Date parseDate = sdf.parse(date);
//      String output = sdf1.format(parseDate);
//      System.out.println(output);
//    }catch(Exception e) {
//
//    }

//    String floatValue = "10.10";
//    System.out.println(floatValue.contains(".") ? floatValue.replaceAll("0*$","").replaceAll("\\.$","") : floatValue);


//    float difference =  ((float)(111 - 55) / 55) * 100;
//    System.out.println(difference);
//    String x = "";
//    if(x.length() == 0)
//      System.out.println("null");
//    else System.out.println("not null");
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

//    String sentence = "this is vinod";
//    System.out.println("Enter string you want find position");
//    Scanner sc = new Scanner(System.in);
//    String inputString = sc.next();
//    char sentenceChar[] = sentence.toCharArray();
//    char inputChar[] = inputString.toCharArray();
//    System.out.println(inputChar);
//    for (int i = 0; i < sentenceChar.length; i++) {
//      int flag = 0;
//      for (int j = 0; j < inputChar.length; j++) {
//        if (sentenceChar[i + j] == inputChar[j]) {
//          flag = 1;
//        } else {
//          flag = 0;
//          break;
//        }
//      }
//      if (flag == 0) {
//        continue;
//      } else {
//        System.out.println("position " + i);
//        break;
//      }
//
//    }

  }

  private static class Dates {
  }
}
