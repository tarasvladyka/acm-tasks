package com.vladyka.acm.tasks1000_1049.task1007;
/**
1007 - Супер послідовність

Ліміт часу: 1 секунд
Ліміт пам'яті: 3000 K
Ліміт виведення: 2 K

Завдання

Послідовність чисел a1, a2, … an називається супер послідовністю, якщо виконуються наступні умови:

0 < a1 < a2 < … < an
жодне з чисел не є сумою двох або більше інших чисел
Вхідні дані

В єдиному рядку записане число N (1 <= n <= 50), далі задано N чисел, кожне з яких не менше 1 і не більше 1000.

Вихідні дані

Вам необхідно вивести “Yes” – якщо дано супер послідовність, “No” – в протилежному випадку.

Приклад введення 1

2 1 2
Приклад виведення 1

Yes

Приклад введення 2

3 1 2 3
Приклад виведення 2

No

Приклад введення 3

10 1 3 16 19 25 70 100 243 245 306
Приклад виведення 3

No
*/


import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SequenceProvider provider = new SequenceProvider();
        int amount = SequenceProvider.scanner.nextInt();

        List<Integer> sequence = provider.provide(amount);
        TaskSolver solver = new TaskSolver(sequence);

        System.out.println(sequence);

        long start = System.currentTimeMillis();
        solver.solve();
        System.out.println("time = " + (System.currentTimeMillis() - start) + " ms");
    }
}