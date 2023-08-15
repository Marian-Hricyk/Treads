package time;

public class FiveTime implements Runnable {
    @Override
    public void run() {
        while (true){
            System.out.println("Минуло 5 секунд");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
