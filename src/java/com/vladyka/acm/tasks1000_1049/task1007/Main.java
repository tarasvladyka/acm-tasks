package com.vladyka.acm.tasks1000_1049.task1007;
/**
 * 1007 - Супер послідовність
 * <p>
 * Ліміт часу: 1 секунд
 * Ліміт пам'яті: 3000 K
 * Ліміт виведення: 2 K
 * <p>
 * Завдання
 * <p>
 * Послідовність чисел a1, a2, … an називається супер послідовністю, якщо виконуються наступні умови:
 * <p>
 * 0 < a1 < a2 < … < an
 * жодне з чисел не є сумою двох або більше інших чисел
 * Вхідні дані
 * <p>
 * В єдиному рядку записане число N (1 <= n <= 50), далі задано N чисел, кожне з яких не менше 1 і не більше 1000.
 * <p>
 * Вихідні дані
 * <p>
 * Вам необхідно вивести “Yes” – якщо дано супер послідовність, “No” – в протилежному випадку.
 * <p>
 * Приклад введення 1
 * <p>
 * 2 1 2
 * Приклад виведення 1
 * <p>
 * Yes
 * <p>
 * Приклад введення 2
 * <p>
 * 3 1 2 3
 * Приклад виведення 2
 * <p>
 * No
 * <p>
 * Приклад введення 3
 * <p>
 * 10 1 3 16 19 25 70 100 243 245 306
 * Приклад виведення 3
 * <p>
 * No
 */


import java.util.List;

public class Main {
    public static void main(String[] args) {
        SequenceProvider provider = new SequenceProvider();
        List<Integer> sequence = provider.fromRandom(20);

        TaskSolver solver = new TaskSolver(sequence);
        System.out.println(sequence);

        long start = System.currentTimeMillis();
        solver.solve();
        System.out.println("time = " + (System.currentTimeMillis() - start) + " ms");
    }
}