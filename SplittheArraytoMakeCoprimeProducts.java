public class SplittheArraytoMakeCoprimeProducts {
    private int factors[] = new int[1000001];

    private void primeFactors(int n, int index) {
        if (n % 2 == 0) {
            factors[2] = Math.max(factors[2], index);
            while (n % 2 == 0)
                n /= 2;
        }
        int sqrt = (int) Math.sqrt(n);
        for (int i = 3; i <= sqrt; i += 2) {
            if (n % i == 0) {
                factors[i] = Math.max(factors[i], index);
                while (n % i == 0)
                    n /= i;
            }
        }
        if (n > 1)
            factors[n] = Math.max(factors[n], index);
    }

    private int findExtend(int n) {
        int maxIndex = 0;
        if (n % 2 == 0) {
            maxIndex = Math.max(factors[2], maxIndex);
            while (n % 2 == 0)
                n /= 2;
        }
        int sqrt = (int) Math.sqrt(n);
        for (int i = 3; i <= sqrt; i += 2) {
            if (n % i == 0) {
                maxIndex = Math.max(factors[i], maxIndex);
                while (n % i == 0)
                    n /= i;
            }
        }
        if (n > 1)
            maxIndex = Math.max(factors[n], maxIndex);
        return maxIndex;
    }

    public int findValidSplit(int[] nums) {
        for (int k = 0; k < nums.length; k++) {
            primeFactors(nums[k], k);
        }
        int extend = 0, i = 0;
        while (i <= extend) {
            extend = Math.max(extend, findExtend(nums[i]));
            i++;
        }
        return extend == nums.length - 1 ? -1 : extend;
    }
}
