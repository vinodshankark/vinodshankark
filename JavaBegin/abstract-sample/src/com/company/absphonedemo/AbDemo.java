package com.company.absphonedemo;

public class AbDemo {
    public static void main(String[] args) {
        Iphone obj = new Iphone();
        show(obj);
        Samsung obj1 = new Samsung();
        show(obj1);
    }
//    public static void show(Iphone obj) {
//        obj.showConfig();
//    }
//    public static void show(Samsung obj) {
//        obj.showConfig();
//    }

    public static void show(Phone ph) {
        ph.showConfig();
    }
}

abstract class Phone {
    public abstract void showConfig();
}

class Iphone extends Phone{
    public void showConfig(){
        System.out.println("Iphone");
    }
}

class Samsung extends Phone{
    public void showConfig(){
        System.out.println("Samsung");
    }
}
