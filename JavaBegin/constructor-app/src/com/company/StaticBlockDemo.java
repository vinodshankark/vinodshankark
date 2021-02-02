package com.company;

public class StaticBlockDemo {
  static String s = "";

  static {
    s = "Hello";
    System.out.println("in static");
  }

  static {
    System.out.println("bye " + s);
  }

  public static void main(String[] args) {
    System.out.println("In Main");
  }
}
