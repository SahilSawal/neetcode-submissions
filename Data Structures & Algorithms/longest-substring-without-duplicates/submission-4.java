class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length=0;
        int maxLength=0;
        Set<Character> set = new HashSet<>();
        char[] c= s.toCharArray();
        for (int i=0;i<c.length;i++){
            while(set.contains(c[i])){
                set.remove(c[length]);
                length++;
            }
            set.add(c[i]);
            maxLength= Math.max(maxLength,i-length+1);
        }
        return maxLength;
    
    }
}
