import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class JumpGameIV {
    public int minJumps(int[] arr) {
        int n = arr.length;
        if (n == 1)
            return 0;

        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(arr[i], x -> new ArrayList<>()).add(i);
        }

        Queue<Integer> q = new LinkedList<>();
        q.offer(0);
        int res = 0;
        while (!q.isEmpty()) {
            res++;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int j = q.poll();
                if (j - 1 >= 0 && map.containsKey(arr[j - 1]))
                    q.offer(j - 1);

                if (j + 1 < n && map.containsKey(arr[j + 1])) {
                    if (j + 1 == n - 1)
                        return res;
                    q.offer(j + 1);
                }

                if (map.containsKey(arr[j])) {
                    for (int k : map.get(arr[j])) {
                        if (k == n - 1)
                            return res;
                        q.offer(k);
                    }
                }
                map.remove(arr[j]);
            }
        }
        return res;
    }
}
