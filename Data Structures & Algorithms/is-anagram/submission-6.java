class Solution {
    public boolean isAnagram(String s, String t) {
    Map<Character, Integer> map= new HashMap<>();
    for(Character c: s.toCharArray()){
        map.put(c,map.getOrDefault(c,0)+1);
    }
    for(Character c: t.toCharArray()){
        if(map.containsKey(c)){
            map.put(c,map.get(c)-1);
        }else{
            return false;}
    }
    
    
    return  map.values().stream().filter(ele->ele>0).toList().isEmpty();
}
}