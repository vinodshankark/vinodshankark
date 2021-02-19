package supertest;

public class MainSuper {
    public static void main(String[] args) {
        B obj = new B();
        B obj1 = new B(4);

    }
}

class A {  //Super class
    public A() {
        System.out.println("In A class");
    }

    public A(int i) {
        System.out.println("In A class int");
    }

}

class B extends A{ //sub class
    public B() {
        System.out.println("In B class");
    }

    public B(int i) {
        super(i); // This to call the parameterized constructor
        System.out.println("In B class int");
    }
}