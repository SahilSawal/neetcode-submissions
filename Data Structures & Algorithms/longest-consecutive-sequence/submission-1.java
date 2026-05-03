class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set= new HashSet<>();
        set=Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int output=0;
        for(int n: nums){
            if(!set.contains(n-1)){
               int start=n;
               int count=0;
               while(set.contains(start++)){
                count++;
               }
               if(output<count){
                output=count;
               }
            }

        }
        return output;
    }
}
