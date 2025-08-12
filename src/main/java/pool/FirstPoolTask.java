package pool;

public class FirstPoolTask {

    public void first() {
        // Пометь в комментарии для каждого: примитив/ссылочный: int, Integer, char, Character, String, long, Long.

        String s1 = "Dragon";
        String s2 = "Dragon";
        String s3 = new String("Dragon");

        // 1) Что выведут следующие строки? Перед каждой напиши ожидаемое значение (true/false) и КОРОТКО почему.
        System.out.println(s1 == s2);      // ?
        System.out.println(s1 == s3);      // ?
        System.out.println(s1.equals(s3)); // ?

        // 2) Одной строкой ДО печати сделай так, чтобы s1 и s3 указывали на один и тот же объект.
        // Напиши эту строку тут: (и объясни почему теперь ссылки равны)
        // ...
    }

    public void second() {
        Integer a = 127;
        Integer b = 127;
        Integer c = 130;
        Integer d = 130;

        // 1) Предскажи вывод и объясни:
        System.out.println(a == b);      // ?
        System.out.println(c == d);      // ?
        System.out.println(c.equals(d)); // ?

        // 2)
        Integer numObj = 42;
        int num = numObj;
        // Объясни что выведется и почему:
        System.out.println(num); // ?

        Integer n = null;
        // Что произойдёт при раскомментировании строки ниже и почему?
        // int x = n; // ?

        // Перепиши безопасно:
        // int x = ...
        // System.out.println(x);
    }
}
