class Solution {
    public boolean hasDuplicate(int[] nums) {
    Set<Integer> check= new HashSet<>();
        check = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        if(check.size() != nums.length){
        return true;
        }
        return false;}
}