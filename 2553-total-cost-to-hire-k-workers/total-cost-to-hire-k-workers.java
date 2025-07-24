class Solution {
    public long totalCost(int[] costs, int k, int c) {
        PriorityQueue<Integer> c1 = new PriorityQueue<>();
        PriorityQueue<Integer> c2 = new PriorityQueue<>();

        int l =0,r =costs.length-1;
        while(c1.size()< c && l<=r){
            c1.offer(costs[l++]);
        }
        while(c2.size()<c && l<=r){
            c2.offer(costs[r--]);
        }
        long cost = 0;

        while(k-- >0){
            if(!c1.isEmpty() && (c2.isEmpty() || c1.peek()<=c2.peek())){
                cost+=c1.poll();
                if(l<=r)
                    c1.offer(costs[l++]);
            }else{
                cost += c2.poll();
                if(l<=r)
                    c2.offer(costs[r--]);
                }
            }
        
        return cost;
    }
}