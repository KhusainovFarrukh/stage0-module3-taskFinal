package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int reverted = 0;
        for (; number != 0; number /= 10) {
            reverted = reverted * 10 + number % 10;
        }
        System.out.println(reverted);
    }
}
