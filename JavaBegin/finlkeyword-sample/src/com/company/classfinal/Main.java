package com.company.classfinal;

public class Main {

    public static void main(String[] args) {
	// write your code here
        B obj = new B();
    }
}

final class A {
    public void show(){
        System.out.println("In A");
    }
}

class B { // Cannot extend class A

}