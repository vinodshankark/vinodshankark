package com.company;

public class ClassBasicDemo {

  public static void main(String[] args) {
    Abc obj = new Abc(12, 12335f);
    obj = new Abc();
  }

}

class Abc {
  public Abc() {
    System.out.println("In Abc");
  }

  public Abc(int i) {
    System.out.println(i + " in Abc Int");
  }

  public Abc(int i, float j) {
    System.out.println(i + " in Abc long" + j);
  }
}
