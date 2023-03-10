// import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class RandomPickIndex {
    Map<Integer, List<Integer>> map = new HashMap<>();
    Random random = new Random();;

    // public Solution(int[] nums){
    //     for(int i=0;i<nums.length;i++){
    // List<Integer> list=map.getOrDefault(nums[i], new ArrayList<>());
    //         list.add(i);
    //         map.put(nums[i], list);
    //     }
    // }

    public int pick(int target) {
        List<Integer> list = map.get(target);
        return list.get(random.nextInt(list.size()));
    }
}
