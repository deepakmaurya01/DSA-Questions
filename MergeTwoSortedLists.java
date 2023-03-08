public class MergeTwoSortedLists {
    /*
     * //Recursive Approach
     * public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
     * if(list1==null) return list2;
     * if(list2==null) return list1;
     * if(list1.val<list2.val){
     * list1.next=mergeTwoLists(list1.next,list2);
     * return list1;
     * }
     * else{
     * list2.next=mergeTwoLists(list1,list2.next);
     * return list2;
     * }
     * }
     */

    // Iterrative Approach
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res, tmp;
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        if (list2.val > list1.val) {
            res = tmp = list1;
            list1 = list1.next;
        } else {
            res = tmp = list2;
            list2 = list2.next;
        }
        while (list1 != null && list2 != null) {
            if (list2.val > list1.val) {
                tmp.next = list1;
                list1 = list1.next;
            } else {
                tmp.next = list2;
                list2 = list2.next;
            }
            tmp = tmp.next;
        }
        if (list1 != null) {
            tmp.next = list1;
        }
        if (list2 != null) {
            tmp.next = list2;
        }
        return res;
    }
}
