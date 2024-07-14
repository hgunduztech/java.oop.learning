// Paket tanımı: com.hamza.learnjava paketi
package com.hamza.learnjava;

// Kütüphane importları
import java.util.*;

// Ana sınıf
public class Main {
    public static void main(String[] args) {
        // Ana program içeriği
        System.out.println("Java'da Paketler ve Erişim Kontrolü Örneği");

        // Paket içi ve dışı sınıfların örnekleri
        InsidePackage insideObj = new InsidePackage();
        insideObj.display();

        OutsidePackage outsideObj = new OutsidePackage();
        outsideObj.display();

        // Erişim kontrolü ve kapsam alanları örnekleri
        AccessExample accessObj = new AccessExample();

        // Public metodu çağırma
        accessObj.publicMethod();

        // Private metodu çağırma (Hata verir, çünkü private)
        // accessObj.privateMethod();

        // Protected metodu çağırma (Hata verir, çünkü farklı paketten erişim yok)
        // accessObj.protectedMethod();
    }
}

// Paket içi sınıfı
class InsidePackage {
    void display() {
        System.out.println("Bu sınıf com.hamza.learnjava paketi içinde.");
    }
}

// Paket dışı sınıfı
class OutsidePackage {
    void display() {
        System.out.println("Bu sınıf com.hamza.learnjava paketi dışında.");
    }
}

// Erişim kontrolü ve kapsam alanları örnek sınıfı
class AccessExample {
    // Public erişim kontrolüne sahip metod
    public void publicMethod() {
        System.out.println("Bu metot public erişim kontrolüne sahip.");
    }

    // Private erişim kontrolüne sahip metod
    private void privateMethod() {
        System.out.println("Bu metot private erişim kontrolüne sahip.");
    }

    // Protected erişim kontrolüne sahip metod
    protected void protectedMethod() {
        System.out.println("Bu metot protected erişim kontrolüne sahip.");
    }
}
