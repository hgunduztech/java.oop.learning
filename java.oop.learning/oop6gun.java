// Paket tanımı: com.hamza.learnjava paketi
package com.hamza.learnjava;

// Kütüphane importları
import java.util.*;

// Main class tanımı
public class Main {
    public static void main(String[] args) {
        // Single Responsibility Principle (SRP) örneği
        Customer customer = new Customer("John Doe", "john@example.com");
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Customer Email: " + customer.getEmail());

        // Open/Closed Principle (OCP) örneği
        Shape circle = new Circle(5);
        System.out.println("Circle Area: " + circle.area());

        // Liskov Substitution Principle (LSP) örneği
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle Area: " + rectangle.area());

        Square square = new Square(7);
        System.out.println("Square Area: " + square.area());

        // Interface Segregation Principle (ISP) örneği
        Flight flight = new Flight();
        flight.bookFlight();
        flight.selectSeat();
        flight.addBaggage();

        // Dependency Inversion Principle (DIP) örneği
        Database database = new MySQLDatabase();
        Application application = new Application(database);
        application.performDatabaseTasks();
    }
}

// SRP: Customer class, tek bir sorumluluğu olan müşteri bilgilerini tutar.
class Customer {
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

// OCP: Shape class, genişletilmeye açık, değişime kapalı şekilde tasarlanmıştır.
abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// LSP: Rectangle ve Square sınıfları
class Rectangle {
    protected int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int area() {
        return width * height;
    }
}

class Square extends Rectangle {
    public Square(int size) {
        super(size, size);
    }
}

// ISP: FlightBooking, SeatSelection ve BaggageService arayüzleri
interface FlightBooking {
    void bookFlight();
}

interface SeatSelection {
    void selectSeat();
}

interface BaggageService {
    void addBaggage();
}

class Flight implements FlightBooking, SeatSelection, BaggageService {
    @Override
    public void bookFlight() {
        System.out.println("Flight booked.");
    }

    @Override
    public void selectSeat() {
        System.out.println("Seat selected.");
    }

    @Override
    public void addBaggage() {
        System.out.println("Baggage added.");
    }
}

// DIP: Database arayüzü ve MySQLDatabase sınıfı
interface Database {
    void connect();
}

class MySQLDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connected to MySQL database.");
    }
}

// DIP: Application sınıfı, Database bağımlılığını tersine çevirir.
class Application {
    private final Database database;

    public Application(Database database) {
        this.database = database;
    }

    public void performDatabaseTasks() {
        database.connect();
        // Veritabanı işlemleri yapılabilir
    }
}
