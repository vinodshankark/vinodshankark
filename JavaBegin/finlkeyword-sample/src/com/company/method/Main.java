package com.company.method;

public class Main {

    public static void main(String[] args) {
	// write your code here
        B obj = new B();
        obj.show();
    }
}

class A {
    final public void show(){
        System.out.println("In A");
    }
}
class B extends A { // Cannot override the class

}