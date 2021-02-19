package supervariable;

public class MainSuper {
    public static void main(String[] args) {
        B obj = new B();
        obj.abc();


    }
}

class A {  //Super class
    int i = 5;
    public void abc(){
        System.out.println("A class ABC");
    }

}

class B extends A{ //sub class
    int i = 4;
    public B() {
        System.out.println(super.i);
        System.out.println(i);
    }
    public void abc(){
        // To call Class A abc
        super.abc();
        System.out.println("B class ABC");
    }

}