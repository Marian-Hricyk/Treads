package fizBaz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzTwst {

    public static void main(String[] args) {
        int namber = 15;
        FizBaz fizz = new FizBaz((n) -> {
            if (n % 3 == 0 && n % 5 != 0) {
                System.out.println("Fizz");
            }
        });
        FizBaz buzz = new FizBaz((n) -> {
            if (n % 5 == 0 && n % 3 != 0) {
                System.out.println("Buzz");
            }
        });
        FizBaz fizBaz = new FizBaz((n) -> {
            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println("FizzBuzz");
            }
        });
        FizBaz nofizbuzz = new FizBaz((n) -> {
            if (n % 3 != 0 && n % 5 != 0) {
                System.out.println(n);
            }
        });
        List<FizBaz> thread = new ArrayList<>();
        thread.add(fizz);
        thread.add(fizBaz);
        thread.add(buzz);
        thread.add(nofizbuzz);
        for (FizBaz t : thread) {
            t.start();
        }
        for (int i = 1; i <= namber; i++) {
            for (FizBaz t : thread) {
                t.process(i);
            }
            while (true) {
                int procesed = 0;
                for (FizBaz t : thread) {
                    if (t.isProces()) {
                        procesed++;
                    }
                }
                if (procesed == 4) {
                    break;
                }
            }
        }
        for (FizBaz t : thread) t.shutdown();
    }
}

