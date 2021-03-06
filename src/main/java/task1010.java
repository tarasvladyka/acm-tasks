/**
 * 1010 - Остання проблема
 Ліміт часу: 1 секунд
 Ліміт пам'яті: 3000 K
 Ліміт виведення: 2 K

 Завдання
 Ваше завдання – визначити чи дане число N можна представити у вигляді суми двох простих чисел.

 Вхідні дані
 В єдиному рядку записане єдине число N (1 <= N <= 1000000).

 Вихідні дані
 Cума двох простих чисел, що рівна n, або -1, якщо такої не існує.
 В сумі перше число не більше другого і якщо існує декілька таких можливих сум – вивести ту,
 в якої перший доданок найменший.

 Приклад введення 1
 9
 Приклад виведення 1
 2+7

 Приклад введення 2
 10
 Приклад виведення 2
 3+7

 Приклад введення 3
 11
 Приклад виведення 3
 -1
*/



// TODO:
/* читання simples.txt який містить прості числа і запис boolean в інший файл
аналіз іншого файлу, якшо зустрінемо false, вивід повідомлення на екран,
що ф-ція перевірки числа на простоту працює некоректно
*/

import java.io.*;
import java.util.Calendar;


public class task1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        Calendar startTime = Calendar.getInstance();
        long startMs = startTime.getTimeInMillis();

        solver(n);

        System.out.println("time in ms: " + (Calendar.getInstance().getTimeInMillis() - startMs));
    }

    public static void solver(int n) {
        /*якщо дане число дорівнює 1,2 або 3 то немає сенсу
        шукати для них суму двох простих, бо як таких їх не існує*/
        if (n == 1 || n == 2 || n == 3) {
            System.out.println(-1);
            return;
        }
        /*якщо дано просте число >= 4 і необхідно знайти два прості числа,
        які в сумі мають давати дане число,
        то це повинні бути просте число, менше від даного на 2 і число 2
        тобто потрібно перевірити, чи число менше від даного на 2 є простим,
        якшо воно не просте, то таку суму неможливо утворити*/

        if (isSimple(n)) {
            if (isSimple(n - 2))
                System.out.println(2 + " + " + (n - 2));
            else
                System.out.println(-1);
            return;
        }

        /*
        можливий варіант для парного числа, що він є сумою
        двох чисел (число / 2 + число / 2)
        перевіримо це
         */
        if (isSimple(n / 2)) {
            System.out.println(n / 2 + " + " + n / 2);
            return;
        }
        /*
        інакше мусимо шукати для даного числа суму двох простих
        для парних чисел першим числом, яке необхідно перевірити
        на те, чи є воно простим - (n-3), яке є непарним і потенційно учасником суми простих
        чисел(n-1 - не враховуємо бо (n-1) + 1 = n(не підходить за умовами задачі,
        1 - не просте число,
        для непарного - це (n-2) - попереднє непарне

        останнє число, яке перевіряємо - (n/2 + 2)
        наприклад
        для числа 27 - воно дорівнюватиме 15
        */

        int stopNumber = n / 2 + 2;
        int startNumber = (n % 2) == 0 ? (n - 3) : (n - 2);

        for (int i = startNumber; i >= stopNumber; i -= 2) {
            if (isSimple(i)) {
                if (isSimple(n - i)) {
                    System.out.println((n - i) + " + " + i);
                    return;
                }
            }
        }
        System.out.println(-1);
    }

    public static boolean isSimple(int n) {
        // всі прості числа непарні (крім числа 2)
        if (n % 2 == 0 && n != 2)
            return false;
        /*отже виявилося що число непарне
        тобто може ділитися на 3 і більше( потенційно)
        починаємо перевіряти з числа 3
        бо воно має найвищу потенційну ймовірність бути цілочисельним дільником нашого числа
        і йдемо аж до n/3 - найбільший потенційно можливий дільник*/
        for (int i = 3; i <= n / 3; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}


