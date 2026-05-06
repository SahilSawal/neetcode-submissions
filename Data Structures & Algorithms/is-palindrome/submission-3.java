class Solution {
    public boolean isPalindrome(String s) {
    s=Arrays.stream(s.split("")).filter(ele-> Character.isLetter((ele.charAt(0))) || Character.isDigit(ele.charAt(0))).collect(Collectors.joining()).toLowerCase();
    int start =0;
    int end = s.length()-1;
     while(start!=end  && start < s.length()/2){
        if(String.valueOf(s.charAt(start)).equals(String.valueOf(s.charAt(end)))){
            start++;end--;
        }else{
            return false;
        }
     }
     return true;
    }
}
