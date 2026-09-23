class Solution {
    public int leastInterval(char[] tasks, int n) {
        if(n==0) return tasks.length;
        int[] freq=new int[26];
        for(char ch:tasks)
        {
            freq[ch-'A']++;
        }
        Arrays.sort(freq);
        int max=freq[25];

        int idle=(max-1)*n;
        for(int i=24;i>=0;i--)
        {
            idle=idle-Math.min((max-1),freq[i]);
        }
        return idle>0 ? tasks.length+idle:tasks.length;
    }
}
