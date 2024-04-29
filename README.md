[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-7f7980b617ed060a017424585567c406b6ee15c891e84e1186181d67ecf80aa0.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=14918038)
# Практична робота "Поглиблене використання масивів"

Цей репозиторій містить iнструкції та стартовий код для виконання практичної роботи з теми.

## В рамках практичної роботи ви маєте зробити наступне:
1. написати клас, який містить методи для розв'язання обраного вами завдання та тестовий клас, який дозволяє перевірити його роботу. Класи мають міститись у теці ```src```. Не забуваємо про те, що основний клас **має бути універсальним, тобто він не містить інтерфейсу користувача - лише логіку (статичний метод), яка диктується завданням** (і можливо не всі його методи мають бути публічними)!
2. методу ```main``` тестового класу **не може містити ніякої логіки, пов'язаної з виконанням завдання** - лише перевіряти працездатність основного класу!
3. **README.MD репозиторію має містити опис обраного вами завдання** (краще - з картинками та форматуванням :blush:)!
4. **УВАГА!** Не слід вважати, що завдання дуже прості! Вам необхідно подбати про:
    * **оптимізацію програми - обрати оптимальні з точки зору обсягу використовуваної пам'яті типи даних**
    * **іменування змінних і констант у відповідності до рекомендацій**
    * **javadoc-коментарі для основного класу, які пояснюють що саме обчислюється і які вихідні дані для цього потрібні**
5. завдання намагаємось виконувати **без циклів - з використанням класу ````Arrays````** (див. відеолекцію, та приклад, який я там розв'язав)
6. здати завдання. **Нагадую, що здаючи завдання через Google Classroom, слід вказати посилання на створений для вас репозиторій!**

**P.S.** Ви можете обрати завдання на власний розсуд - реалізувати алгоритм, який вас зацікавив, однак якщо буде надто багато однакових класів, завдання не буде зараховано - намагайтесь робити самотужки та у власному стилі! Звісно ж, ніхто не забороняє користуватись Інтернетом, шукати й використовувати знайдене у Мережі!

----

## Список завдань
1. Заповніть квадратну матрицю заданого порядку N простими числами з вказаного діапазону і виведіть її 
2. Заповнити квадратну матрицю заданого порядку N числами в порядку зростання, починаючи з заданого числа x, наприклад (для N=3, x=14), <pre>
[14,15,16]
[17,18,19]
[20,21,22]</pre>
3. Знайти в матриці розміром N x M число, яке повторюється найбільшу кількість разів
4. Знайти друге за величиною число у матриці розміром N x M 
5. Обчислити суму елементів матриці розміром N x M 
6. Знайти [добуток](https://uk.wikipedia.org/wiki/%D0%9C%D0%BD%D0%BE%D0%B6%D0%B5%D0%BD%D0%BD%D1%8F_%D0%BC%D0%B0%D1%82%D1%80%D0%B8%D1%86%D1%8C) двох матриць розмірами N x M та  M x Q
7. Знайти суму двох матриць розміром N x M 
8.  Відсортувати квадратну матрицю заданого порядку N у порядку зростання елементів (зліва-направо, зверху-вниз)
9. [Транспонувати](https://uk.wikipedia.org/wiki/%D0%A2%D1%80%D0%B0%D0%BD%D1%81%D0%BF%D0%BE%D0%BD%D0%BE%D0%B2%D0%B0%D0%BD%D0%B0_%D0%BC%D0%B0%D1%82%D1%80%D0%B8%D1%86%D1%8F) (замінити рядки стовпцями) матрицю розміром N x M 
10. Заповніть матрицю розміром N x M числами, кожне з яких дорівнює сумі двох попередніх елементів (елементи a<sub>11</sub> a<sub>12</sub>  дорівнюють 1, а інші обчислюються за правилом: a<sub>ij</sub> = a<sub>ij-1</sub> + a<sub>ij-2</sub>)
11. Знайти максимальні елементи рядків матриці розміром N x M
12. Знайти рядок матриці розміром N x M з максимальною сумою елементів
13. Знайти стовпець матриці розміром N x M з максимальною сумою елементів
14. У матриці розміром N x M поміняти місцями два вказвні рядки
15. У матриці розміром N x M поміняти місцями два вказвні стовпці
16. З заданої матриці розміром N x M утворити нову матрицю останній стовпець якої містить суми елементів рядків вихідної матриці
