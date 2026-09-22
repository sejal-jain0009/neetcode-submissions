class Solution {
    public int candy(int[] ratings) {
       int[] result=new int[ratings.length];
       Arrays.fill(result,1);
       int n=ratings.length;

       for(int i=1;i<n;i++) //for left side
       {
          if(ratings[i]>ratings[i-1])
          {
              result[i]=result[i-1]+1;
          }
       }

       for(int i=n-2;i>=0;i--) //for right side if priority is still less
       {
          if(ratings[i]>ratings[i+1]) result[i]=Math.max(result[i],result[i+1]+1);
       }

       int sum=0;
       for(int num:result)
       {
         sum+=num;
       }
       return sum;
    }
}