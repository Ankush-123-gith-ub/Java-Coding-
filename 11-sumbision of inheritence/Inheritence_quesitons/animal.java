
class Animal {
    String name;
    int age;
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    Dog(String n, int a) { super(n, a); }
    @Override
    void makeSound() { System.out.println("Woof Woof"); }
}

class Cat extends Animal {
    Cat(String n, int a) { super(n,a); }
    @Override
    void makeSound() { System.out.println("Meow Meow"); }
}

class Bird extends Animal {
    Bird(String n, int a) { super(n,a); }
    @Override
    void makeSound() { System.out.println("Chirp Chirp"); }
}

public class animalMain {
    public static void main(String[] args) {
        Animal a = new Animal("emma66", 5);
        Dog d = new Dog("mike58", 3);
        Cat c = new Cat("anna98", 2);
        Bird b = new Bird("kate18", 1);
        a.makeSound();
        d.makeSound();
        c.makeSound();
        b.makeSound();
    }
}
