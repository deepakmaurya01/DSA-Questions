import java.util.PriorityQueue;
import java.util.Queue;

public class MergekSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        Queue<ListNode> q = new PriorityQueue<>((a, b) -> a.val - b.val);
        for (ListNode list : lists) {
            if (list != null)
                q.add(list);
        }
        ListNode res = null;
        if (!q.isEmpty()) {
            res = q.poll();
            if (res.next != null)
                q.offer(res.next);
        }
        ListNode tmp = res;
        while (!q.isEmpty()) {
            tmp.next = q.poll();
            if (tmp.next.next != null)
                q.offer(tmp.next.next);
            tmp = tmp.next;
        }
        return res;
    }
}
