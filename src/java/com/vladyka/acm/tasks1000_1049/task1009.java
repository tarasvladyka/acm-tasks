package com.vladyka.acm.tasks1000_1049;

/**
1009 - Супер карти

Ліміт часу: 1 секунд
Ліміт пам'яті: 3000 K
Ліміт виведення: 2 K

Завдання

Дана колода впорядкованих супер карт від 1 до n.
Верхня супер карта має номер 1, нижня – n.
Поки в колоді є хоча б дві супер карти викидаємо верхню карту,
а наступну ставимо вниз колоди.
Необхідно знайти номер супер карти, що залишиться.

Вхідні дані
В єдиному рядку записане єдине число N - число супер карт в колоді (1 <= n <= 1000000).

Вихідні дані
Єдине чиcло - номер супер карти, що залишиться.

Приклад введення 1
7
Приклад виведення 1
6

Приклад введення 2
19
Приклад виведення 2
6

Приклад введення 3
10
Приклад виведення 3
4

Приклад введення 4
6
Приклад виведення 4
4
*/

import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class task1009 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList<Integer> list = new LinkedList<Integer>();

        for (int i = 1; i <= n; i++) list.add(i);

        while (list.size() != 1) {
            list.removeFirst();
            int first = list.removeFirst();
            list.add(first);
        }
        System.out.println(list.get(0));
    }
}




















