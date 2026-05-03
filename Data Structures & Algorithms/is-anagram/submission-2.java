class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> check= new HashMap<>();
        for(char c: s.toCharArray()){
            check.put(c,check.getOrDefault(c,0)+1);
        }
        for(char c: t.toCharArray()){
            if(!check.containsKey(c)){
                return false;
            }
            check.put(c,check.get(c)-1);
            if(check.get(c)<0){return false;}
        }
         return check.values().stream().filter(ele -> ele > 0).toList().isEmpty();
}
}