package com.company;

public class ObjectCounter {
  public static void main(String[] args) {
    NumObj obj = new NumObj();
    NumObj obj1 = new NumObj();
    obj.counter();
  }
}

class NumObj {
  static int i;

  public NumObj() {
    i++;
  }

  public void counter() {
    System.out.println(i);
  }
}
