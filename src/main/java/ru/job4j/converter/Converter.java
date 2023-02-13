package ru.job4j.converter;

public class Converter {
    public static void main(String[] args) {
        float inEuro = 140;
        float expectedEuro = 2;
        float outEuro = rubleToEuro(inEuro);
        boolean passedEuro = expectedEuro == outEuro;
        System.out.println("140 rubles are 2. Test result : " + passedEuro);

        float inDollar = 120;
        float expectedDollar = 2;
        float outDollar = rubleToDollar(inDollar);
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("120 rubles are 2. Test result : " + passedDollar);
    }

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }
}
