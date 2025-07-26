class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalcost = 0;
        int start = 0;
        int fuel = 0;

        for(int i=0;i<cost.length;i++){
            int gain = gas[i]-cost[i];
            totalcost += gain;
            fuel +=gain;

            if(fuel<0){
                start = i+1; 
                fuel=0;
            }  
        }
        if(totalcost>=0)return start;
        
        return -1;
    }
}