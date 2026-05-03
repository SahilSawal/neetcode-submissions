class Solution {
    public boolean hasDuplicate(int[] nums) {
       Map<Integer, Integer> checkMap= new HashMap();
       for(int i=0; i< nums.length;i++){
         checkMap.put(nums[i], checkMap.getOrDefault(nums[i],0)+1);
           if(checkMap.get(nums[i])>1) {
               return true;}
       }
       return false;
    }
}