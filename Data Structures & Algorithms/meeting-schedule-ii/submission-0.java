/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        int n=intervals.size();
        int[] start=new int[n];
        int[] end=new int[n];

        for(int i=0;i<n;i++)
        {
//yeh array wala h
            start[i]=intervals.get(i).start; //yeh jo Interval class define kri thi wo hai
            end[i]=intervals.get(i).end;
        }

        Arrays.sort(start);
        Arrays.sort(end);
        int i=0,j=0,max=0,rooms=0;
        while(i<n)
        {
            if(start[i]<end[j])
            {
                rooms++;
                max=Math.max(max,rooms);
                i++;
            }
            else
            {
                rooms--;
                j++;
            }
        }
        return max;
    }
}
