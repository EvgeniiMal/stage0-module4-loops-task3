package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        int number = Math.abs(t);
        String strNum = "" + number;
        int sum = 0;
        int div = 10;

        for (int i = 0; i < strNum.length(); i++) {
            sum += number % div;
            number /= div;
        }
        System.out.println(sum);
    }
}
