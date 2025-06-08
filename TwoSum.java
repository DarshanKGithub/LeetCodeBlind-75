import java.util.HashMap;
import java.util.Map;

public class TwoSum {
 
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target); // Store the result
        if (result != null) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No solution found");
        }
    }

    static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement
            int diff = target - nums[i];

            // Check if the complement exists in the map
            if (map.containsKey(diff)) {
                return new int[] {map.get(diff), i};
            }
            map.put(nums[i], i);
        }
    
        return null; // Return null if no solution found
    }
}