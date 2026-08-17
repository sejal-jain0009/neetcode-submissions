class Solution {
    public String minWindow(String s, String t) {
        int[] need=new int[123];
        for(char c:t.toCharArray())
        {
            need[c]++;
        }

        int[] window=new int[123];
        int left=0;
        int right=0;
        int have=0;
        int minlen=Integer.MAX_VALUE;
        int start=0;
        int len=t.length();
        while(right<s.length())
        {
            char c=s.charAt(right);
            window[c]++;
            if(window[c]<=need[c])
            {
                have++;
            }
            while(have==len)
            {
                if(right-left+1<minlen)
                {
                    minlen=right-left+1;
                    start=left;
                }
                char leftchar=s.charAt(left);
                window[leftchar]--;
                if(window[leftchar]<need[leftchar])
                {
                    have--;
                }
                left++;
            }
            right++;
        }
        if(minlen==Integer.MAX_VALUE) return "";
        return s.substring(start,minlen+start);
    }
}
