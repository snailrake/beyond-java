package statics;

// Требуется:
// 1) ДОПИСАТЬ отмеченные места,
// 2) Для каждой println — НАПИСАТЬ в комментарии: что выведется и ПОЧЕМУ,
// 3) Ответить на вопрос про компиляцию (см. класс Centaur).

public class StaticMegaTask {

    static class Centaur {
        static String wisdom = "All centaurs have it";
        String name;

        Centaur(String name) { this.name = name; }

        // Скомпилируется ли этот метод, если раскомментировать? Почему?
        // хуй там он скомпилируется
        // public static String tellSecret() { return name; }
        // нельзя обратиться к не static переменной из static метода или класса
    }

    static class CentaurWisdomKeeper {
        static int count;

        static {
            System.out.println("Keeper loaded"); // Когда напечатается и сколько раз?
                                                 // 1 раз напечатается, когда класс вызовут(вызовут к доске🤣)
        }

        static void register(Centaur c) {
            // TODO: допиши тело:
            // 1) Увеличь общий счётчик,
            count++;
            // 2) Выведи: "Registered: <имя>; total=<счётчик>"
            System.out.println("Registered: " + c.name + "; total=" + count);
        }
    }

    public void task() {
        System.out.println("Main start");              // Main start

        // A)
        System.out.println(Centaur.wisdom);            // All centaurs have it
        Centaur a = new Centaur("A");
        System.out.println(a.wisdom);                  // All centaurs have it

        // B)
        Centaur b = new Centaur("B");
        a.wisdom = "Shared";
        System.out.println(b.wisdom);                  // Shared
        System.out.println(Centaur.wisdom);            // Shared

        // C)
        // Предскажи ПОРЯДОК строк на экране при следующих вызовах
        CentaurWisdomKeeper.register(a);               /* Keeper loaded (static-блок выполнится первым при обращении и
                                                          только 1 раз)
                                                          Registered: A; total=1*/
        CentaurWisdomKeeper.register(b);               // Registered: B; total=2

        // D)
        System.out.println(CentaurWisdomKeeper.count); // 2
        System.out.println(new CentaurWisdomKeeper().count); // 2 (и почему так вызывать нежелательно?)
        /*
        Как минимум нежелательно из-за затрат памяти, это просто вывод в консоль не требующий для этого new,
        плюс нечитаемо. Был бы смысл присвоить это и потом использовать в коде, а так только путает
        */

        System.out.println("Main end");                // Main end

        // E) Ответь письменно: нужно ли создавать объект CentaurWisdomKeeper,
        // чтобы вызвать register()? Почему?
        /*
        Нет, не нужно. Метод register() объявлен как static. Это означает, что он принадлежит всему классу
        CentaurWisdomKeeper. Вызывать его можно через имя класса: CentaurWisdomKeeper.register(...);
        Сверху под С) буквально аналогия
        */

        // F) Ответь письменно на вопрос в классе Centaur про tellSecret().
        /*
        Метод public static String tellSecret() { return name; } не скомпилируется, если его раскомментировать.
        Статический метод не имеет доступа к нестатическим полям своего класса. Поле name не является
        статическим — оно принадлежит каждому объекту класса Centaur. Статический метод tellSecret()
        существует независимо от объектов и вызывается через класс (Centaur.tellSecret())
        */
    }
}
