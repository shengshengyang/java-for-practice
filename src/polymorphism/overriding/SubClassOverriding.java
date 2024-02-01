package polymorphism.overriding;


class Cat extends Animal {

    @Override
    protected void Hello() {
        System.out.println("cat hello");
    }
}

class Zoo {
    public Animal getOneAnimal() {
        return new Animal();
    }
}

/**
 * 由於cat 也屬於animal 所以 這邊可以 return cat
 * 是由於規則: an override method can also return a subtype
 */
class CatZoo extends Zoo{
    @Override
    public Animal getOneAnimal() {
        return new Cat();
    }
}

/**
 * 選告為Zoo 但 new subtype, 此時因為有override 所以會print cat hello
 */
public class SubClassOverriding {
    public static void main(String[] args) {

        Zoo zoo = new CatZoo();
        zoo.getOneAnimal().Hello();

    }

}
