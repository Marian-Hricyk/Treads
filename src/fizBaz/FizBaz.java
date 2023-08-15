package fizBaz;


import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;


public class FizBaz extends Thread {
    private Consumer<Integer> procesor;
    AtomicBoolean isProces = new AtomicBoolean(true);
    private int n;

    public FizBaz(Consumer<Integer> procesor) {
        this.procesor = procesor;
    }

    public void process(int n) {
        this.n = n;
        isProces.set(false);
    }

    public Boolean isProces() {
        return isProces.get();
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (isProces.get()) {
                continue;
            }
            procesor.accept(n);
            isProces.set(true);
        }
    }
}
