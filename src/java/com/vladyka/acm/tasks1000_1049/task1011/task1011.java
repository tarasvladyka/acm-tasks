package com.vladyka.acm.tasks1000_1049.task1011;
/*
1011 - Медіанний фільтр

Ліміт часу: 1,5 секунд
Ліміт пам'яті: 3000 K
Ліміт виведення: 200 K

Завдання

Медіаною у відсортованому по неспаданню масиву розмірності N називається елемент,
який знаходиться у середній позиції масиву, тобто у позиції (N+1)/2 (цілочисельне ділення).

Медіанним фільтром для растрового зображення називається таке перетворення кожної точки,
колір якої вибирається як медіана із множини точок з певного околу (радіусом R) цієї точки
(квадратної області із центром у вибраній точці – розміри квадрата рівні [R+1+ R]×[ R+1+R]).
Медіанний фільтр використовують для видалення дрібного шуму із зображення. Н
а межі зображення точки, що виходять за межі, вважаються точками із кольором фону
(абсолютне значення рівне нулю).

Для заданого малюнку прямокутної форми шириною W та висотою H знайдіть
максимальне значення медіани для розміру околу R. Вважається,
що малюнок монохромний із 256 градаціями одного кольору.

Вхідні дані

В першому рядку задані 3 числа: розмір околу R (1≤R≤20), H(1≤H≤400), W(1≤W≤250).
В наступних H рядках знаходиться по W чисел розділених пропуском.
Числа – це кольори відповідних точок.

Вихідні дані
Виведіть результат – максимальне значення медіани для заданого малюнку та радіусу.

Приклад введення
1 4 3
1 1 1
1 2 4
2 3 2
1 1 1
Приклад виведення
2

*/

import java.io.IOException;
import java.util.*;

public class task1011 {
    public static void main(String[] args) throws IOException{
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        /*todo
        через buffered reader читати
        допустимо згладили один рядок, чи згладжувати наступний відповідно до попереднього?
        чи не враховувати його, а брати до уваги первинний рядок масиву
        */
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter radius: ");
        int radius = scanner.nextInt();    // 1 <= radius <= 20
        System.out.print("enter height: ");
        int height = scanner.nextInt();    // 1 <= height <= 400
        System.out.print("enter width: ");
        int width = scanner.nextInt();     // 1 <= width <= 250



        Image image = new Image(height, width, radius);
        image.randomFill();



        System.out.println("Image before filtering");
        image.print();



        image.filterImage();
        System.out.println("Image after filtering");
        image.print();
        System.out.println("Max filter is:" + image.getMaxFilter());

    }



}






















