package com.company.secondinterface;

public class Main {
    public static void main(String[] args) {
        Abc obj = () ->
                System.out.println("In show"); // This is functional interface example
        obj.show();
    }
}
interface Abc {
    void show();
}
interface Xyz extends Abc {

}
interface Yyy extends Abc, Xyz { //Inheritance in interface

}
