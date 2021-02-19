package com.company.absdemo;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        MaheshPhone obj = new MaheshPhone(); // cannot instantiate the abstract class
//        obj.call();

        MaheshPhone obj = new SureshPhone(); // cannot instantiate the abstract class
        obj.call();
        obj.dance();
        obj.move();
        obj.cook();
    }
}

abstract class MaheshPhone {
    public void call() {
        System.out.println("Mahesh calling..");
    }

    public abstract void move();

    public abstract void dance();

    public abstract void cook();

}

abstract class VinodPhone extends MaheshPhone {

    @Override
    public void move() {
        System.out.println("Vinod Moving");
    }
}

class SureshPhone extends VinodPhone {

    @Override
    public void dance() {
        System.out.println("Suresh Dance");
    }

    @Override
    public void cook() {
        System.out.println("Suresh cook");
    }
}