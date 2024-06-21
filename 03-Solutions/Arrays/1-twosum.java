 link--> https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {

        // brute force

        // for(int i=0;i<nums.length;i++){
        // for(int j=0;j<nums.length;j++){
        // if(target-nums[i]==nums[j]){
        // return new int[]{i,j};
        // }
        // }
        // }

        // optimal

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int j = 0; j < nums.length; j++) {
            if (map.containsKey(target - nums[j]) && j != map.get(target - nums[j])) {
                return new int[] { j, map.get(target - nums[j]) };
            }
        }
        return new int[] { -1, -1 };
    }
}
