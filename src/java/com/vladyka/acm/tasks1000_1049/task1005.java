package com.vladyka.acm.tasks1000_1049;
/**
1005 - 0-1 проблема

Ліміт часу: 1 секунд
Ліміт пам'яті: 3000 K
Ліміт виведення: 2 K

Завдання

Над рядочком 01 виконаємо наступні операції:

Скопіюємо в кінець рядочка самого себе (отримаємо 0101)
В другій половині рядка всі 0 змінимо на 1, а всі 1 на 0 (отримаємо 0110)
Над рядочком 0110 виконаємо ті самі операції. Отримаємо 01101001. І т. д.
Таким чином отримаємо нескінченний рядочок нулів та одиниць.Ваше завдання – знайти n-тий символ такого рядочка.

Вхідні дані
В єдиному рядку записане єдине число N (1 <= N <= 2000000000).

Вихідні дані
Єдиний символ, який буде на N-й позиції.

Приклад введення 1
1
Приклад виведення 1
0

Приклад введення 2
2
Приклад виведення 2
1

Приклад введення 3
5
Приклад виведення 3
1
*/

import java.io.IOException;
import java.util.Scanner;

public class task1005 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int iterator = 0;
        for (int i = 0; i <= 31; i++) {
            if (Math.pow(2,i) >= number) {
                iterator = i;
                break;
            }
        }
        StringBuffer binaryData = new StringBuffer("01");
        for (int i = 1; i < iterator; i++) {
            binaryData.append(inverseString(binaryData));
        }
        System.out.println(binaryData.charAt(number - 1));
    }
    public static StringBuffer inverseString(StringBuffer str) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                result.append('0');
            }
            else
                result.append('1');
        }
        return result;
    }
}


