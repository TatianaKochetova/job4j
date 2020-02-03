package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        boolean exist = ab+ac > bc&& ac+bc > ab&& bc + ab > ac ? true : false;

    return exist;
}
}
