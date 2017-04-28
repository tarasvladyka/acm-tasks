package tasks1000_1049;
/**
1001 - A in power k

Ліміт часу: 1 секунд
Ліміт пам'яті: 5000 K
Ліміт виведення: 200 K

Завдання

Для заданого цілого а та натурального k обчислити a^k.

Вхідні дані
В єдиному рядку записано два числа a та k (-32000 < a <= 32000, 0 < k <= 32000).

Вихідні дані
Єдине число - відповідь. Гарантується, що відповідь за модулем не більша за 2*109.

Приклад введення 1
1 1
Приклад виведення 1
1

Приклад введення 2
2 3
Приклад виведення 2
8
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1001 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int k = Integer.parseInt(reader.readLine());

        int result = 1;
        for (int i = 0; i < k; i++) {
            result *= a;
        }

        System.out.println(result);
    }
}
