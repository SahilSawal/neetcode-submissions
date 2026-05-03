class Solution {
    public int[] twoSum(int[] nums, int target) {
       int[] result= new int[2];
        Map<Integer, Integer> freq= new HashMap<>();
        for (int i=0;i<nums.length ;i++){
            if(freq.containsKey(target-nums[i])){
                result[0]=(freq.get(target-nums[i]));
                result[1]=i;
                return result;
            }
            freq.put(nums[i],i);

        }
        return result;
    }
}
