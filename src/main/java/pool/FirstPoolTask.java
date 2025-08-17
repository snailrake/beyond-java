package pool;

public class FirstPoolTask {

    public void first() {
        String s1 = "Dragon";
        String s2 = "Dragon";
        String s3 = new String("Dragon");

        // 1) Что выведут следующие строки? Перед каждой напиши ожидаемое значение (true/false) и КОРОТКО почему.
        System.out.println(s1 == s2);      // true s1 & s2 созданы как литералы с одним и тем же значение
        System.out.println(s1 == s3);      // false s3 уже создана как новый объект в "куче"
        System.out.println(s1.equals(s3)); // true метод equals сравнивает содержимое строк, а не ссылки на объекты

        // 2) Одной строкой ДО печати сделай так, чтобы s1 и s3 указывали на один и тот же объект.
        // Напиши эту строку тут: s3 = s3.intern() (и объясни почему теперь ссылки равны)
        /* по тем гайдам и форумам которым я изучал эту тему об intern() услышал, но не шибко о ней там рассказали,
        только поверхностно сказали что он просто помещает строку в пул строк ну и возращает ссылку на нее*/
    }

    public void second() {
        Integer a = 127;
        Integer b = 127;
        Integer c = 130;
        Integer d = 130;

        // 1) Предскажи вывод и объясни:
        System.out.println(a == b);      // true a & b созданы как литералы с одним и тем же значение
        System.out.println(c == d);      // false Integer имеет диапозон чисел в пуле от -128 до 127, 130 вне пула
        System.out.println(c.equals(d)); // true метод equals фактическое числовое значение объектов Integer,
        // а не ссылки на объекты

        // 2)
        Integer numObj = 42;
        int num = numObj;
        // Объясни что выведется и почему:
        System.out.println(num); // 42 при присвоении присходит автораспаковка, где объект Integer преобразуется в
        // примитив int

        Integer n = null;
        // Что произойдёт при раскомментировании строки ниже и почему?
        // int x = n; // NullPointerException примитивы как int не могут иметь null в значении, в отличие от обёрток

        // Перепиши безопасно:
        // int x = (n != null) ? n;
        // System.out.println(x);
    }
}
