class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] count=new int[10001];
        for(int[] trip:trips)
        {
            int people=trip[0];
            int from=trip[1];
            int to=trip[2];
            count[from]+=people;
            count[to]-=people;
        }
        
        int sum=0;
        for(int i=0;i<count.length;i++)
        {
            sum+=count[i];
            if(sum>capacity) return false;
        }
        return true;
    }
}