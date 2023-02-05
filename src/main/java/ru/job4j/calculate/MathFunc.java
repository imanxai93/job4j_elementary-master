package ru.job4j.calculate;

public class MathFunc {
    public static void main(String[] args) {
        int x = 100;
        int result = MathFunc.func(x);
        System.out.println(result);
    }

    public static int func(int x) {
        return x;
    }
}