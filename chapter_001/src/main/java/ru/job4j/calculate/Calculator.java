/**
 * Calculator.
 * @author Kochetova Tatiana (t.kochetova514@gmail.com)
 */
package ru.job4j.calculate;

public class Calculator {
    public static void add(double first, double second) {
        double result = first + second;
        System.out.println(first + "+" + second + "=" + result);
    }

    public static void div(double first, double second) {
        double result = first / second;
        System.out.println(first + "/" + second + "=" + result);
    }

    public static void multiple(double first, double second) {
        double result = first * second;
        System.out.println(first +"*"+second +"="+result);
}
    public static void subtrack(double first, double second) {
        double result = first - second;
        System.out.println(first + "-" + second + "=" + result);
    }
    /**
     * Main.
     * @param args - args.
     */
    public static void main(String[] args) {
        add(1, 1);
        div(4, 2);
        multiple(2,1);
        subtrack(10,5);

    }
}