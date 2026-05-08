class Solution {
    public int maxArea(int[] heights) {
        // have two location 
        //calculate area by take minimum of two <a> then distance between them <b> area is axb
        int max_area= 0;
        for(int i=0; i<heights.length-1;i++){
            for(int j=i+1;j<heights.length; j++){
              int area= Math.min(heights[i],heights[j])* (j-i);
             
              max_area=Math.max(max_area,area);
            }
        }
        return max_area;
    }
}
