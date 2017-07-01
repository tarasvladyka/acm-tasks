package com.vladyka.acm.tasks1000_1049;
/**
1000 - Swap

Ліміт часу: 1 секунд
Ліміт пам'яті: 5000 K
Ліміт виведення: 200 K

Завдання

Дано два цілих числа a та b. Написати програму, яка б міняла їхні значення місцями.
Тобто після виконання програми замість а значення b, а замість b - а.

Вхідні дані
В єдиному рядку записано два числа - а та b. (-32000 < a, b < 32000).

Вихідні дані
Вивести в єдиний рядок через пропуск два числа: спочатку b, а потім a.

Приклад введення 1
1 2
Приклад виведення 1
2 1

Приклад введення 2
2 3
Приклад виведення 2
3 2
*/

import java.io.IOException;
import java.util.Scanner;

public class task1000 {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(b + " " + a);
    }
}
