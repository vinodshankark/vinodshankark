package com.company.firstinterface;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Abc obj = new AbcImplement();
        obj.show();
    }
}

interface Abc {
    void show(); // By default it is abstract public
}

class AbcImplement implements Abc {
    public void show() {
        System.out.println("Hello");
    }
}