// oop4gun adlı dosyanın içeriği

// Soyut sınıf (Abstract class)
abstract class Animal {
    // Özellikler (fields)
    private String name;
    private int age;

    // Kurucu Metot (Constructor)
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Soyut metot (Abstract method)
    public abstract void makeSound();

    // Soyut olmayan metot (Non-abstract method)
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Arabirim (Interface)
interface Movable {
    void move();
}

// Alt sınıf (subclass) Dog, Animal sınıfından miras alır ve Movable arabirimini uygular
class Dog extends Animal implements Movable {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }

    @Override
    public void move() {
        System.out.println("The dog runs.");
    }
}

// Alt sınıf (subclass) Cat, Animal sınıfından miras alır ve Movable arabirimini uygular
class Cat extends Animal implements Movable {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }

    @Override
    public void move() {
        System.out.println("The cat jumps.");
    }
}

// Ana metod (main method) - programın başlangıç noktası
public class oop4gun {
    public static void main(String[] args) {
        // Dog ve Cat sınıflarından nesneler oluşturma
        Animal myDog = new Dog("Rex", 5);
        Animal myCat = new Cat("Whiskers", 3);

        // Polimorfik davranışları gösteren örnekler
        myDog.displayInfo();
        myDog.makeSound();
        ((Movable) myDog).move();

        myCat.displayInfo();
        myCat.makeSound();
        ((Movable) myCat).move();
    }
}
