package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int greatestDivisor = 0;
        int minArg = Math.min(first, second);

        if (minArg == 0) {
            System.out.println(Math.max(first, second));
            return;
        }

        for (int i = 1; i <= minArg; i++) {
            if (first % i == 0 && second % i == 0) {
                greatestDivisor = i;
            }
        }
        System.out.println(greatestDivisor);
    }
}
