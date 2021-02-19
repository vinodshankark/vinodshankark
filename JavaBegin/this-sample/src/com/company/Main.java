package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        A obj = new A(5);
        obj.show();
    }
}
class A {
    private int x;
    public A(int x) {
        this.x = x;
    }

    public void show(){
        System.out.println(x);
    }
}