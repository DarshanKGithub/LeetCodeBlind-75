import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args){
        int[] nums = {2,7,11,15,8,0,3};
        int target = 11;
        int[] result = twoSum(nums, target);
        if(result != null){
            System.out.println(("Indices [" + result[0] + ", " + result[1] + "]"));
        }
        else{
            System.out.println("No solution found");
        }
    }

    static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        int size = nums.length;
        for(int i = 0; i < size; i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                return new int[] {map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        return null; // No solution found
    }
}