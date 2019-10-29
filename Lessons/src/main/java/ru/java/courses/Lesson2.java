package ru.java.courses;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.params.shadow.com.univocity.parsers.conversions.Conversions.toUpperCase;

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
    /**
    *Простейшая запись:
    */
/*        String[] str = fullName.trim().split(" ");
        return  (str[0].charAt(0) + "." + str[1].charAt(0) + "." + str[2].charAt(0) + ".").toUpperCase();*/
    /**
     *Функциональная запись для изначального типа данных:
     */
/*        return String.join("", Arrays.stream(fullName.trim().split(" "))
                .map(string -> string.toUpperCase().charAt(0) + ".").toArray(String[]::new));*/
    /**
     *Функциональная запись с проверками:
     */
    String trash = "1234567890!@#$%^&*()_+-={}[]\"'|<>,.?/\\:";
    return String.join("", Arrays.stream(fullName.trim().split(" "))
            .map(string -> {
                try{
                    if(trash.indexOf(string.charAt(0)) == -1){
                        return ((string.charAt(0)) + ".").toUpperCase();
                    }
                    else return "";
                } catch (Exception e) {
                    return "";
                }
            }).toArray(String[]::new));
    }

}
