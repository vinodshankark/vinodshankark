package com.company.overloading;

public class Main {

    public static void main(String[] args) {
	// write your code here
        A obj = new A();
        obj.show();
        obj.show(6);
        obj.show(6.1f);
    }
}
class A {
    public void show() {
        System.out.println("Hello");
    }
    public void show(int i) {
        System.out.println("Int show");
    }
    public void show(float i) {
        System.out.println("float show");
    }
}
