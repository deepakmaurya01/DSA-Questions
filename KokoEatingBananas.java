public class KokoEatingBananas {
    private boolean isPossible(int piles[], int k, int h) {
        long count = 0L;
        for (int x : piles) {
            count += x / k;
            if (x % k != 0)
                count++;
        }
        return count <= h;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int x : piles) {
            max = Math.max(x, max);
        }
        if (piles.length == h)
            return max;
        int start = 1, end = max;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (isPossible(piles, mid, h)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
