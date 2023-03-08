public class CountSubarraysWithFixedBounds {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int minPos = -1, maxPos = -1, left = -1;
        long res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minK || nums[i] > maxK)
                left = i;

            if (nums[i] == minK)
                minPos = i;

            if (nums[i] == maxK)
                maxPos = i;

            res += Math.max(0, Math.min(minPos, maxPos) - left);
        }
        return res;
    }
}
