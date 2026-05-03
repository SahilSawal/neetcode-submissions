class Solution {

    public String encode(List<String> strs) {
    String encoded_string="";
    for(String s: strs){
        String concat= s.length()+"#"+s;
        encoded_string= encoded_string.concat(concat);
    }
    return encoded_string;
    }

    public List<String> decode(String str) {
    List<String> s= new ArrayList<>();
    int i=0;
    char[] c = str.toCharArray();
    while(i<str.length()){
            int dashIndex = i;
            while (c[dashIndex] != '#') {
                dashIndex++;
            }
            int ch = Integer.parseInt(new String(c, i, dashIndex - i));
            i = dashIndex + 1;
            String word = new String(c, i, ch);
            i = i + ch;
            s.add(word);
    }
    return s;
    }
}