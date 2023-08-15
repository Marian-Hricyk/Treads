package fizBaz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzTwst {
    public static void main(String[] args) {
        FizBaz fizz = new FizBaz((n) -> {
            if (n % 3 == 0) {
                System.out.println("Fizz");
            }
        });
        FizBaz buzz = new FizBaz((n) -> {
            if (n % 5 == 0) {
                System.out.println("Buzz");
            }
        });
        FizBaz fizBaz = new FizBaz((n) -> {
            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println("FizzBuzz");
            }
        });
        FizBaz nofizbuzz = new FizBaz((n) -> {
            if (n % 3 != 0 && n != 0) {
                System.out.println(n);
            }
        });
        List<FizBaz> list = new ArrayList<>();
        list.add(fizz);
        list.add(fizBaz);
        list.add(buzz);
        list.add(nofizbuzz);
        for (FizBaz t : list) {
            t.start();
        }
        for (int i = 0; i < 15; i++) {
            for (FizBaz t : list) {
                t.process(i);
            }
            while (true) {
                int procesed = 0;
                for (FizBaz t : list) {
                    if (t.isProces()) {
                        procesed++;
                    }
                }
                if (procesed == 4) {
                    break;
                }
            }
        }
    }
}
