class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] k=new int[2];
        for(int i=0;i<nums.length;i++){
            int need=target-nums[i];
                if(map.containsKey(need))
                {
                    k[0]=map.get(need);
                    k[1]=i;
                    return k;
                }
            map.put(nums[i],i);
        }
        return k;
    }
}
