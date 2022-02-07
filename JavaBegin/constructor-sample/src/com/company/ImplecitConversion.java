package com.company;

// method with double is called even if the object is create with int variable
public class ImplecitConversion {
  public static void main(String[] args) {
    ImplecitA obj = new ImplecitA(5);

  }
}

class ImplecitA {
  public ImplecitA() {
    System.out.println("In class A");
  }
//  public ImplecitA(int i) {
//    System.out.println("In class A Int");
//  }
  public ImplecitA(double i) {
    System.out.println("In Class A Double");
  }
}

