class Solution {

    public String encode(List<String> strs) {
        String ans="";
        for(String str:strs)
        {
            ans+=str.length()+"#"+str;
        }
        return ans;
    }

    public List<String> decode(String str) {
        List<String> ans=new ArrayList<>();
        int i=0;
        while(i<str.length())
        {
            int len=0;
            while(str.charAt(i)!='#')
            {
                len=len*10+(str.charAt(i)-'0');
                i++;
            }
            i++;
            String s=str.substring(i,i+len);
            ans.add(s);
            i=len+i;
        }
        return ans;
    }
}
