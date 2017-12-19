package com.vladyka.acm;

/**

1006 - Одинадцять

Ліміт часу: 1 секунд
Ліміт пам'яті: 3000 K
Ліміт виведення: 2 K

Завдання
Ваше завдання – визначити чи ділиться дане число на 11.

Вхідні дані
В єдиному рядку записане єдине число N (1 <= n). Число має не більше тисячі знаків.

Вихідні дані
Вам потрібно вивести “Yes” – якщо число ділиться на 11, і “No” – в протилежному випадку.

Приклад введення 1
323455693
Приклад виведення 1
Yes

Приклад введення 2
5038297
Приклад виведення 2
Yes

Приклад введення 3
112234
Приклад виведення 3
No
*/

import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;

public class task1006 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String longNumber = scanner.next();

        int sumNep = 0;
        int sumP = 0;

        for (int i = 0; i < longNumber.length(); i++) {
            int digit = Integer.valueOf(longNumber.substring(i, i + 1));
            if (i % 2 != 0)
                sumP += digit;
            else
                sumNep += digit;
        }
        System.out.println(((sumP - sumNep) % 11 == 0) ? "Yes" : "No");
    }
}


