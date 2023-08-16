package time;

public class OneSecondTime implements Runnable {
    @Override
    public void run() {
        long Start = System.currentTimeMillis();
        while (true) {
            long time = System.currentTimeMillis() - Start;
            System.out.println("Went " + time + " ms from the start");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
