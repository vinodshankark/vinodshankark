package com.company;

public class StaticDemo {
  public static void main(String[] args) {
    StaticAbc.show();
  }
}

class StaticAbc {
  static public void show() {
    System.out.println("static method");
  }
}
