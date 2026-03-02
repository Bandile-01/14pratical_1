import java.lang.Math.*;   import java.io.*;   import java.text.*;


public class Main {
    public static int binarySearch(int[] array, int value) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (array[middle] == value) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;

    }

    public static int LinearSearch(int[] array, int value) {

        for (int i = 0; i < array.length; i++) {
            array[i] = value;
            return 1;
        }
        return 0;
    }

    public static int N = 32654;

    public static void main(String args[]) {
        int[] b = new int[32654];

        DecimalFormat twoD = new DecimalFormat("0.00");
        DecimalFormat fourD = new DecimalFormat("0.0000");
        DecimalFormat fiveD = new DecimalFormat("0.00000");

        long start, finish;
        double runTime = 0, runTime2 = 0, time;
        double totalTime = 0.0;
        int n = N;
        int repetition, repetitions = 30;

        runTime = 0;
        for (repetition = 0; repetition < repetitions; repetition++) {
            start = System.nanoTime();

            LinearSearch(b, repetitions);
            binarySearch(b, repetitions);

            finish = System.nanoTime();

            time = (double) (finish - start);
            runTime += time;
            runTime2 += (time * time);
            double aveRuntime = runTime / repetitions;
            double stdDeviation = Math.sqrt(runTime2 - repetitions * aveRuntime * aveRuntime) / (repetitions - 1);
            System.out.printf("\n\n\fStatistics\n");
            System.out.println("________________________________________________");
            System.out.println("Total time   =           " + runTime / 1000 + "s.");
            System.out.println("Total time\u00b2  =           " + runTime2);
            System.out.println("Average time =           " + fiveD.format(aveRuntime / 1000)
                    + "s. " + '\u00B1' + " " + fourD.format(stdDeviation) + "ms.");
            System.out.println("Standard deviation =     " + fourD.format(stdDeviation));
            System.out.println("n            =           " + n);
            System.out.println("Average time / run =     " + fiveD.format(aveRuntime / n * 1000)
                    + '\u00B5' + "s. ");

            System.out.println("Repetitions  =             " + repetitions);
            System.out.println("________________________________________________");
            System.out.println();
            System.out.println();
        }
    }
}
