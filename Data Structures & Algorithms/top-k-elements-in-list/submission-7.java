class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      Map<Integer,Integer> map= new HashMap<>();
        for(int n: nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        List<Integer>[] bucket= new ArrayList[nums.length+1];
        for(Map.Entry<Integer, Integer> m: map.entrySet()){
            int value= m.getKey();
            int freq= m.getValue();
            if(bucket[freq]==null){
                bucket[freq]= new ArrayList<>();
            }
            bucket[freq].add(value);
        }
       
        int[] result = new int[k];
        int counter=k-1;
        for(int i=bucket.length-1; i>=0;i--){
            if(bucket[i]!= null){
                for(int n: bucket[i]){
                    result[counter]=n;counter--;
                    if(counter<0){return result;}
                }
            }
        }
       
        return result;
    }
}
