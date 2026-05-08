class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result= new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            int a = nums[i];//fixed positon one
            if(a>0) break; //all remaning number are positive 
            if(i>0 && nums[i]==nums[i-1]) continue;
            //set two pointers
            int start= i+1; //start of search
            int end= nums.length-1; //end element
            while(start<end){
                int sum = a+nums[start]+nums[end];
                if(sum<0){
                 start++;
                }
                else if(sum >0){
                    end--;
                }
                else{
                     result.add(Arrays.asList(a,nums[start],nums[end]));
                  start++;end--;
                  while(start<end && nums[start] == nums[start-1]){
                    start++;
                  }
                }
            }

        }
        return result;
   
    }
}
