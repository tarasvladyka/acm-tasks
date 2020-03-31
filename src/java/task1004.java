/**
1004 - Супер проста проблема

Ліміт часу: 1 секунд
Ліміт пам'яті: 3000 K
Ліміт виведення: 200 K

Завдання

Знайти квадрат N-го простого числа.

Вхідні дані
В єдиному рядку записане єдине число N (1 <= N <= 100).

Вихідні дані
Єдине число - квадрат N-го простого числа

Приклад введення 1
1
Приклад виведення 1
4

Приклад введення 2
2
Приклад виведення 2
9

Приклад введення 3
5
Приклад виведення 3
121
*/

import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;

public class task1004 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int indexOfSimpleNumber = scanner.nextInt();
        int nSimpleNumber = 1;
        int count = 0;
        for (int i = 2; i <= 1000; i++) {
            boolean isSimple = true;
            for (int j = i / 2; j > 1; j--) {
                if (i % j == 0) {
                    isSimple = false;
                    break;
                }
            }
            if (isSimple) {
                count++;
                if (count == indexOfSimpleNumber) {
                    nSimpleNumber = i;
                    break;
                }
            }
        }
        System.out.println(nSimpleNumber * nSimpleNumber);
    }
}


