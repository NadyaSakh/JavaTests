package lesson1_0;

/**
 * Даны два ненулевых числа.
 * Написать методы, возвращающие сумму, разность,
 * произведение и частное их квадратов
 */
public class Solution1_0 {
    public double sum(double a, double b) {
        return a * a + b * b;
    }

    public double sub(double a, double b) {
        return a * a - b * b;
    }

    public double mull(double a, double b) {
        return a * a * b * b;
    }

    public double div(double a, double b) {
        return (a * a) / (b * b);
    }
}
