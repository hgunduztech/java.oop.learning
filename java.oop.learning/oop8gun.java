// Paket tanımı: com.hamza.learnjava paketi
package com.hamza.learnjava;

// Main class tanımı
public class Main {
    public static void main(String[] args) {
        try {
            // İstisna yaratabilecek bir metod çağrısı
            int result = divideNumbers(10, 0);
            System.out.println("Result: " + result); // Bu satır çalışmayacak
        } catch (ArithmeticException ex) {
            System.out.println("Hata: Sayı sıfıra bölünemez!");
        } finally {
            System.out.println("İstisna işleme tamamlandı.");
        }

        // Diğer işlemler devam edebilir
        System.out.println("Program devam ediyor...");
    }

    // İstisna yaratabilecek bir metod tanımı
    public static int divideNumbers(int numerator, int denominator) {
        return numerator / denominator;
    }
}
