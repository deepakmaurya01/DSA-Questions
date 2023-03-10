import java.util.Random;

public class LinkedListRandomNode {
    //Reservoir Sampling
    private ListNode head;
    Random random;

    // public Solution(ListNode head) {
    //     this.head=head;
    //     random=new Random();
    // }
    
    public int getRandom() {
        int res=0,i=1;
        ListNode tmp=head;
        while(tmp!=null){
            if(random.nextInt(i)==i-1){
                res=tmp.val;
            }
            i++;
            tmp=tmp.next;
        }
        return res;
    }
}
