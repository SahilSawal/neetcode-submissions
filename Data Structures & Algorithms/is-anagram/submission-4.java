class Solution {
    public boolean isAnagram(String s, String t) {
    String str1= Arrays.stream(s.split("")).sorted().collect(Collectors.joining());
    String str2= Arrays.stream(t.split("")).sorted().collect(Collectors.joining());
    
    return str1.equals(str2);
}
}