class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] obj=new Integer[arr.length];
        for(int i=0;i<arr.length;i++){
            obj[i]=arr[i];
        }
        Arrays.sort(obj,(Integer a,Integer b)->{
            int countA=Integer.bitCount(a);
            int countB=Integer.bitCount(b);
            if(countA!=countB)
                return countA-countB;
            else
                return a-b;
        });
        for(int i=0;i<arr.length;i++){
            arr[i]=obj[i];
        }
        return arr;
    }
}
