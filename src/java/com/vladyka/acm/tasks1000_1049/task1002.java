package com.vladyka.acm.tasks1000_1049;

/**
 * 1002 - Послідовність Фібоначчі
 * <p>
 * Ліміт часу: 1 секунд
 * Ліміт пам'яті: 5000 K
 * Ліміт виведення: 200 K
 * <p>
 * Завдання
 * <p>
 * Послідовність фібоначчі визначається наступним чином:
 * <p>
 * a0=0;
 * a1=1;
 * ak=ak-1 + ak-2;
 * <p>
 * Для заданого n знайти значення n-го елемента послідовності Фібоначчі (an).
 * <p>
 * Вхідні дані
 * В єдиному рядку записане єдине число N (1 <= N <= 40).
 * <p>
 * Вихідні дані
 * Єдине число - відповідь.
 * <p>
 * Приклад введення 1
 * 1
 * Приклад виведення 1
 * 1
 * <p>
 * Приклад введення 2
 * 5
 * Приклад виведення 2
 * 5
 * <p>
 * Приклад введення 3
 * 8
 * Приклад виведення 3
 * 21
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1002 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        int result = 0;
        if (n == 1)
            result = 1;
        else {
            int prev1 = 1;
            int prev2 = 0;
            for (int i = 1; i < n; i++) {
                result = prev1 + prev2;
                prev2 = prev1;
                prev1 = result;
            }
        }
        System.out.println(result);
    }
}
