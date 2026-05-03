class Solution {
    public int[] productExceptSelf(int[] nums) {
      int[] result= new int[nums.length];
        int prefix=1;
        result[0]=prefix;
        for(int i=1;i<nums.length;i++){
            result[i]=prefix*nums[i-1];
            prefix=result[i];
        }
        System.out.println(Arrays.toString(Arrays.stream(result).toArray()));
        int post=1;
        for(int j=nums.length-1;j>=0;j--){
            result[j]=result[j]*post;
            post=post *nums[j];
        }
        System.out.println(Arrays.toString(Arrays.stream(result).toArray()));
        return result;
    
    }
}  
