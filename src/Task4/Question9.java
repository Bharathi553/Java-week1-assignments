package Task4;

import java.util.HashMap;
import java.util.Map;

public class Question9 {
    public static void main(String[] args) {
        int[] nums = {1, 4, 10, -3};
        int target = 14;

        int[][] indices = findTwoSum(nums, target);
        if (indices != null) {
            System.out.println("Indices: [" + indices[0][0] + ", " + indices[0][1] + "] or [" + indices[1][0] + ", " + indices[1][1] + "]");
        } else {
            System.out.println("No two sum solution");
        }
    }

    public static int[][] findTwoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        int[][] result = new int[2][2];


        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];


            if (map.containsKey(complement)) {

                result[0] = new int[]{map.get(complement), i};
                result[1] = new int[]{i, map.get(complement)};
                return result;
            }

            map.put(nums[i], i);
        }

        return null;
    }
}