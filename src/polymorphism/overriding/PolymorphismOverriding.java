package polymorphism.overriding;

class Animal {
    protected void Hello(){
        System.out.println("animal hello");
    }
}

class Dog extends Animal{
    /**
     * 若上方為protected, 此處可以為protected 或 public, 但不能為private
     */
    protected void Hello(){
        System.out.println("dog hello");
    }
}

public class PolymorphismOverriding {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.Hello();
    }
}
