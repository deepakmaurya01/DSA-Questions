public class NumberofStepstoReduceaNumbertoZero {
    public int numberOfSteps(int n) {
        if (n == 0)
            return 0;
        int res = 0;
        while (n > 0) {
            res += ((n & 1) == 1) ? 2 : 1;
            n >>= 1;
        }
        return res - 1;
    }
}
