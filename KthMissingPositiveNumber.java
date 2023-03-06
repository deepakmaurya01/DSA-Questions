public class KthMissingPositiveNumber {
    public int findKthPositive(int[] arr, int k) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] - 1 - mid < k)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return left + k;
    }
}
