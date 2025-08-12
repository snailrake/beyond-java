package pool;

public class SecondPoolTask {

    public void repaint(Dragon d, String color) {
        d.setColor(color);   // Объясни: что именно здесь меняется?
        d = new Dragon();    // Объясни: что именно здесь произошло с параметром d?
        d.setColor("blue");
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
        System.out.println(dr.color); // ?

        // 3) Одним абзацем опиши, какие данные существуют в стеке и куче в момент последних println.
    }
}
