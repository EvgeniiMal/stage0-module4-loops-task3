package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        if(lastFibonacci == 0 || lastFibonacci == 1) {
            System.out.println(lastFibonacci);
            return;
        }
        int fPrev = 0;
        int sPrev = 1;
        int temp = 0;
        for (int i = 0; i < lastFibonacci; i++) {
            if (i == 0 || i ==1) {
                System.out.println(i);
                continue;
            }
            temp = fPrev + sPrev;
            fPrev = sPrev;
            sPrev = temp;

            System.out.println(sPrev);
        }
    }
}
