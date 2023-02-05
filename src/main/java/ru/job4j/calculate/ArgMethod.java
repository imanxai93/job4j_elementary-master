package ru.job4j.calculate;

public class ArgMethod {
    public static void main(String[] args) {
        String name = "Alakbarli Iman";
        int age = 30;
        ArgMethod.hello(name, age);
    }

    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + ", you age is " + age);
    }
}
