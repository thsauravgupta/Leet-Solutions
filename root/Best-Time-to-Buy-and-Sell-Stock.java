class Solution {
    public int maxProfit(int[] prices) {
        int p=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            min=Math.min(min,prices[i]);
            p=Math.max(p,prices[i]-min);
        }
        return p;
    }
}