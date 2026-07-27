class Solution {
    class Pair{
        int position;
        int speed;
        Pair(int position,int speed){
            this.position=position;
            this.speed=speed;
        }
    }
    public int carFleet(int target, int[] position, int[] speed) {
        Pair[] cars=new Pair[position.length];
        for(int i=0;i<position.length;i++)
        {
            cars[i]=new Pair(position[i],speed[i]);
        }
        Arrays.sort(cars,(a,b) -> a.position-b.position);
        Stack<Double> st=new Stack<>();
        for(int i=cars.length-1;i>=0;i--){
            double time=(double)(target-cars[i].position)/(double)cars[i].speed;
            if(st.isEmpty() || time>st.peek())
            {
                st.push(time);
            }
        }
        return st.size();
        }
}
