public class Solution {
    public int characterReplacement(String s, int k) {
     Map<Character,Integer> map= new HashMap<>();
     int start=0;
     int res=0;
     int maxFreq=0;
     for(int end=0;end <s.length();end++){

        map.put(s.charAt(end),map.getOrDefault(s.charAt(end),0)+1);
        maxFreq= Math.max(maxFreq,map.get(s.charAt(end)));

        while((end-start+1)-maxFreq > k){
            map.put(s.charAt(start),map.get(s.charAt(start))-1);
            start++;
        }
        res=Math.max(res,end-start+1);
     }
     return res;
    }
}

