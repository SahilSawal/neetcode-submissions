class Solution {
    public boolean isPalindrome(String s) {
        String o=Arrays.stream(s.split("")).filter(e-> !e.isEmpty() && Character.isLetterOrDigit(e.charAt(0))).collect(Collectors.joining()).toLowerCase();
        String reversed = new StringBuilder(o).reverse().toString();
        String n=reversed;
        if(o.equals(n)){
         return true;
        }else{
          return false;
        }
        

    }
}
