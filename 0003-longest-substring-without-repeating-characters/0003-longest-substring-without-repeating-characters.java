class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 1) return 1;
        int temp=0; 
        int count=0;
        int k=0;
        for(int i=0;i<s.length();i++){

            for(int j=k;j<i;j++){
                if(s.charAt(i)==s.charAt(j)){
                    k=j+1;
                }
            }
            temp = i - k + 1;
            if(count<temp)
            count=temp;

        }return count;
    }
}