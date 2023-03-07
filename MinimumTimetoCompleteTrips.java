public class MinimumTimetoCompleteTrips {
    private boolean isPossible(int time[], long curr, int totalTrips) {
        long sum = 0;
        for (int x : time) {
            sum += (curr / x);
        }
        return sum >= totalTrips;
    }

    public long minimumTime(int[] time, int totalTrips) {
        int maxTime = 0;
        for (int x : time)
            maxTime = Math.max(maxTime, x);
        long start = 1, end = (long) totalTrips * maxTime;
        while (start <= end) {
            long mid = (start + end) / 2;
            if (isPossible(time, mid, totalTrips)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
