// oop3gun adlı dosyanın içeriği

public class oop3gun {
    // Üst sınıf (superclass)
    public static class Animal {
        // Özellikler (fields)
        private String name;
        private int age;

        // Kurucu Metot (Constructor)
        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Metotlar (methods)
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void displayInfo() {
            System.out.println("Name: " + name + ", Age: " + age);
        }

        public void makeSound() {
            System.out.println("This animal makes a sound.");
        }

        // Metot Aşırı Yükleme (Method Overloading)
        public void eat() {
            System.out.println("This animal eats food.");
        }

        public void eat(String food) {
            System.out.println("This animal eats " + food + ".");
        }
    }

    // Alt sınıf (subclass) Dog, Animal sınıfından miras alır
    public static class Dog extends Animal {
        public Dog(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeSound() {
            System.out.println("The dog barks.");
        }

        @Override
        public void eat(String food) {
            System.out.println("The dog eats " + food + ".");
        }
    }

    // Alt sınıf (subclass) Cat, Animal sınıfından miras alır
    public static class Cat extends Animal {
        public Cat(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeSound() {
            System.out.println("The cat meows.");
        }

        @Override
        public void eat(String food) {
            System.out.println("The cat eats " + food + ".");
        }
    }

    // Ana metod (main method) - programın başlangıç noktası
    public static void main(String[] args) {
        // Polimorfik davranışları gösteren örnekler
        Animal myAnimal = new Animal("Generic Animal", 5);
        Animal myDog = new Dog("Rex", 5);
        Animal myCat = new Cat("Whiskers", 3);

        // Metotların çağrılması
        myAnimal.makeSound(); // This animal makes a sound.
        myDog.makeSound();    // The dog barks.
        myCat.makeSound();    // The cat meows.

        // Metot aşırı yükleme (method overloading)
        myAnimal.eat();            // This animal eats food.
        myAnimal.eat("meat");      // This animal eats meat.
        myDog.eat("bone");         // The dog eats bone.
        myCat.eat("fish");         // The cat eats fish.

        // Polimorfik davranış
        Animal[] animals = {myAnimal, myDog, myCat};
        for (Animal animal : animals) {
            animal.displayInfo();
            animal.makeSound();
        }
    }
}
