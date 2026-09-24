class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas=0;
        int gasneeded=0;

        for(int i=0;i<gas.length; i++)
        {
            totalgas+=gas[i];
        }

        for(int i=0;i<cost.length;i++)
        {
            gasneeded+=cost[i];
        }

        int start=0;
        int cg=0;

        if(gasneeded>totalgas) return -1;
        else{
            for(int i=0;i<gas.length;i++)
            {
                cg+=gas[i]-cost[i];
                if(cg<0)
                {
                    cg=0;
                    start=i+1;
                }
            }
        }
        return start;
    }
}
