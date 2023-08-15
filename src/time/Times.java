package time;

public class Times {
    public static void main(String[] args) {
        Thread One = new Thread(new OneSecondTime());
        Thread five = new Thread(new FiveTime());
        One.start();
        five.start();
    }
}
