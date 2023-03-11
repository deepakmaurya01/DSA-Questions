public class FindNumberswithEvenNumberofDigits {
    public int findNumbers(int[] nums) {
        int res = 0;
        for (int x : nums) {
            int digit = 0;
            while (x > 0) {
                digit++;
                x /= 10;
            }
            if (digit % 2 == 0)
                res++;
        }
        return res;
    }
}
