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
        // public static String tellSecret() { return name; }
    }

    static class CentaurWisdomKeeper {
        static int count;

        static {
            System.out.println("Keeper loaded"); // Когда напечатается и сколько раз?
        }

        static void register(Centaur c) {
            // TODO: допиши тело:
            // 1) Увеличь общий счётчик,
            // 2) Выведи: "Registered: <имя>; total=<счётчик>"
        }
    }

    public void task() {
        System.out.println("Main start");              // ?

        // A)
        System.out.println(Centaur.wisdom);            // ?
        Centaur a = new Centaur("A");
        System.out.println(a.wisdom);                  // ?

        // B)
        Centaur b = new Centaur("B");
        a.wisdom = "Shared";
        System.out.println(b.wisdom);                  // ?
        System.out.println(Centaur.wisdom);            // ?

        // C)
        // Предскажи ПОРЯДОК строк на экране при следующих вызовах
        CentaurWisdomKeeper.register(a);               // ? (+ когда выполнится static-блок)
        CentaurWisdomKeeper.register(b);               // ?

        // D)
        System.out.println(CentaurWisdomKeeper.count); // ?
        System.out.println(new CentaurWisdomKeeper().count); // ? (и почему так вызывать нежелательно?)

        System.out.println("Main end");                // ?

        // E) Ответь письменно: нужно ли создавать объект CentaurWisdomKeeper,
        // чтобы вызвать register()? Почему?

        // F) Ответь письменно на вопрос в классе Centaur про tellSecret().
    }
}
