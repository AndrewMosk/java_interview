package thread.counter;

public class TestCounter {
    public static void main(String[] args) {
        Counter counter = new Counter();

        new Thread(counter::inc).start();
        new Thread(counter::inc).start();
        new Thread(counter::inc).start();
        new Thread(counter::inc).start();
        new Thread(counter::inc).start();
        new Thread(counter::inc).start();
        new Thread(counter::inc).start();

        System.out.println(counter.getCount());
    }
}
