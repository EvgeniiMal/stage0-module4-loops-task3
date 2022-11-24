package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int seed = 9;
        int sum = 0;

        if (lengthOfLastNumber == 0) {
            System.out.println(lengthOfLastNumber);
            return;
        }

        for (int i = 0; i < lengthOfLastNumber; i++) {
            sum += seed;
            seed = seed * 10 + 9;
        }

        System.out.println(sum);
    }
}
