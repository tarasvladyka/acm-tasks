package tasks1000_1049;
/**
1003 - Рукавички

Ліміт часу: 1 секунд
Ліміт пам'яті: 5000 K
Ліміт виведення: 200 K

Завдання
Комірник видає по К пар рукавичок кожному робітнику.
Тобто другий робітник отримає рукавички від (K+1)-шої до (2∙K)-ї пари включно,
пару рукавичок номер (2∙K+2)
отримає третій робітник і для нього вона буде другою.

Напишіть програму, яка за номером виданої пари рукавичок визначає номер робітника,
якому її видано та порядковий номер цієї пари рукавичок в цього робітника.

Вхідні дані
В єдиному рядку записано два числа - K та N. K - кількість пар рукавичок кожному робітнику,
N - номер пари рукавичок (1 <= K <= 200, 1 <= N <= 20000) розділені пропуском.

Вихідні дані
Номер робітника та номер рукавичок в цього робітника, розділені пропуском.

Приклад введення 1
50 1
Приклад виведення 1
1 1

Приклад введення 2
20 25
Приклад виведення 2
2 5

Приклад введення 3
15 43
Приклад виведення 3
3 13

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class task1003 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());

        int numOfWorker = n / k + 1;
        int numOfPair = n - (numOfWorker - 1) * k;

        System.out.println(numOfWorker + " " + numOfPair);
    }
}
