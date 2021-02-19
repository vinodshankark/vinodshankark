package com.company.inheritance;

public class Main {

    public static void main(String[] args) {
       AddSubMul obj = new AddSubMul();
        obj.num1 = 5;
        obj.num2 = 4;
        obj.sum();
        System.out.println(obj.result);
        obj.sub();
        System.out.println(obj.result);
        obj.mul();
        System.out.println(obj.result);
    }
}

class Add { //Parent, Super, Base
    int num1;
    int num2;
    int result;

    public void sum() {
        result = num1 + num2;
    }
}

class AddSub extends Add { // Child sub, derived, Single level

    public void sub() {
        result = num1 - num2;
    }
}

class AddSubMul extends AddSub { //Multi level inheritance
    public void mul() {
        result = num1 * num2;
    }
}