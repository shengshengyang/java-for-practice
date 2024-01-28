package polymorphism.superclass.src;

class A {
    public void hi() {
        System.out.println("hi");
    }
}

class B extends A {
    public void hello() {
        System.out.println("hello");
    }
}

public class SuperClass {
    public static void main(String[] args) {
        A aObject = new B();
        // this will go can't resolve
//        aObject.hello();
        // casting
        ((B)aObject).hello();

        aObject.hi();
    }

}
