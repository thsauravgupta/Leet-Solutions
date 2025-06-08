class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder test=new StringBuilder();
        int i=0,j=0;
        int n=word1.length() ,m=word2.length();
        while(i<n && j<m){
            test.append(word1.charAt(i));
            i++;
            test.append(word2.charAt(j));
            j++;
        }
        while(i<n){
            test.append(word1.charAt(i));
            i++;
        }
        while(j<m){
            test.append(word2.charAt(j));
            j++;
        }
        return test.toString();
    }
}