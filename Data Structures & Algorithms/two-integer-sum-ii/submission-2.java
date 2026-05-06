class Solution {
    public int[] twoSum(int[] numbers, int target) {
     int start=0;
     int end= numbers.length-1;
     int[] result= {0,0};
     while(start!=end && start<numbers.length-1){
         int sum= numbers[start]+numbers[end];
         if(sum==target){
            result[0]=start+1;
            result[1]=end+1;
            return result;
        }else if(sum >target){
             end--;
         } else if(sum <target){
             start++;
         }
     }
     return result;
    
    }
}
