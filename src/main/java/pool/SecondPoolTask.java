package pool;

public class SecondPoolTask {

    public void repaint(Dragon d, String color) {
        d.setColor(color);   // Меняется цвет существующего объекта Dragon
        d = new Dragon();    // Создается новый объект Dragon, параметр d теперь ссылается на него
        d.setColor("blue");  // Меняется цвет нового объекта, не влияет на предыдущий
    }

    public void touchPrim(int v) {
        v++;
    }

    public void test() {
        int p = 1;
        Dragon dr = new Dragon();

        repaint(dr, "green");
        touchPrim(p);

        // 2) Предскажи вывод и КОРОТКО объясни почему.
        System.out.println(p);        // ?
        System.out.println(dr.color); // green

        // 3) Одним абзацем опиши, какие данные существуют в стеке и куче в момент последних println.
        /*
        Стек: p(Примитив) = 1 и dr ссылка на объект Dragon
        Куча: d(объект Dragon созданный в методе test)
        */
    }
}
