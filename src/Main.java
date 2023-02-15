public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("***** Zadanie 1. *****");
        System.out.println();
        /*
        Задание 1.
        На уроке мы проходили разные типы переменных.
        Объявите переменные всех типов, что мы изучили на уроке, и присвойте им любые значения (инициализируйте их).
        --- Критерии оценки
             – Перечислены все типы переменных
             – Значения к типам переменных присвоены корректно
             – Все переменные инициализированы корректно (включая спецсимволы после значений для long и float)
         */
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4L;
        double i = 5.12345678987654321;
        float f = 6.123456789f;
        char plus = 43;
        boolean D = true;
        boolean C = false;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(i);
        System.out.println(f);
        System.out.println("plus = " + plus);
        System.out.println(D);
        System.out.println(C);

        System.out.println();
        System.out.println("***** Zadanie 2. *****");
        System.out.println();
        /*
        А теперь решите задание.
В боксе, перед каждым боем, спортсменов взвешивают – это делают для того, чтобы убедиться, что боксеры соответствуют своей весовой категории, и бой будет честным.
Вес одного боксера – 78,2 кг
Вес второго боксера – 82,7 кг
Подсчитайте и выведите в консоль общий вес двух бойцов.
Подсчитайте и выведите в консоль разницу между весами бойцов.
--- Критерии оценки
        – Тип переменной присвоен верно
        – Выполнены все условия и операции задания
        – Все переменные инициализированы
         */
        double boxer1Weight = 78.2;
        double boxer2Weight = 82.7;
        double obshchyayMassaBoycov = boxer1Weight + boxer2Weight;
        double raznicaVVese = boxer2Weight - boxer1Weight;
        System.out.println("massa pervogo boyca = " + boxer1Weight);
        System.out.println("massa vtorogo boyca = " + boxer2Weight);
        System.out.println("obshchyay massa boycov = " + obshchyayMassaBoycov);
        System.out.println("raznica v vese = " + raznicaVVese);

        System.out.println();
        System.out.println("***** Zadanie 3. *****");
        System.out.println();
        /*
За весом спортсмена следит не только сам спортсмен, но и его тренер.
Он достигается и поддерживается упорными тренировками и сбалансированным питанием.
Вот один из рецептов завтрака перед тренировкой, который получил наш спортсмен для поддержания формы:
– Бананы – 5 штук (1 банан - 80 грамм);
– Молоко – 200 мл (100 мл = 105 грамм);
– Мороженое пломбир – 2 брикета по 100 грамм;
– Яйца сырые – 4 яйца (1 яйцо - 70 грамм).
Смешать всё в блендере и готово.
Подсчитайте вес (количество грамм) такого спорт-завтрака, а затем переведите его в килограммы.
Результат напечатайте в консоль.
--- Важное условие:
если в рецепт нужно добавить несколько единиц какого-то продукта (с определенным весом), то нужно умножать
количество единиц на вес в граммах. Например, если в рецепте указано, что нужно добавить 5 бананов по 80 грамм,
то нужно количество (5 бананов) умножить на вес одного (80 грамм), а не считать самому общую сумму грамм.
--- Критерии оценки
    – Все переменные присвоены
    – Операция подсчета общего веса завтрака в граммах выполнена верно
    – Операция перевода из грамм в килограммы проведена верно
    – Все условия задания выполнены
         */
        short banana1Weight = 80;
        short milk100MlWeight = 105;
        short iceCream1BrWeight = 100;
        short egg1Weight = 70;

        short totalBananas = 5;
        short totalMilkMl = 200;
        short totalIceCream = 2;
        short totalEgg = 4;

        int milk100MlInTotal = totalMilkMl / 100;

        int totalBananasWeight = banana1Weight * totalBananas;
        int totalMilkWeight = milk100MlInTotal * milk100MlWeight;
        int totalIceCreamWeight = iceCream1BrWeight * totalIceCream;
        int totalEggWeight = totalEgg * egg1Weight;

        int breakfastInGram = totalBananasWeight + totalMilkWeight + totalIceCreamWeight + totalEggWeight;
        System.out.println("vsego zavtrak vesit " + breakfastInGram + " gr");

        float breakfastInKg = breakfastInGram / 1000f;
        System.out.println("vsego zavtrak vesit " + breakfastInKg + " kg");

        System.out.println();
        System.out.println("***** Zadanie 4. *****");
        System.out.println();
        /*
Правила соревнований обновились, и теперь нашему спортсмену нужно сбросить 7 кг, чтобы оставаться в своей весовой
категории. Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
Посчитайте, сколько дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм и сколько,
если каждый день будет худеть на 500 грамм. Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться
результата похудения. Результаты подсчетов выведите в консоль.
--- Критерии оценки
    – Все переменные присвоены верно
    – Операция деления выполнена верно
    – Операция определения остатка деления выполнена верно
    – Результат подсчетов выведен в консоль
    – Все условия задания выполнены
         */
        short totalWeightKg = 7;
        short lost1 = 250;
        short lost2 = 500;

        int totalWeightGr = totalWeightKg * 1000;
        int quantity1 = totalWeightGr / lost1;
        int quantity2 = totalWeightGr / lost2;
        int quantity3 = (quantity1 + quantity2) / 2;
        System.out.println("Nuzno " + quantity1 + " dney, chtoby skidyvat po " + lost1 + " gr");
        System.out.println("Nuzno " + quantity2 + " dney, chtoby skidyvat po " + lost2 + " gr");
        System.out.println("Nuzno " + quantity3 + " dney v srednem, chtoby skinut " + totalWeightKg + " kr");

        System.out.println();
        System.out.println("***** Zadanie 5. *****");
        System.out.println();
        /*
Отойдем от спорта и представим, что мы работаем в большой компании, штат которой состоит из нескольких сотен
сотрудников. В компании есть правило, что чем дольше сотрудник работает в компании, тем ценнее он для бизнеса.
Поэтому сотрудники, которые работают в компании дольше 3 лет, получают повышение зарплаты раз в год. Каждый год
повышение составляет 10% от текущей зарплаты. К вам пришел руководитель с задачей автоматизировать повышение
зарплаты, а также провести расчет для следующих сотрудников:
Маша получает 67 760 рублей в месяц
Денис получает 83 690 рублей в месяц
Кристина получает 76 230 рублей в месяц
Каждому нужно увеличить зарплату на 10% от текущей месячной. Дополнительно руководитель попросил посчитать разницу
между годовым доходом с нынешней зарплатой и после повышения. Посчитайте, сколько будет получать каждый из
сотрудников, а также разницу между годовым доходом до и после повышения.
Выведите в консоль информацию по каждому сотруднику.
Например, “Маша теперь получает **** рублей. Годовой доход вырос на **** рублей”.
--- Критерии оценки**
    – Все переменные присвоены верно
    – Операция умножения выполнена верно
    – Операция сложения выполнена верно
    – Все условия задания выполнены
         */
        int zpMashaOld = 67_760;
        int zpDenisOld = 83_690;
        int zpKristinaOld = 76_230;

        double zpMashaNew = zpMashaOld * 1.1;
        float zpDenisNew = zpDenisOld * 1.1f;
        double zpKristinaNew = zpKristinaOld * 1.1;

        double yearUpWageMasha = 12 * zpMashaOld * 0.1;
        double yearUpWageDenis = 12 * zpDenisOld * 0.1;
        double yearUpWageKristina = 12 * zpKristinaOld * 0.1;

        System.out.println("Masha teper poluchaet " + (int) zpMashaNew + " rub. Godovoy dohod vyros na " + (int) yearUpWageMasha + " rub.");
        System.out.println("Denis teper poluchaet " + (int) zpDenisNew + " rub. Godovoy dohod vyros na " + (int) yearUpWageDenis + " rub.");
        System.out.println("Kristina teper poluchaet " + (int) zpKristinaNew + " rub. Godovoy dohod vyros na " + (int) yearUpWageKristina + " rub.");

/*
    Задача 6. Повышенная сложность.
    Объявите целочисленные переменные *a* = 12, *b* = 27, *c* = 44, *d* = 15, *e* = 9.
    Вычислите выражение a * (b + (c - d * e)) и присвойте его результат переменной *result*.
    Инвертируйте результат (значение в переменной *result*), преобразовав его в вариант
    с противоположным значением (отрицательное -> положительное, положительное -> отрицательное).
    Выведите (напечатайте) результат в консоль.
    --- Критерии оценки
        – Переменные объявлены корректно
        – Выражение вычислено правильно
        – Результат выражения присвоен переменной result
        – Результат выражения преобразован в противоположное значение
    */
        System.out.println();
        System.out.println("***** Zadanie 6. Povyshennaya sloznost. *****");
        System.out.println();

        a = 12;
        b = 27;
        c = 44;
        d = 15;
        int e = 9;
        int result = (int) (a * (b + (c - d * e)));
        int invertResult = result * (-1);
        System.out.println("result = " + result);
        System.out.println("invertResult = " + invertResult);
    /*
    Задача 7. Повышенная сложность.
    Объявите целочисленные переменные *a* = 5 и *b* = 7.
    С помощью математических манипуляций добейтесь того, чтобы *a* = 7 и *b* = 5.
    Использовать дополнительные переменные или числа запрещено.
    --- Критерии оценки
        – Переменные объявлены корректно
        – Уравнение написано правильно и решает задание упражнения
    */
        System.out.println();
        System.out.println("***** Zadanie 7. Povyshennaya sloznost. *****");
        System.out.println();

        int aaa = 5;
        int bbb = 7;
        aaa = aaa + bbb;
        bbb = aaa - bbb;
        aaa = aaa - bbb;
        System.out.println("aaa = " + aaa);
        System.out.println("bbb = " + bbb);

        /*
Задача 8. Повышенная сложность.
Объявите переменную *a* и инициализируйте ее любым трехзначным числом.
Объявите переменную *b* и, путем математических операций над *a* получите и присвойте
переменной *b* цифру, которая находится в центре значения из переменной *a*.
Например, если *a* = 256, то необходимо с помощью математических действий достать
цифру 5 из центра и присвоить переменной *b*. Если *a* = 789, то b должна быть
инициализирована числом 8, так как эта цифра является вторым из трех (центральным)
символом в значении *a*.
Следует учесть, что алгоритм должен быть универсальным и корректно срабатывать на любых
трехзначных числах из *a* без изменений.
Это значит, что рассчитать в голове сумму, которую необходимо вычесть или прибавить
к *a* для корректного значения в *b* нельзя, так как при каждом изменении значения
в *a* её нужно пересчитывать.
--- Критерии оценки
        – Переменные объявлены корректно
        – Математически рассчитывается центральный элемент переменной a
        – Алгоритм не требует изменений при изменении значения переменной a
        */
        System.out.println();
        System.out.println("***** Zadanie 8. Povyshennaya sloznost. *****");
        System.out.println();

        int aa = 358;
        int bb = (aa % 100) / 10;
        System.out.println("aa = " + aa);
        System.out.println("bb = " + bb);

    }
}
