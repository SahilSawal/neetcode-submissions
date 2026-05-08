class Solution {
    public int maxArea(int[] heights) {
        int max_area= 0;
        // [1,7,2,5,4,7,3,6]
        int start=0;
        int end = heights.length-1;
        while(start<end){
          
            int area= Math.min(heights[start],heights[end])* (end-start);
          
            max_area=Math.max(max_area,area);
           
            if(heights[start]<heights[end]){
                start++;
            }
            else if(heights[start]>heights[end]) {
                end--;
            }
            else if(heights[start]==heights[end]){ start++;
                end--;
            }

        }
        // for(int i=0; i<heights.length-1;i++){
        //     for(int j=i+1;j<heights.length; j++){
        //       int area= Math.min(heights[i],heights[j])* (j-i);

        //       max_area=Math.max(max_area,area);
        //     }
        // }
        return max_area;
    }
}
