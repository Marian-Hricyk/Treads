package time;

public class FiveTime implements Runnable {
    @Override
    public void run() {
        while (true) {

            try {
                Thread.sleep(5000);
                System.out.println("5 seconds have passed");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
