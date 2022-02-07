package com.company;

public class ObjectCounter {
  public static void main(String[] args) {
    NumObj obj = new NumObj();
    NumObj obj1 = new NumObj();
    NumObj obj2 = new NumObj();
    NumObj.showCounter();
    obj2 = new NumObj();
    NumObj.showCounter();
  }
}

class NumObj {
  static int i;
  public NumObj() {
    NumObj.i++;
  }

  public static void showCounter() {
    System.out.println("Object Counter: "+NumObj.i);
  }
}
