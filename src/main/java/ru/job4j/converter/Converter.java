package ru.job4j.converter;

public class Converter {
    public static void main(String[] args) {
        float euro = rubleToEuro(140);
        float dollar = rubleToDollar(120);
        System.out.println("140 rubles is " + euro + " euro");
        System.out.println("120 rubles is " + dollar + " dollar");
    }

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }
}
