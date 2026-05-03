class Solution {
    public int[] topKFrequent(int[] nums, int k) {
          Map<Integer,Integer> map= new HashMap<>();
        for(int n: nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        Integer[] boxed=Arrays.stream(nums).boxed().toArray(Integer[]::new);

       Arrays.sort(boxed,(Integer a,Integer b)->{
           int comp= map.get(a)-map.get(b);
           if(comp!=0){return comp;}
           return b-a;
       });

     //if i sort the array nums then i can find the k elements coming from back to front 
     //boxed 
      int[] result = new int[k];
      int counter=k-2;
      result[k-1]=boxed[boxed.length-1];
      int prev=boxed[boxed.length-1];
      for(int i=boxed.length-2; i>=0;i--){
        if(prev!=boxed[i]){
          result[counter]=boxed[i];counter--; prev=boxed[i];
        }
          
        if(counter<0){return result;}
      }
      return result;
    }
}
