package ru.Job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

    }


    public static void main(String[] args) {

        double result = distance(3, 5, 9, 4);

        System.out.println("result (3, 5) to (9, 4) = " + result);
        double result1 = distance(2, 3, 4, 5);
        System.out.println("result (2, 3) to (4, 5) = " + result1);

    }
}
