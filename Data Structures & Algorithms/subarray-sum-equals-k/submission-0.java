class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int currSum=0;
        int count=0;
        for(int num:nums)
        {
            currSum+=num;
            int reqSum=currSum-k;
            if(map.containsKey(reqSum))
            {
                count+=map.get(reqSum);
            }
            if(map.containsKey(currSum))
            {
                map.put(currSum,map.get(currSum)+1);
            }
            else
            {
                map.put(currSum,1);
            }
        }
        return count;
    }
}
