package ru.ivanmurzin.mathtrainer;

import java.util.Random;

public class Problem {
    private int result;
    private final Random random = new Random();

    private int getRandom(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }

    public int getResult() {
        return result;
    }

    public String getProblem() {
        int a = getRandom(-50, 50);
        int b = getRandom(0, 50);
        String sign = getRandomSign();
        if (sign.equals("+")) result = a + b;
        else result = a - b;
        return a + sign + b;
    }

    private String getRandomSign() {
        return random.nextBoolean() ? "-" : "+";
    }
}