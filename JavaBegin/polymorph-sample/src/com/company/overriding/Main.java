package com.company.overriding;

public class Main {

    public static void main(String[] args) {
	// write your code here
        B obj = new B();
        obj.show();
    }
}

class A {
    public void show() {
        System.out.println("Class A show");
    }
}

class B extends A{
    public void show(){
        System.out.println("class B show");
    }
}

