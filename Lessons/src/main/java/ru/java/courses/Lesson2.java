package ru.java.courses;

import java.lang.reflect.Array;
import java.util.Arrays;

class Lesson2 {

    /**
     * Нужно реализовать формулу y = √(13x + 13/x)
     * Подсказка: квадратный корень вычисляется функцией Math.sqrt()
     *
     * @param x на текущем этапе входное значение будет больше нуля
     *
     * @return возвращаем только целую часть от полученного результата,
     * хвост отбрасываем без откругления
     */
    static int formula(int x) {
        return (int) Math.sqrt(13 * x + (double) 13/x);
    }

    /**
     * Нужно привести строку с полным именем к инициалам.
     * Например, "Иванов Петр Александрович" → "И.П.А."
     * Подсказка:
     * разделение строки на части: .split(" ");
     * получение символа на определенной позиции: .charAt();
     * приведение к верхнему регистру: .toUpperCase();
     *
     * @param fullName на текущем этапе имена будут состоять из имени, фамили и отчества, разделяться пробелами.
     *                 Регистр букв во входном параметре может быть любым.
     *
     * @return возвращаем инициалы в верхнем регистре разделенные точкой, как в примере выше
     */
    static String initials(String fullName) {
/*        String[] str = fullName.trim().split(" ");
        return Array.get(str, 0).toString().toUpperCase().charAt(0) + "." +
                Array.get(str, 1).toString().toUpperCase().charAt(0) + "." +
                Array.get(str, 2).toString().toUpperCase().charAt(0) + ".";*/

        return String.join("", Arrays.stream(fullName.trim().split(" "))
                .map(string -> string.toUpperCase().charAt(0) + ".").toArray(String[]::new));
    }
}
