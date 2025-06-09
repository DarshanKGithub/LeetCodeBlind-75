import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        boolean result = containsDuplicate(nums);
        System.out.println("Contains Duplicate: " + result);
    }

    static boolean containsDuplicate(int[] nums){
        Set<Integer> visited = new HashSet<>();
        for (int num: nums) {
            if(visited.contains(num)){
                return true;
            
            }else {
                visited.add(num);

            }

        }
        return false;
    }
}
