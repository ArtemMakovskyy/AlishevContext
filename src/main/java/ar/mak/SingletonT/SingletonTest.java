package ar.mak.SingletonT;
/**
 * @author Neil Alishev
 *
 * Дополнительный материал к 7 уроку в курсе про Spring Framework
 *
 * Пример класса, реализующего паттерн Singleton (англ. Одиночка)
 * Можно будет использовать только один объект класса Lesson7Singleton
 */
public class SingletonTest {
    public static void main(String[] args) {
        Lesson7Singleton first = Lesson7Singleton.getInstance("Hello!");
        Lesson7Singleton second = Lesson7Singleton.getInstance("Goodbye!");

        // true
        System.out.println(first == second);

        // Hello!
        System.out.println(first.getValue());

        // Hello!
        System.out.println(second.getValue());
    }
}