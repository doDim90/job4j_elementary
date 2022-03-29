package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 6, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        result = Point.distance(3, 5, 2, 0);
        System.out.println("result (3, 5) to (2, 0) " + result);
        result = Point.distance(0, 4, 1, 20);
        System.out.println("result (0, 4) to (1, 20) " + result);
        result = Point.distance(3, 6, 0, 4);
        System.out.println("result (3, 6) to (0, 4) " + result);
        result = Point.distance(7, 3, 2, 0);
        System.out.println("result (7, 3) to (2, 0) " + result);
    }
}
