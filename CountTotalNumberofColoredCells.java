public class CountTotalNumberofColoredCells {
    public long coloredCells(int n) {
        if (n == 1)
            return 1L;
        long res = 2L;
        for (int i = 2; i < n; i++) {
            res += (1L * 2 * i - 1) * 2;
        }
        res += (2 * n - 1);
        return res;
    }
}
