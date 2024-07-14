// Üst sınıf (superclass)
public class oop2gun {
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
    }

    // Ana metod (main method) - programın başlangıç noktası
    public static void main(String[] args) {
        // Dog sınıfından bir nesne oluşturma
        Dog dog = new Dog("Rex", 5);
        dog.displayInfo(); // Name: Rex, Age: 5
        dog.makeSound();   // The dog barks.

        // Cat sınıfından bir nesne oluşturma
        Cat cat = new Cat("Whiskers", 3);
        cat.displayInfo(); // Name: Whiskers, Age: 3
        cat.makeSound();   // The cat meows.
    }
}

