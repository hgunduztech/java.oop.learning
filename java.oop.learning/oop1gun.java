// oop1gun adlı dosyanın içeriği

public class oop1gun {
    // İç sınıf Person
    public static class Person {
        // Özellikler (fields)
        private String name;
        private int age;

        // Kurucu Metot (Constructor)
        public Person(String name, int age) {
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
    }

    // Ana metod (main method) - programın başlangıç noktası
    public static void main(String[] args) {
        // Person sınıfından bir nesne oluşturma
        Person person1 = new Person("Azat", 30);

        // Nesne özelliklerine erişim ve metotları çağırma
        person1.displayInfo(); // Name: Azat, Age: 30

        // Özellikleri güncelleme
        person1.setName("Hamza");
        person1.setAge(25);
        
        // Güncellenmiş bilgileri gösterme
        person1.displayInfo(); // Name: Hamza, Age: 25
    }
}
