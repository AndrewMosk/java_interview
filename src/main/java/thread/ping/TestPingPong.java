package thread.ping;

public class TestPingPong {
    public static void main(String[] args) {
        Value v = new Value();
        while (true) {
            new Thread(() -> v.printValue("ping")).start();
            new Thread(() -> v.printValue("pong")).start();
        }
    }
}
