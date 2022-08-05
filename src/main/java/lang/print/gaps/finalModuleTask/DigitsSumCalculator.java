package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int digitsSum = 0;
        for (; number != 0; number /= 10) {
            digitsSum += number % 10;
        }
        System.out.println(digitsSum);
    }
}
