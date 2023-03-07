import java.util.PriorityQueue;
import java.util.Queue;

public class TheKWeakestRowsinaMatrix {
    public int[] kWeakestRows(int[][] mat, int k) {
        Queue<int[]> q = new PriorityQueue<>((a, b) -> a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]);
        int i = 0;
        for (int x[] : mat) {
            int start = 0, end = x.length - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (x[mid] > 0)
                    start = mid + 1;
                else
                    end = mid - 1;
            }
            q.offer(new int[] { i++, start });
        }
        int[] res = new int[k];
        for (i = 0; i < k; i++) {
            res[i] = q.poll()[0];
        }
        return res;
    }
}
