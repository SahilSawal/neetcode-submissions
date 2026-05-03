class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     Map<String,List<String>> map= new HashMap<>();
     for(String s: strs){
        List<String> list= new ArrayList<>();
        String key= Arrays.stream(s.split("")).sorted().collect(Collectors.joining());
        if(!map.containsKey(key)){
            list.add(s);
            map.put(key,list);
        }else{
              list=map.get(key);
                    list.add(s);
                    map.put(key,list);
        }
       
     }
     return map.values().stream().toList();
}
}
