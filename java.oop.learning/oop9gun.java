// Paket tanımı: com.hamza.learnjava paketi
package com.hamza.learnjava;

// Kütüphane importları
import java.io.*;

// Main class tanımı
public class Main {
    public static void main(String[] args) {
        // Dosya yazma örneği
        writeFile("output.txt", "Java IO ile dosya yazma işlemi.");

        // Dosya okuma örneği
        String content = readFile("input.txt");
        System.out.println("Dosya İçeriği:\n" + content);

        // Dosya işleme örneği
        processFile("input.txt");
    }

    // Dosya yazma metodu
    public static void writeFile(String filename, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(content);
            System.out.println("Dosya başarıyla yazıldı: " + filename);
        } catch (IOException e) {
            System.err.println("Dosya yazma hatası: " + e.getMessage());
        }
    }

    // Dosya okuma metodu
    public static String readFile(String filename) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            System.err.println("Dosya okuma hatası: " + e.getMessage());
        }
        return content.toString();
    }

    // Dosya işleme metodu
    public static void processFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            int lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                System.out.println("Satır " + lineNumber + ": " + line);
                lineNumber++;
            }
        } catch (IOException e) {
            System.err.println("Dosya işleme hatası: " + e.getMessage());
        }
    }
}
