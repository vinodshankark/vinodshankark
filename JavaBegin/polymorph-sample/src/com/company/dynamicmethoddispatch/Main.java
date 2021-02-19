package com.company.dynamicmethoddispatch;

public class Main {

    public static void main(String[] args) {
	// Run time polymorphism
        A obj = new A();
        B obj1 = new B();
        A a;
        a =obj1;
        a.show();
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

